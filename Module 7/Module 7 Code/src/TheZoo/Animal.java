package TheZoo;

@SuppressWarnings("unused")

abstract class Animal implements Soundable {
    //---Fields---
    private boolean vegetarian;
    private String eats;

    //---Constructor---
    public Animal() {
    }

    //---Abstract Method---
    abstract void print();

    //---Methods---
    @Override
    public void sound() {
        System.out.println("I am an animal.");
    }

    @Override
    public String toString() {
        return "I am an animal.";
    }


    //---Getters---
    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }
}
