package week4.breo;
/**
 * A subclass of {@link Person} that adds a {@link Address} attribute
 */
public class PersonWithAddress extends Person {
    public Address address;

    /**
     * Constructor that initilises the super class {@link Person}, and {@link #address} attribute 
     * @param name 
     * @param age
     * @param email
     * @param city
     * @param street
     * @param state
     * @param zipCode
     */
    public PersonWithAddress(String name, int age, String email, String city, 
        String street, String state, String zipCode){
            super(name, age, email);
            address = new Address(city, street, state, zipCode);
    }
    /**
     * Introduces the person with their name, age and address
     */
    @Override
    public void introduceYourself(){
        System.out.println("Hello, my name is "+getName()+" and I am "+getAge()+" years old.");
        System.out.println("I live at "+address.getStreet()+", "+address.getCity()+", "+
                            address.getState()+" "+address.getZipCode());
    }

    /**
     * Testing the Class 
     * @param args
     */
    public static void main(String[] args) {
        PersonWithAddress p1 = new PersonWithAddress("Helga", 37, "helga@hotmail.com",
             "Lalitpur", "Krishna Galli", "Bagmati", "6600AA");
        
        p1.introduceYourself();
        p1.address.setCity("Kathmandu");
        p1.introduceYourself();
    }

}
