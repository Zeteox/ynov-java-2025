package fr.ynov.java.medium;

import java.util.Date;

enum Nationality {
    ENGLISH,
    FRENCH,
    SPANISH,
}
public class Person {
    String name;
    int age;
    String gender;
    float height;
    float weight;
    Nationality nationality;

    public Person(String name, int age, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public void showAttributes() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
        System.out.println(this.height);
        System.out.println(this.weight);
        System.out.println(this.nationality);
    }

    public static void main(String[] args) {
        Person oui = new Person("lolo",18,"trans",1.79f,68.9f,Nationality.FRENCH);
        oui.showAttributes();
    }
}
