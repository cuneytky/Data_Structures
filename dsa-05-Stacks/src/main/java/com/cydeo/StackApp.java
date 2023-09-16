package com.cydeo;

public class StackApp {
    public static void main(String[] args) {
        MyStack<Integer> stack=new MyStack<>();
        for (int i = 0; i <5 ; i++) {
            stack.push(i);
        }
      //  System.out.println(stack.peek()); //4
      //  System.out.println(stack.pop());  //4
        System.out.println("-----------------");

        stack.push(9);
        for (int i = 0; i <5 ; i++) {
            System.out.println(stack.pop());  // 9 4 3 2 1 0
        }

        System.out.println(stack.peek());
    }
}
