package com.company;

public class Main<X extends Comparable<X>,Y extends Comparable<X>,Z extends Comparable<X>> {
    private X x;
    private Y y;
    private Z z;

    Main(X x, Y y, Z z) {
        this.x = x;
        this.y = y;
        this.z = z;
        testMaximum(x, y, z);
    }

    public static void main(String[] args) {
        System.out.println("Find Maximum Problem Using Generics");
        Main main = new Main(1, 2, 3);
        System.out.println(main.max(7, 9, 11));
        System.out.println(main.max(2.1f, 11.1f, 20.7f));
        System.out.println(main.max("Zebra", "Zecll", "ZyCat"));
    }

    <T extends Comparable<X>> T testMaximum(X x, Y y, Z z) {
        T ans = x.compareTo((X)y)>=1?(T)x:(T)y;
        ans=ans.compareTo((X)z)>=1?ans:(T)z;
        System.out.println(ans);
        return ans;
    }

    public <T extends Comparable<T>> T max(T num1, T num2, T num3) {
        T ans = num1.compareTo(num2) >= 1 ? num1 : num2;
        ans = ans.compareTo(num3) >= 1 ? ans : num3;
        return ans;
    }
}
