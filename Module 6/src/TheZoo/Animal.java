// This is a superclass Animal that is a parent class
// for child class Cat.

package TheZoo;

@SuppressWarnings("FieldMayBeFinal") // <-- Для красоты кода.

public class Animal {

    //---Constructor---
//     public Animal(){} // Empty constructor is created by java, aka called default constructor

    // Constructor that accepts argument and that could be called by the child class Cat
    // that could call its own argument within Cat's constructor.
    public Animal(boolean veg, String food){
        this.vegetarian = veg;
        this.eats = food;
    }

    //---Fields---
    private boolean vegetarian;
    private String eats;

    //---Methods---
    public void sound(){
    }

    //---Getters---
    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }
}
