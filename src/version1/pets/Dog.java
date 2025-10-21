package version1.pets;

public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String species, String breed) {
        super(name, age, species);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                super.toString()+
                "breed='" + breed + '\'' +
                '}';
    }

    @Override
    public String makeSound() {
        return "My sound Haw Haw";
    }

    @Override
    public String eat() {
        return "I eat meat";
    }
}
