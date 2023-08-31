package com.cydeo.Review3_LinkedList;

public class UserLinkedListTestApp {
    public static void main(String[] args) {

        UserLinkedList mylist = new UserLinkedList();
        mylist.insertLast(new UserNode("john","smith"));
        mylist.insertLast(new UserNode("john1","smith1"));
        mylist.insertLast(new UserNode("john2","smith2"));
        mylist.printNames();

        mylist.deleteByName("john1");
        System.out.println("after deleting john1:");
        mylist.printNames();

    }
}
