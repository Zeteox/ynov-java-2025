package fr.ynov.java.easy;

public class ScanMe {
    public static void main(String[] args) {
        System.out.println("What's your name ?: ");
        String name = System.console().readLine();
        System.out.println("And your age ?: ");
        String age = System.console().readLine();
        System.out.println("Hello, " + name + " you are "+ age +" years old !");
    }
}
