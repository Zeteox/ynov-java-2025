package fr.ynov.java.easy;

public class Arrays {
    public static void main(String[] args) {
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        System.out.println(java.util.Arrays.toString(a));
    }
}
