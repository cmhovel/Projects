package GogiMeIntellij;

import java.time.LocalDate;
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
        this.meetupsList.add(newMeetup);
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












}
