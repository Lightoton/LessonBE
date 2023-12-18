package de.telran.Summary1;

import com.github.javafaker.Faker;

import java.util.Random;

public class Generator {
    private static final Faker FAKER = new Faker();

    private static final Random RANDOM = new Random();

    private static Condition randomConditionGen() {
        Condition[] conditions = Condition.values();
        int index = RANDOM.nextInt(3);
        return conditions[index];
    }

    private static boolean isEBOOKRandomGen() {
        boolean[] isEbook = {true, false};
        int index = RANDOM.nextInt(2);
        return isEbook[index];
    }

    public static Book[] bookGenerator(int bookNumbers) {
        Book[] books = new Book[bookNumbers];
        for (int i = 0; i < bookNumbers; i++) {
            boolean isEB = isEBOOKRandomGen();
            books[i] = new Book(FAKER.book().author(),
                    FAKER.book().title(),
                    bookIssueDate(),
                    randomConditionGen(),
                    isEB);

        }
        return books;

    }

    private static int bookIssueDate() {
        return RANDOM.nextInt(2022 - 1900) + 1900;
    }

    public static Library[] libraryGen(){
        Library[] libraries = new Library[5];
        int bookNum = 20;
        for (int i = 0; i < libraries.length; i++) {
            libraries[i] = new Library(FAKER.address().streetAddress(),bookNum,bookGenerator(bookNum));
        }
        return libraries;
    }
}
