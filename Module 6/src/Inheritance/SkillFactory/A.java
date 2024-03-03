package Inheritance.SkillFactory;

class A {
    int a = 5;
}

class B extends A {
    int a = 7;
    B(){
        System.out.println(super.a + ", " + this.a);
    }
}

class Main1 {
    public static void main(String[] args) {
        B b = new B();
    }
}
