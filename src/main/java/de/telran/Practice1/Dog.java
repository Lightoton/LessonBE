package de.telran.Practice1;

public class Dog {
    private double tail = 0;

    public double getTail() {
        return tail;
    }

    public boolean setTail(double tail) {
        boolean res = false;
        if (tail > 0) {
            this.tail = tail;
            res = true;
        }
        return res;
    }

    public double cutTail() {
        if (tail > 0) {
            tail = tail - 1;
        }
        return tail;
    }
}
//Создайте класс Book с полями title, author и year.
// Затем создайте массив объектов типа Book и заполните его
// несколькими книгами. Напишите метод, который принимает
// массив книг в качестве параметра и выводит информацию о каждой книге.
