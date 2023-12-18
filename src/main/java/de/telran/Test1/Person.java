package de.telran.Test1;

public class Person {
    String name;
    int age;
    static double temperatureC = 36.6;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        Person p1 = new Person("P1",22);
        Person p2 = new Person("P2",33);
        System.out.println(p1.age);
        System.out.println(p2.name);
        double temperature = temperatureC;
        Person.temperatureC = 37.0;
        double temperature2 = temperatureC;
        System.out.println(temperatureC);
        System.out.println(temperature);
        System.out.println(temperature2);


    }
    public void get(){

    }
    public static void set(){

    }
}

