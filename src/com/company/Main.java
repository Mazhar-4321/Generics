package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Find Maximum Problem Using Generics");
        Main main = new Main();
        System.out.println(main.max(7, 9, 11));
        System.out.println(main.max(2.1f, 11.1f, 20.7f));
        System.out.println(main.max("Zebra", "Zecll", "ZyCat"));
    }

    public <T extends Comparable<T>> T max(T num1, T num2, T num3) {
        T ans = num1.compareTo(num2) >= 1 ? num1 : num2;
        ans = ans.compareTo(num3) >= 1 ? ans : num3;
        return ans;
    }
}
