package fr.ynov.java.easy;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(System.console().readLine());
        if (num % 2 == 0) {
            System.out.println("Even");
            return;
        }
        System.out.println("Odd");
    }
}
