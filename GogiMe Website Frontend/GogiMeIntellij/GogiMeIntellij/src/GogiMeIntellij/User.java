package GogiMeIntellij;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

/**
 * The base class for all users containing general user information.
 */
public abstract class User {

    private boolean signedIn;
    private String firstName;
    private String lastName;
    private Gender userGender;
    private LocalDate dob;
    private String email;


    private UUID userID;
    private String password;
    private String recoveryKey;
    //URL[ ] socialMedia
    //location currentLocation
    //setting[] notificationSettings
    //setting[] appSettings

    private int[] desiredAgeRange;
    private Gender desiredGender;

    private ArrayList<EmergencyContact> emergencyContacts;
    //picture profilePic
    //pictures[ ] sportingPhotos

    private ArrayList<String> travelLocations;



    /**
     * The main constructor for the class.
     * @param firstName
     * @param lastName
     * @param password
     * @param userGender
     */
    public User(String firstName, String lastName, String password, Gender userGender, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.userGender = userGender;
        this.emergencyContacts = new ArrayList<EmergencyContact>();
        this.desiredAgeRange = new int[] {0, 100};
        this.desiredGender = Gender.NA;
        this.travelLocations = new ArrayList<String>();
        this.signedIn = false;
        this.userID = UUID.randomUUID();
        this.email = email;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Temporary location for the main method.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    /**
     * Returns if the user is currently logged in in a session.
     * @return
     */
    public boolean isSignedIn(){
        return signedIn;
    }

    /**
     * The user logs in.
     */
    public void logIn(){
        signedIn = true;
    }

    /**
     * The user signs out.
     */
    public void logOut(){
        signedIn = false;
    }
    /**
     * Returns the user's first name.
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name.
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the user's gender.
     * @return
     */
    public Gender getUserGender() {
        return userGender;
    }

    /**
     * Sets the user's gender.
     * @param userGender
     */
    public void setUserGender(Gender userGender) {
        this.userGender = userGender;
    }

    /**
     * Returns the user's date of birth.
     * @return
     */
    public LocalDate getDob() {
        return dob;
    }

    /**
     * Returns the user's ID number.
     * @return
     */
    public UUID getUserID() {
        return userID;
    }

    /**
     * Returns the user's password.
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the user's password.
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the user's recovery key.
     * @return
     */
    public String getRecoveryKey() {
        return recoveryKey;
    }

    /**
     * Sets the user's recovery key.
     * @param recoveryKey
     */
    public void setRecoveryKey(String recoveryKey) {
        this.recoveryKey = recoveryKey;
    }

    /**
     * Returns the user's desired age range of users to connect with.
     * @return
     */
    public int[] getDesiredAgeRange() {
        return desiredAgeRange;
    }

    /**
     * Sets the user's desired age range of users to connect with.
     * @param desiredAgeLower
     * @param desiredAgeUpper
     */
    public void setDesiredAgeRange(int desiredAgeLower, int desiredAgeUpper) {
        this.desiredAgeRange[0] = desiredAgeLower;
        this.desiredAgeRange[1] = desiredAgeUpper;
    }

    /**
     * Returns the gender the user wants to connect with.
     * @return
     */
    public Gender getDesiredGender() {
        return desiredGender;
    }

    /**
     * Sets the gender the user wants to connect with.
     * @param desiredGender
     */
    public void setDesiredGender(Gender desiredGender) {
        this.desiredGender = desiredGender;
    }

    /**
     * Returns the list of emergency contacts.
     * @return
     */
    public ArrayList<EmergencyContact> getEmergencyContacts() {
        return emergencyContacts;
    }

    /**
     * Adds a new emergency contact.
     * @param newContact
     */
    public void addEmergencyContact(EmergencyContact newContact){
        emergencyContacts.add(newContact);
    }

    /**
     * Returns the list of travel locations.
     * @return
     */
    public ArrayList<String> getTravelLocations() {
        return travelLocations;
    }

    /**
     * Adds a new location to the list of travel locations if it isn't already there.
     * @param newLocation
     */
    public void addTravelLocation(String newLocation){
        if(!this.travelLocations.contains(newLocation)){
            travelLocations.add(newLocation);
        }
    }

    /**
     * Removes a travel location from the list.
     * @param badLocation
     */
    public void removeTravelLocation(String badLocation){
        travelLocations.remove(badLocation);
    }
}
