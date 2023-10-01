package com.cydeo.PrintMiddleLL;



public class PrintMiddleNode {
    public static void main(String[] args) {
        MySinglyLinkedList sll=new MySinglyLinkedList();
        for (int i = 1; i <= 6; i++) {
            sll.add(i);
        }
        printMiddle(sll);      // 3,4
    }
    public static void printMiddle(MySinglyLinkedList sll){
        //create two pointers
        Node a=sll.head;
        Node b=sll.head;
        // iterate over the linked list
        while(b!=sll.tail && b.next!=sll.tail){
            a=a.next;         // single jump
            b=b.next.next;    // double jump
        }
        // b is located either on tail or before tail
        if(b==sll.tail) System.out.println(a.id); // on tail , odd number of nodes
        else System.out.println(a.id+","+a.next.id); // before tail , even number of nodes
    }
}
/*
Question –Print Middle Node/Nodes of a SLL
• Find the middle of a linked list in one pass. If the list has an even number of
nodes, there would be two middle nodes.
• Note: Assume that you don’t know the size of the list ahead of time
 example1 = 1 2 3 4    5       6 7 8 9
 example2 = 1 2 3 4    5 6      7  8  9  10

 */