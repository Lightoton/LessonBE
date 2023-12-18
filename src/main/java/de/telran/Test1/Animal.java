package de.telran.Test1;

public class Animal {
    public void say(){

    }
}

class Dog extends Animal {

}

class Cat extends Animal {

}

class Main {
    static void getAnimal(Animal animal) {

    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Dog dog1 = new Dog();
        dog1.say();

    }
}