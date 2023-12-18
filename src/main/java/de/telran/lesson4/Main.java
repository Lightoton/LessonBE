package de.telran.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        List<String> list = new ArrayList<>();
        String myStr = "Hello!";
        list.add("As");
        list.add("VA");
        list.add(myStr);
        System.out.println(list);
        System.out.println("Size " + list.size());
        System.out.println(list.get(list.size()-1));

    }
}
