package Version1;

import java.util.ArrayList;
import java.util.List;

public class PetClinic {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Cat("cat1", 3, "Female", "Brown"));
        pets.add(new Cat("cat2", 1, "Male", "Black"));
        pets.add(new Dog("dog1", 2, "Male", "Poodle"));
        pets.add(new Dog("dog2", 0, "Male", "Bulldog"));
        List<Veterinarian> Veterinarians = new ArrayList<>();
        Veterinarians.add(new GeneralVeterinarian("Dan"));
        Veterinarians.add(new GeneralVeterinarian("Ben"));
        Veterinarians.add(new SpecialistVeterinarian("Dog Specialist"));
        Veterinarians.add(new SpecialistVeterinarian("Cat Specialist"));

        for(Pet pet : pets){
            System.out.println(pet.makeSound());
            System.out.println(pet.eat());
        }

        for (Veterinarian veterinarian : Veterinarians) {
            if (veterinarian instanceof SpecialistVeterinarian)
                System.out.println(((SpecialistVeterinarian) veterinarian).getSpecialty());
            else System.out.println(veterinarian.getName());
            System.out.println("-----------------------");

            for (Pet pet : pets) {
                System.out.println(pet);
                if (pet instanceof Cat)
                    System.out.println("The cat color:" +((Cat) pet).getColor());
                else System.out.println("The dog breed: " +((Dog)pet).getBreed());
                System.out.println(veterinarian.examinePet(pet));
            }
        }



    }
}
