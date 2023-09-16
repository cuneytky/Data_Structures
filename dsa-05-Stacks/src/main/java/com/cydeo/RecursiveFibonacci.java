package com.cydeo;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        System.out.println(fib(2));
    }
    public static int fib(int n){
        if(n==0) return 0; //termination
        if(n==1) return 1; //termination
        return fib(n-1) + fib(n-2);
    }
}
//index    : 1 2 3 4 5 6 7  8  9....
//fibonacci: 0-1-2-3-5-8-13-21-34...
// fib(5) !=  4 + 3
// fib(5)  = fib(4) + fib(3)