package com.company;

public class Lec8_toString {
    public static void main(String[] args) {
        Character c = 'x' ; //
        //System.out.println(c.toString());

        Person sokratis = new Person("Sokratis", "Sofianopoulos");

        System.out.println(sokratis.name + " " + sokratis.lastName);
        System.out.println(sokratis);
        System.out.println(sokratis.toString());
    }
}
