package Code.Module.ExtraExercise;

import java.util.*;

public class AnimalExercise {
    public static void main(String[] args) {
        List<Pet> petList = new ArrayList<>();
        // Adding pets to the list.
        petList.add(new Pet("Cat", "Barsik", 2.7));
        petList.add(new Pet("Dog", "Bobik",  5.8));
        petList.add(new Pet("Parrot", "Kesha",  0.5));
        petList.add(new Pet("Dog", "Bob",  2.2));
        petList.add(new Pet("Pig", "Hrew",  9.4));
        petList.add(new Pet("Spider", "William",  0.06));
        petList.add(new Pet("Mouse", "Lu",  0.1));

        // Original Pet Lists
        System.out.println(petList);

        // Sorted Per List and Set

        // By Name Length
        System.out.println("\nSorting by Name Length:");
        petList.sort(new NameLengthComparator());
        System.out.println(petList);

        // By Weight
        Set<Pet> petSet = new TreeSet<>(petList);
        System.out.println("\nSorting by weight:");
        System.out.println(petSet);
    }
}

@SuppressWarnings("unused")
class Pet implements Comparable<Pet>{
    private final String animalBreed ;
    private final String name;
    private double weight;

    public Pet(String animalBreed, String name, double weight) {
        if (animalBreed == null || name == null || weight <= 0){
            throw new IllegalArgumentException();
        }
        this.animalBreed = animalBreed;
        this.name = name;
        this.weight = weight;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "animalBreed='" + animalBreed + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return animalBreed.equals(pet.animalBreed) && name.equals(pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalBreed, name);
    }

    @Override
    public int compareTo(Pet o) {
        return (int) (this.weight - o.weight);
    }
}

// Name Length Comparator (duh)
class NameLengthComparator implements Comparator<Pet>{

    @Override
    public int compare(Pet pet1, Pet pet2) {
        return pet2.getName().length() - pet1.getName().length();
    }
}
