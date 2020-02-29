package singleton.implementation;

/**
 * Cat class.
 */
public class Cat {

    //static Cat singleton object
    private static Cat cat;

    private String name;
    private String breed;
    private String colour;
    private int age;

    /**
     * Private Cat constructor
     */
    private Cat () {

    }

    /**
     * Gets the singleton Cat instance.
     *
     * @return the Cat instance
     */
    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat();
        }
        return cat;
    }

    /**
     * Gets cats name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets cats name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets cats breed.
     *
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Sets cats breed.
     *
     * @param breed the breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Gets cats colour.
     *
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * Sets cats colour.
     *
     * @param colour the colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * Gets cats age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets cats age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}