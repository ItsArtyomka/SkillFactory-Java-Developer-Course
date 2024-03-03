package TheZoo;

@SuppressWarnings("unused")
public class Zoo {
    TheAnimal[] animals;
    public Zoo(){
        // Creating an empty array with 3 spaces.
        animals = new TheAnimal[3];
        // Filling up the spaces with animals.
        animals[0] = new Dog();
        animals[1] = new Cats();
        animals[2] = new Reptile();
    }
    public void print(){
        // Using foreach loop to iterate through each element of the
        // TheAnimal[] array and print it one by one.
        for( TheAnimal a: animals){
            a.print();
        }
    }

    // Creating a method that allows to "change" the animals in the array.
    public void change(TheAnimal a, int i){
        if (i >= 0 && i < animals.length)
            animals[i] = a;
    }
}
