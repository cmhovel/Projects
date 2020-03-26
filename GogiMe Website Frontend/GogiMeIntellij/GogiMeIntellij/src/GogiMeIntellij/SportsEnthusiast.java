package GogiMeIntellij;

/**
 * Representing the main user of the application, the SportsEnthusiast
 * extends the User class.
 */
public class SportsEnthusiast extends User {

    /**
     * The object encapsulating all of the user's meetup attendences.
     */
    private Schedule schedule;
    // private ArrayList<Devices> devices #todo

    /**
     * Extra information for the user, including favorite things and their skills.
     */
    private UserStats stats;

    /**
     * The main constructor for SportsEnthusiast.
     * @param firstName
     * @param lastName
     * @param password
     * @param userGender
     */
    public SportsEnthusiast(String firstName, String lastName, String password, Gender userGender, String email) {
        super(firstName, lastName, password, userGender, email);
        this.stats = new UserStats();
        this.schedule = new Schedule();
    }

    //public void messageUser(); #todo

    /**
     * Returns the schedule for the user.
     * @return
     */
    public Schedule getSchedule(){
        return schedule;
    }

    /**
     * Returns the user's stats information.
     * @return
     */
    public UserStats getStats(){
        return stats;
    }
}
