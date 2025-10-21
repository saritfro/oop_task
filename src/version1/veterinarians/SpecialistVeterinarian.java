package version1.veterinarians;
import version1.pets.Pet;

import java.util.Scanner;

public class SpecialistVeterinarian implements Veterinarian {
    Scanner input = new Scanner(System.in);
    private String specialty;

    public SpecialistVeterinarian(String specialty) {
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "SpecialistVeterinarian{" +
                "specialty='" + specialty + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return "The name is unnkown";
    }

    @Override
    public String examinePet(Pet pet) {
        System.out.println("Insert a describing of the examination");
        return "The specialist examination describing:"+input.nextLine();
    }
}
