package com.cydeo.ReviewStackRecursion;

public class GenericLLTestApp {
    public static void main(String[] args) {
        GenericLinkedList<Integer> myList=new GenericLinkedList<>();
        myList.addFirst(12);
        myList.addFirst(11);
        myList.addFirst(15);
        myList.printNodes();    //15 => 11 => 12 => null
        System.out.println();
        System.out.println(myList.removeFirst());  //15

        myList.printNodes();    // 11 => 12 => null
    }
}
