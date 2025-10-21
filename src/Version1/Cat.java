package Version1;

public class Cat extends Pet {
    private String color;

    public Cat(String name, int age, String species, String color) {
        super(name, age, species);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Cat{" +
                super.toString()+
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public String makeSound() {
        return "My sound Meow";
    }

    @Override
    public String eat() {
        return "I eat milk";
    }
}
