package com.cydeo.ReviewStackRecursion;

import java.util.Stack;

public class GStackTestApp {
    public static void main(String[] args) {

        GStack<Integer> myStack=new GStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.pop()); //3
        System.out.println(myStack.pop()); //2
        Stack<Integer> stack=new Stack<>();
    }
}
