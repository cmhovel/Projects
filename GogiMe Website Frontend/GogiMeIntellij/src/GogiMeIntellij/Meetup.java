package GogiMeIntellij;

import java.time.*;
import java.util.ArrayList;

/**
 * The primary focus of the application: scheduled activities the sports enthusiast can participate in with other users.
 */
public class Meetup implements Comparable<Meetup>{
    private String meetupName;
    private String description;
    private String activity;
    private ArrayList<User> host;
    private String location;
    private LocalDate meetupDate;
    private LocalTime meetupTime;

    private Privacy privacy;
    private boolean bkgndChkRqd;
    private int maxAttendence;
    private ArrayList<User> attendees;


    /**
     * The default constructor to create a meetup.
     * @param meetupName
     * @param meetuoHost
     */
    public void Meetup(String meetupName, User meetuoHost){
        this.meetupName = meetupName;
        this.host = new ArrayList<User>();
        this.attendees = new ArrayList<User>();
        this.host.add(meetuoHost);
        this.attendees.add(meetuoHost);
    }

    /**
     * Compares meetups by their date, and if they have the same date, they are compared by their time.
     * @param otherMeetup
     * @return
     */
    @Override
    public int compareTo(Meetup otherMeetup){
        if(this.getDate().compareTo(otherMeetup.getDate()) == 0){
            return this.getTime().compareTo((otherMeetup.getTime()));
        } else{
            return this.getDate().compareTo(otherMeetup.getDate());
        }
    }

    /**
     * Returns the date of the meetup.
     * @return
     */
    public LocalDate getDate(){
        return this.meetupDate;
    }

    /**
     * Returns the time of the meetup.
     * @return
     */
    public LocalTime getTime(){
        return this.meetupTime;
    }

    /**
     * Returns the name of the meetup.
     * @return
     */
    public String getMeetupName() {
        return meetupName;
    }

    /**
     * Sets the name of the meetup.
     * @param meetupName
     */
    public void setMeetupName(String meetupName) {
        this.meetupName = meetupName;
    }

    /**
     * Returns the description of the meetup.
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the meetup.
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the meetup activity.
     * @return
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Sets the meetup activity.
     * @param activity
     */
    public void setActivity(String activity) {
        this.activity = activity;
    }

    /**
     * Gets the location of the meetup.
     * @return
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location of the meetup.
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Returns the hosts of the meetup.
     * @return
     */
    public ArrayList<User> getHost() {
        return host;
    }

    /**
     * Adds a new host of the meetup.
     * @param newHost
     */
    public void addHost(User newHost){
        if(!host.contains(newHost)){
            host.add(newHost);
        }
    }

    /**
     * Removes a host only if they aren't the only host of the meetup.
     * @param badHost
     */
    public void removeHost(User badHost){
        if(host.size() > 1){
            host.remove(badHost);
        }
    }

    /**
     * Returns the privacy of the meetup.
     * @return
     */
    public Privacy getPrivacy() {
        return privacy;
    }

    /**
     * Changes the privacy of the meetup.
     * @param privacy
     */
    public void setPrivacy(Privacy privacy) {
        this.privacy = privacy;
    }

    /**
     * Returns if there is a background check requirement or not.
     * @return
     */
    public boolean isBkgndChkRqd() {
        return bkgndChkRqd;
    }

    /**
     * Sets the need for a background check.
     * @param bkgndChkRqd
     */
    public void setBkgndChkRqd(boolean bkgndChkRqd) {
        this.bkgndChkRqd = bkgndChkRqd;
    }

    /**
     * Returns the max number of people that can attend the meetup.
     * @return
     */
    public int getMaxAttendence() {
        return maxAttendence;
    }

    /**
     * Sets the maxAttendence.
     * @param maxAttendence
     */
    public void setMaxAttendence(int maxAttendence) {
        this.maxAttendence = maxAttendence;
    }

    /**
     * Returns the list of attendees.
     * @return
     */
    public ArrayList<User> getAttendees() {
        return attendees;
    }

    /**
     * If the user isn't already attending, and the max attendence hasn't been reached, adds a new attendee.
     * @param newAttend
     */
    public void addAttendee(User newAttend){
        if(!attendees.contains(newAttend) && attendees.size() < maxAttendence){
            attendees.add(newAttend);
        }
    }

    /**
     * Sets the meetup date.
     * @param meetupDate
     */
    public void setMeetupDate(LocalDate meetupDate) {
        this.meetupDate = meetupDate;
    }

    /**
     * Sets the meetup time.
     * @param meetupTime
     */
    public void setMeetupTime(LocalTime meetupTime) {
        this.meetupTime = meetupTime;
    }


}
