package fr.ynov.java.medium;

public class Square {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println(square(num));
    }

    public static int square(int num) {
        return num * num;
    }
}
