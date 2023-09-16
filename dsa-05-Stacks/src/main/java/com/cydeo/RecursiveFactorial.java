package com.cydeo;

public class RecursiveFactorial {
    public static void main(String[] args) {
        System.out.println(fact(4));  //24
    }
    public static int fact(int n){
        if(n<=1)
            return 1;
        else
            return n*fact(n-1);
    }
}
