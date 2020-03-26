package GogiMeIntellij;

import java.util.ArrayList;

/**
 * The Advertiser extends the user, and offers products to sell to Sports enthusiasts.
 */
public class Advertiser extends User {
    private String affiliation;
    private ArrayList<Offer> specialOffers;

    /**
     * The primary constructor of the advertiser class.
     * @param firstName
     * @param lastName
     * @param password
     * @param userGender
     * @param affiliation
     */
    public Advertiser(String firstName, String lastName, String password, Gender userGender, String email, String affiliation) {
        super(firstName, lastName, password, userGender, email);
        this.affiliation = affiliation;
    }

    /**
     * Creates a new offer.
     * @param newOffer
     */
    public void createOffer(Offer newOffer){
        specialOffers.add(newOffer);
    }

    //public void createResource() #todo

    /**
     * Returns the special offers list.
     * @return
     */
    public ArrayList<Offer> getSpecialOffers(){
        return specialOffers;
    }

    /**
     * Returns the affiliation of the advertiser.
     * @return
     */
    public String getAffiliation() {
        return affiliation;
    }

    /**
     * Sets the affiliation of the user.
     * @param affiliation
     */
    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }
}
