package fr.ynov.java.medium;

import java.time.LocalDate;
import java.util.Date;

enum Nationality {
    ENGLISH,
    FRENCH,
    SPANISH,
}
public class Person {
    String name;
    LocalDate birthDate;
    String gender;
    float height;
    float weight;
    Nationality nationality;

    public Person(String name, String birthDate, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        // birth date format : YYYY-MM-JJ
        this.birthDate = LocalDate.parse(birthDate);
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public void showAttributes() {
        System.out.println(this.name);
        System.out.println(this.birthDate);
        System.out.println(this.gender);
        System.out.println(this.height);
        System.out.println(this.weight);
        System.out.println(this.nationality);
    }

    public int getAge() {
        return LocalDate.now().getYear() - this.birthDate.getYear();
    }

    public static void main(String[] args) {
        Person oui = new Person("lolo","2024-06-14","trans",1.79f,68.9f,Nationality.FRENCH);
        oui.showAttributes();
        System.out.println(oui.getAge());
    }
}
