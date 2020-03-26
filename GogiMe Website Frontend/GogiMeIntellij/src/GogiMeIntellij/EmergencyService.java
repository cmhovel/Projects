package GogiMeIntellij;

/**
 * The Emergency Services class extends User. Has the ability to locate other users and message them.
 */
public class EmergencyService extends User{
    /**
     * The affiliation is the city or company the EMS user works for.
     */
    private String affiliation;

    /**
     * The main constructor for the EMS User.
     * @param firstName
     * @param lastName
     * @param password
     * @param userGender
     * @param affiliation
     */
    public EmergencyService(String firstName, String lastName, String password, Gender userGender, String affiliation) {
        super(firstName, lastName, password, userGender);
        this.affiliation = affiliation;
    }

    /**
     * Returns the affiliation.
     * @return
     */
    public String getAffiliation() {
        return affiliation;
    }

    /**
     * Sets the affiliation.
     * @param affiliation
     */
    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    /*public User viewUser(String userID){
        return #todo
    }*/

    // public void createResource() #todo

    //public void messageUser(User) #todo
}
