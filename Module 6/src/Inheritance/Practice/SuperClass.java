package Inheritance.Practice;

public class SuperClass {
    int num = 88;

    public void display() {
        System.out.println("Это метод display() суперкласса");
    }

}

class SubClass extends SuperClass {
    int num = 77;

    // Метод display() подкласса
    public void display() {
        System.out.println("Это метод display() подкласса");
    }

    public void myMethod() {
        // Вызываем метод display() подкласса
        this.display();

        // Вызываем метод display() суперкласса
        super.display();

        // Выводим значение переменной num подкласса
        System.out.println("Значение переменной num в подклассе: " + this.num);

        // Выводим значение переменной num суперкласса
        System.out.println("Значение переменной num в суперклассе: " + super.num);
    }

    public static void main(String args[]) {
        SubClass obj = new SubClass();
        obj.myMethod();
    }
}
