package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Find Maximum Problem Using Generics");
        Main main = new Main();
        System.out.println(  main.maxOf3Integers(7,9,11));
        System.out.println(main.maxOf3Floats(2.1f,1.1f,0.7f));
    }
    public <T extends Integer> Integer maxOf3Integers(T num1,T num2, T num3){
         Integer ans = num1.compareTo(num2)>=1?num1:num2;
         ans=ans.compareTo(num3)>=1?ans:num3;
         return ans;
    }
    public <T extends Float> Float maxOf3Floats(T num1,T num2, T num3){
        Float ans = num1.compareTo(num2)>=1?num1:num2;
        ans=ans.compareTo(num3)>=1?ans:num3;
        return ans;
    }
}
