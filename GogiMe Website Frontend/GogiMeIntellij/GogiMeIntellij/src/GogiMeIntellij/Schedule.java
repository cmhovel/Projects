package GogiMeIntellij;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

/**
 * A class keeping track of all the user's meetups, past, present, future, and interested.
 */
public class Schedule{

    private ArrayList<Meetup> meetupsList;
    private ArrayList<Meetup> interestedMeetups;
    private ArrayList<Meetup> invitedMeetups;

    /**
     * Initializes the different lists.
     */
    public Schedule(){
        meetupsList = new ArrayList<Meetup>();
        interestedMeetups = new ArrayList<Meetup>();
        invitedMeetups = new ArrayList<Meetup>();

    }

    /**
     * Adds the meetups to
     * @param newMeetup
     */
    public void addMeetup(Meetup newMeetup){
        if(!meetupsList.contains(newMeetup)){
          this.meetupsList.add(newMeetup);
        }
        Collections.sort(this.meetupsList, Collections.reverseOrder());
    }

    /**
     * If there are meetups in the user's interested or invited meetups lists that have already occurred, they are removed from the list.
     */
    public void removeOutdatedMeetups(){
        LocalDate todayDate = LocalDate.now();
        for(Meetup meetup : invitedMeetups){
            if(todayDate.compareTo(meetup.getDate()) > 0){
                invitedMeetups.remove(meetup);
            }
        }
        for(Meetup meetup: invitedMeetups){
            if(todayDate.compareTo(meetup.getDate()) > 0){
                interestedMeetups.remove(meetup);
            }
        }
    }

    /**
     * If it isn't already there, adds a meetup to the user's list of interested meetups.
     * @param meetup
     */
    public void addInterestedMeetup(Meetup meetup){
        if (!interestedMeetups.contains(meetup)) {
            interestedMeetups.add(meetup);
        }
    }

    /**
     * Creates a new meetup.
     * @param meetupName
     * @param meetupHost
     * @param activity
     * @param date
     * @param time
     * @param privacy
     */
    public void createMeetup(String meetupName, User meetupHost, Activity activity, LocalDate date, LocalTime time, Privacy privacy){
      Meetup newMeetup = new Meetup(meetupName, meetupHost, activity, date, time, privacy);
      meetupsList.add(newMeetup);
      //#todo add to central application list of all meetups.
      Collections.sort(this.meetupsList, Collections.reverseOrder());
    }












}
