package GogiMeIntellij;

/**
 * An article or guide for Sports Enthusiasts to read created by advertisers, admins, or EMS users.
 */
public class Resource {
    private String name;
    private String type; //Make enum? #todo
    private int targtAgeLow;
    private int targtAgeHigh;
    private Gender targtGender;
    private String description;
    //private String content #todo how to implement?

    /**
     * Constructor requiring the name of the resource and its type.
     * @param name
     * @param type
     */
    public Resource(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Returns the name of the resource.
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the resource
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the type of resource.
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * Returns an array with the target age range for the audience
     * {lower, higher}
     * @return
     */
    public int[] getTargtAgeLow() {
        int[]  targetAgeRange = {targtAgeLow, targtAgeHigh};
        return targetAgeRange;
    }

    /**
     * Sets the target age range.
     * @param targtAgeLow
     * @param targtAgeHigh
     */
    public void setTargtAge(int targtAgeLow, int targtAgeHigh) {
        this.targtAgeLow = targtAgeLow;
        this.targtAgeHigh = targtAgeHigh;
    }


    /**
     * Returns the target gender.
     * @return
     */
    public Gender getTargtGender() {
        return targtGender;
    }

    /**
     * Sets the targetGender.
     * @param targtGender
     */
    public void setTargtGender(Gender targtGender) {
        this.targtGender = targtGender;
    }

    /**
     * Returns the description of the resource.
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the resource.
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
