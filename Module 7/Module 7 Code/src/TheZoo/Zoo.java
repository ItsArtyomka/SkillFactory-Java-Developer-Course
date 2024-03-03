package TheZoo;

@SuppressWarnings("CastCanBeRemovedNarrowingVariableType")

public class Zoo {
    Soundable[] objects;

    public Zoo() {
        objects = new Soundable[3];
        objects[0] = new Dog();
        objects[1] = new PopcornStall();
        objects[2] = new Reptile();
    }

    public void sound() {
        for (Object a : objects) {
            if (a instanceof Soundable)
                ((Soundable) a).sound(); // OR a.sound() also works.
        }
    }

    public void print() {
        for (Object a : objects) {
            System.out.println(a);
        }
    }
}
