package week4.breo;
/**
 * A class made to store address with attributes:
 * <ul>
 * <li>String {@link #city}</li>
 * <li>String {@link #street}</li>
 * <li>String {@link #state}</li>
 * <li>String {@link #zipCode}</li>
 * </ul>
 */
public class Address {
    private String city;
    private String street;
    private String state;
    private String zipCode;
    /**
     * Sets the value of the city
     * @param city
     */
    public void setCity(String city){this.city = city;}
    /** @return The city string of address */
    public String getCity(){return this.city;}
    /**
     * Sets the street name
     * @param street
     */
    public void setStreet(String street){this.street = street;}
    /** @return The street name from address */
    public String getStreet(){return this.street;}
    /**
     * Sets the state name
     * @param state
     */
    public void setState(String state){this.state = state;}
    /** @return The value of state string */
    public String getState(){return this.state;}
    /**
     * Sets the zipcode
     * @param zipCode
     */
    public void setZipCode(String zipCode){this.zipCode = zipCode;}
    /** @return The zip code from the address object */
    public String getZipCode(){return this.zipCode;}
    /**
     * Constructor for Address class
     * @param city 
     * @param street
     * @param state
     * @param zipCode
     */
    public Address(String city, String street, String state, String zipCode){
        setCity(city);
        setState(state);
        setStreet(street);
        setZipCode(zipCode);
    }
}
