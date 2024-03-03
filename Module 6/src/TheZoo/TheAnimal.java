// This is a practice class with example code that is used to learn about
// dynamic polymorphism and how it works in java.

package TheZoo;

class TheAnimal {
    public void print(){}
    //...
}

class Mammal extends TheAnimal {
    //...
}

class Reptile extends TheAnimal {
    public void print(){
        System.out.println("I am a TheZoo.Reptile");
    }
    //...
}

class Dog extends Mammal {
    public void print(){
        System.out.println("I am a TheZoo.Dog");
    }
    //...
}

class Cats extends Mammal {

    public void print(){
        System.out.println("I am a Cat");
    }
    //...
}


@SuppressWarnings("ConstantValue")
class Test{
    public static void main(String[] args) {

        TheAnimal c = new Cats();
        TheAnimal r = new Reptile();
        TheAnimal d = new Dog();

        // Operator "instanceof" is used to determine that object is an instance of the specified type
        // in this case the instance of classes TheAnimal, Mammal, an Dog.
        System.out.println(c instanceof TheAnimal); // true
        System.out.println(r instanceof Mammal); // false
        System.out.println(d instanceof Dog); // true
        d.print(); // Calling a method from a variable, this method is a virtual.
    }
}
