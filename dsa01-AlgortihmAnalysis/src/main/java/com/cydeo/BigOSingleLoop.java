package com.cydeo;

public class BigOSingleLoop {
    public static void main(String[] args) {
        long numberOfOperations=0;
        int n=10000;// size of  Data
        int m=500;
        long startTime;
        long endTime;
        System.out.println("Input size n is = "+ n); //Input size n is = 10000

        System.out.println("---------------------------------------------");

        // Task 1 Single Loop................... O(n)
        startTime=System.currentTimeMillis();
        for (int i = 0; i < n ; i++) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Single Loop Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");
                            //Single Loop Number of operations : 10000 in 0 milliseconds

        numberOfOperations=0;

        System.out.println("---------------------------------------------");

        // Task 2 Nested Loops...................
        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n ; i++) {
                numberOfOperations+=1;
            }
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Nested Loop Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");
                            //Nested Loop Number of operations : 100000000 in 16 miliseconds

        System.out.println("---------------------------------------------");

        // Task 3 Three Nested Loops...................
        numberOfOperations=0;
        // Task 3 Triple Nested Loops...................
        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n ; i++) {
                for (int k = 0; k < n; k++) {
                    numberOfOperations+=1;
                }
            }
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Triple Nested Loop Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");
                            //Triple Nested Loop Number of operations : 1000000000000 in 14968 miliseconds

        System.out.println("---------------------------------------------");

        // Task 4 N and M Nested Loops  O(n*m)...................
        numberOfOperations=0;

        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m ; i++) {
                numberOfOperations+=1;
            }
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Nested Loop (n* m) Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");
        //Nested Loop (n* m) Number of operations : 5000000 in 20 miliseconds

        System.out.println("---------------------------------------------");

        // Task 4.5 N and M Consecutive Loops O(n+m)...................
        numberOfOperations=0;

        startTime=System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            numberOfOperations+=1;
        }
        for (int i = 0; i < m ; i++) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();

        System.out.println( "Consecutive Loops O(n+m) Number of operations : "+numberOfOperations + " in "+ (endTime-startTime) +" miliseconds");
        //Consecutive Loops O(n+m) Number of operations : 10500 in 1 miliseconds

        System.out.println("---------------------------------------------");

        // Task 5 Logarithmic Complexity...................
        numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int i = 1; i < n ; i*=2) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println( "Logarithmic Number of operations  : "+numberOfOperations + " in "+ (endTime-startTime) +" milliseconds");
                            //Logarithmic Number of operations  : 14 in 0 milliseconds

    }
}