package GogiMeIntellij;

/**
 * The user that manages the application.
 */
public class Admin extends User{
    private int adminLevel;

    /**
     *  Constructor
     * @param firstName
     * @param lastName
     * @param password
     * @param userGender
     * @param adminLevel
     */
    public Admin(String firstName, String lastName, String password, Gender userGender, int adminLevel){
        super(firstName, lastName, password, userGender);
        this.adminLevel = adminLevel;
    }

    /**
     *
     * @return
     */
    public int getAdminLevel() {
        return adminLevel;
    }

    /**
     *
     * @param adminLevel
     */
    public void setAdminLevel(int adminLevel) {
        this.adminLevel = adminLevel;
    }


}
