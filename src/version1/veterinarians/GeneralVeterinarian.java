package version1.veterinarians;
import version1.pets.Pet;

import java.util.Scanner;

public class GeneralVeterinarian implements Veterinarian {
    Scanner input = new Scanner(System.in);

    private String name;

    public GeneralVeterinarian(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "GeneralVeterinarian{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public String examinePet(Pet pet) {
        System.out.println("Insert a describing of the examination");
        return "The general examination describing:"+input.nextLine();
    }
}
