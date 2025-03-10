package fr.ynov.java.medium;

import java.util.Objects;

public class Quality {
    int id;
    String name;

    public Quality(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Quality q = new Quality(1,"a");
        Quality q2 = new Quality(1,"a");

        System.out.println("With '==' : " + (q == q2));
        System.out.println("With 'equal' : " + q.equals(q2));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Quality quality = (Quality) o;
        return id == quality.id && Objects.equals(name, quality.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
