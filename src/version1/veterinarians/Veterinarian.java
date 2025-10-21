package version1.veterinarians;

import version1.pets.Pet;

/**
 * Interface representing a Veterinarian.
 * Defines the basic actions a veterinarian can perform.
 */
public interface Veterinarian {

    /**
     * Returns the veterinarian's name.
     *
     * @return the name of the veterinarian
     */
    String getName();

    /**
     * Examines a given pet and returns a description of the examination.
     *
     * @param pet the pet to be examined
     * @return a string describing the examination outcome
     */
    String examinePet(Pet pet);
}
