package GogiMeIntellij;

import java.util.ArrayList;

/**
 * A class extending Advertiser meant to interact with sports enthusiasts.
 */
public class ProfessionalService extends Advertiser {
    private Schedule schedule;
    private ArrayList<User> clients;
    private ArrayList<Skill> skills;
    private ArrayList<Activity> activities;

    /**
     * The main constructor for the professional service user.
     * @param firstName
     * @param lastName
     * @param password
     * @param userGender
     * @param affiliation
     */
    public ProfessionalService(String firstName, String lastName, String password, Gender userGender, String affiliation) {
        super(firstName, lastName, password, userGender, affiliation);
        schedule = new Schedule();
        clients = new ArrayList<User>();
        skills = new ArrayList<Skill>();
        activities = new ArrayList<Activity>();
    }

    /**
     * Returns the list of the activities the PS user offers training in.
     * @return
     */
    public ArrayList<Activity> getActivities() {
        return activities;
    }

    /**
     * Removes an activity form the list.
     * @param rmvActivity
     */
    private void removeActivity(Activity rmvActivity){
        activities.remove(rmvActivity);
    }

    /**
     * If it isn't already in the list, adds a new activity to their list of activities.
     * @param newActivity
     */
    private void addActivity(Activity newActivity){
        if(!activities.contains(newActivity)){
            activities.add(newActivity);
        }
    }

    /**
     * Returns the PS user's schedule.
     * @return
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Returns the list of the PS's clients.
     * @return
     */
    public ArrayList<User> getClients() {
        return clients;
    }

    /**
     * Returns the list of the PS's skills.
     * @return
     */
    public ArrayList<Skill> getSkills() {
        return skills;
    }

    /**
     * Adds a client to the list if they aren't already on it.
     * @param newClient
     */
    public void addClient(User newClient){
        if(!clients.contains(newClient)){
            clients.add(newClient);
        }
    }

    /**
     * Removes a client from the list.
     * @param rmvClient
     */
    public void removeClient(User rmvClient){
        clients.remove(rmvClient);
    }

    /**
     * Adds a new skill to the skill list.
     * (There is no safeguard against duplicates)
     * @param newSkill
     */
    private void addSkill(Skill newSkill){
        skills.add(newSkill);
    }

    /**
     * Removes a skill from the list.
     * @param rmvSkill
     */
    private void removeSkill(Skill rmvSkill){
        skills.remove(rmvSkill);
    }
}
