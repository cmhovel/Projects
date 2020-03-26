package GogiMeIntellij;

import java.util.ArrayList;

/**
 * The userStats class is a wrapper class for various information about a sportsEnthusiast user.
 */
public class UserStats {
    /**
     * A list of the user's friends.
     */
    private ArrayList<User> friends;
    /**
     * A list of the user's skills
     */
    private ArrayList<Skill> madSkillz;
    // private growthStat personal growth #todo
    private Activity favoriteActivity;
    private ArrayList<Activity> activities;
    private ArrayList<Meetup> topParticipations;
    private ArrayList<Meetup> attendedMeetups;
    private ArrayList<String> gear;

    /**
     * Constructor initializing all of the lists.
     */
    public UserStats() {
        this.topParticipations = new ArrayList<Meetup>();
        this.friends = new ArrayList<User>();
        this.madSkillz = new ArrayList<Skill>();
        this.activities = new ArrayList<Activity>();
        this.attendedMeetups = new ArrayList<Meetup>();
        this.gear = new ArrayList<String>();
    }

    /**
     * Add a new meetup to the attended meetups.
     * @param newMeetup
     */
    private void addAttendedMtp(Meetup newMeetup){
        attendedMeetups.add(newMeetup);
    }

    /**
     * Adds a new gear to their equipment list.
     * @param newGear
     */
    private void addGear(String newGear){
        gear.add(newGear);
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
     * Removes and activity to the list.
     * @param rmvActivity
     */
    private void removeActivity(Activity rmvActivity){
        activities.remove(rmvActivity);
    }

    /**
     * Adds a new skill to the skill list.
     * (There is no safeguard against duplicates)
     * @param newSkill
     */
    private void addSkill(Skill newSkill){
        madSkillz.add(newSkill);
    }

    /**
     * Removes a skill from the skill list.
     * @param rmvSkill
     */
    private void removeSkill(Skill rmvSkill){
        madSkillz.remove(rmvSkill);
    }

    /**
     * Adds a friend to the friend list, if they aren't already there.
     * @param newFriend
     */
    private void addFriend(User newFriend){
        if(!friends.contains(newFriend)) {
            friends.add(newFriend);
        }
    }

    /**
     * Removes a friend from the friend list.
     * @param badFriend
     */
    private void removeFriend(User badFriend){
        friends.remove(badFriend);
    }

    /**
     * Returns the user's favorite activity.
     * @return
     */
    public Activity getFavoriteActivity() {
        return favoriteActivity;
    }

    /**
     * Sets the favorite activity.
     * @param favoriteActivity
     */
    public void setFavoriteActivity(Activity favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    /**
     * Returns the friend list.
     * @return
     */
    public ArrayList<User> getFriends() {
        return friends;
    }

    /**
     * Returns the skill list.
     * @return
     */
    public ArrayList<Skill> getMadSkillz() {
        return madSkillz;
    }

    /**
     * Returns the activity list.
     * @return
     */
    public ArrayList<Activity> getActivities() {
        return activities;
    }

    /**
     * Returns the topParticipation list.
     * @return
     */
    public ArrayList<Meetup> getTopParticipations() {
        return topParticipations;
    }

    /**
     * Returns the list of attended meetups.
     * @return
     */
    public ArrayList<Meetup> getAttendedMeetups() {
        return attendedMeetups;
    }

    /**
     * Returns the list of gear.
     * @return
     */
    public ArrayList<String> getGear() {
        return gear;
    }

    /**
     * Replaces a topParticipation with a new one.
     * #todo need a comparison method between participations to determine when one is "better" than the other.
     * @param oldPar
     * @param newPar
     */
    public void replaceTopParticipation(Meetup oldPar, Meetup newPar){
        for(Meetup meetup : this.topParticipations){
            if(meetup.equals(oldPar)){
                meetup = newPar;
            }
        }
    }
}
