package GogiMeIntellij;

/**
 * An emergency contact that users may have on there profile to contact in case of emergency.
 */
public class EmergencyContact{
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String emailAdd;
    private String address;

    /**
     * The main constructor of the contact.
     * @param firstName
     * @param lastName
     * @param phoneNum
     */
    public EmergencyContact(String firstName, String lastName, String phoneNum){
        this.phoneNum = phoneNum;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Returns the first name of the contact.
     * @return
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * Returns the last name of the contact.
     * @return
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Returns the phone number of the contact.
     * @return
     */
    public String getPhoneNum(){
        return phoneNum;
    }

    /**
     * Sets the phone number of the contact.
     * @param newPhoneNum
     */
    public void setPhoneNum(String newPhoneNum){
        phoneNum = newPhoneNum;
    }

    /**
     * Returns the email address of the contact.
     * @return
     */
    public String getEmailAdd(){
        return emailAdd;
    }

    /**
     * Sets the contact email.
     * @param newEmailAdd
     */
    public void setEmailAdd(String newEmailAdd){
        emailAdd = newEmailAdd;
    }

    /**
     * Returns the address of the contact.
     * @return
     */
    public String getAddress(){
        return address;
    }

    /**
     * Sets the address of the contact.
     * @param newAddress
     */
    public void setAddress(String newAddress){
        address = newAddress;
    }






}
