package builder.implementation;

/**
 * Dog class, can only instantiate objects
 * through the use of the defined DogBuilder.class
 *
 * @author Brandon Nolan
 * @link builder.implementation.Dog.DogBuilder  DogBuilder.class
 */
public class Dog {
    private final String name;
    private final String breed;
    private final String colour;
    private final String eyeColour;
    private final String size;
    private final int age;

    /**
     * Private Dog constructor, only accessible through the static DogBuilder
     *
     * @param builder
     */
    private Dog(DogBuilder builder) {
        this.name = builder.name;
        this.breed = builder.breed;
        this.colour = builder.colour;
        this.eyeColour = builder.eyeColour;
        this.size = builder.size;
        this.age = builder.age;
    }

    /**
     * Static dog builder function.
     *
     * @return the dog builder
     */
    public static DogBuilder builder() {
        return new DogBuilder();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                ", eyeColour='" + eyeColour + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * DogBuilder, used to build Dogs
     */
    public static class DogBuilder {

        private String name;
        private String breed;
        private String colour;
        private String eyeColour;
        private String size;
        private int age;

        /**
         * Build a dog.
         *
         * @return the dog
         */
        public Dog build() {
            return new Dog(this);
        }

        /**
         * Name of the dog.
         *
         * @param name the dogs name
         * @return the dog builder
         */
        public DogBuilder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Breed of the dog.
         *
         * @param breed the breed
         * @return the dog builder
         */
        public DogBuilder breed(String breed) {
            this.breed = breed;
            return this;
        }

        /**
         * Colour of the dog.
         *
         * @param colour the dogs colour
         * @return the dog builder
         */
        public DogBuilder colour(String colour) {
            this.colour = colour;
            return this;
        }

        /**
         * Size of the dog.
         *
         * @param size the dogs size
         * @return the dog builder
         */
        public DogBuilder size(String size) {
            this.size = size;
            return this;
        }

        /**
         * Eye colour of the dog.
         *
         * @param eyeColour the dogs eye colour
         * @return the dog builder
         */
        public DogBuilder eyeColour(String eyeColour) {
            this.eyeColour = eyeColour;
            return this;
        }

        /**
         * Age of the dog.
         *
         * @param age the dogs age
         * @return the dog builder
         */
        public DogBuilder age(int age) {
            this.age = age;
            return this;
        }
    }
}