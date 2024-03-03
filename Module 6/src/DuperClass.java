// Classes from the lesson
// Example code to learn about overriding.
public class DuperClass {
    public int a;
    public int b;

    DuperClass(int a) {
        this.a = 15;
        this.b = 33;
    }

    public int add(int v) {
        this.a += v;
        return a;
    }
}
class SubClass extends DuperClass {
    SubClass(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public int add(int v) {
        return super.add(v) + a;
    }

    public static void main(String[] args) {
        SubClass s = new SubClass(10, 12);
        System.out.println(s.a);
        System.out.println(s.add(10));
    }
}
