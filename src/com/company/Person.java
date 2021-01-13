package com.company;

public class Person {
    String name;
    String lastName;

    public Person() {

    }
    public Person (String name, String lastName) {
        this.name = name;
        this.lastName = name;
    }

    public String toString() {
        return this.lastName+ " " + this.name;
    }
}
