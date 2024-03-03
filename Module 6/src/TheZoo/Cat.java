package TheZoo;

// Creating subclass Cat that inherits from parent class Animal
public class Cat extends Animal {

    // This constructor calls the constructor from the superclass Animal
    // which allows the Cat constructor to "set" its own arguments
    public Cat(){
        super(false,"milk and meat");
    }

    // This method overrides the parent's sound() method
    public void sound() {
        System.out.println("Meow");
    }

}
