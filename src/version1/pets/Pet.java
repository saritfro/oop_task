package version1.pets;
/**
 * Abstract class representing a generic Pet.
 * This class provides common properties and methods for all pets.
 */

public abstract class Pet {
    private String name;
    private int age;
    protected String species;

    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + "', ";
    }
    /**
     * Abstract method to be implemented by subclasses.
     * Represents the sound the pet makes.
     *
     * @return a string representing the pet's sound
     */
    public abstract String makeSound() ;
    /**
     * Abstract method to be implemented by subclasses.
     * Represents what the pet eats.
     *
     * @return a string describing the pet's food
     */
    public abstract String eat() ;
}
