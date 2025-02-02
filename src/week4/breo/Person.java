package week4.breo;
/**
 * A person call with following private attributes:
 * <ul>
 * <li>String {@link #name}</li>
 * <li>int {@link #age}</li>
 * <li>String {@link #email}</li>
 * </ul>
 * All attributes have their corresponding getter and setter methods.<br>
 * There is a constructor {@link #Person(String, int, String) Person} and
 * a method that displays the person's name and age: {@link #introduceYourself()}
 */
public class Person {
    private String name;
    private int age;
    private String email;
    /**
     * Setter method for name
     * @param name
     */
    public void setName(String name){this.name = name;}
    /**
     * 
     * @return Name of the person object
     */
    public String getName(){return this.name;}
    /**
     * Sets the age of person
     * @param age
     */
    public void setAge(int age){this.age = age;}
    /** @return Age of the person object */
    public int getAge(){return this.age;}
    /**
     * Sets the email of the person
     * @param email
     */
    public void setEmail(String email){this.email = email;}
    /** @return Email of the person */
    public String getEmail(){return this.email;}
    /**
     * Constructor for the Person class
     * @param name Name of the person
     * @param age Age of the person
     * @param email Email of the person
     */
    public Person(String name, int age, String email){
        setName(name);
        setAge(age);
        setEmail(email);
    }
    /**
     * Introduces the person with their name and age
     */
    void introduceYourself(){
        System.out.println("Hello, my name is "+this.name+" and I am "+this.age+" years old");
    }

    /**
     * Static function to test the Person class
     * @param args
     */
    public static void main(String[] args) {
        Person p1 = new Person("Allen", 21, "allen.smith@yahoo.com");
        p1.introduceYourself();
        p1.setAge(87);
        p1.introduceYourself();
        System.out.println(p1.getName()+"'s email is "+p1.getEmail());
    }
    
}
