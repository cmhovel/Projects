package GogiMeIntellij;

/**
 * A class describing the endurance levels of a skill.
 */
public class Skill {
    private String name;
    private Activity activity;
    private int enduranceLevel;

    /**
     * Constructor
     * @param name
     * @param activity
     * @param enduranceLevel
     */
    public Skill(String name, Activity activity, int enduranceLevel){
        this.name = name;
        this.activity = activity;
        this.enduranceLevel = enduranceLevel;
    }

    /**
     * Returns the endurance level of the skill.
     * @return
     */
    public int getEnduranceLevel() {
        return enduranceLevel;
    }

    /**
     * Sets the endurance level of the skill.
     * @param enduranceLevel
     */
    public void setEnduranceLevel(int enduranceLevel) {
        this.enduranceLevel = enduranceLevel;
    }

    /**
     * Returns the name of the skill.
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the activity level of the skill.
     * @return
     */
    public Activity getActivity() {
        return activity;
    }
}
