package de.telran.lesson2;

public class Task1 {
    public static void main(String[] args) {
        B b = new B("Ivan", "Karas");

    }

}

class A {
    public A(String name) {
        System.out.println("Constructor A has been executed " + name);
    }
}

class B extends A {
    public B(String name, String secondName) {
        super(name);
        System.out.println("Constructor B has been executed " + name + " " + secondName);
    }


}