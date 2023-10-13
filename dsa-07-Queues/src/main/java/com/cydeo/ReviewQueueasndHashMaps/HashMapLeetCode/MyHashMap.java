package com.cydeo.ReviewQueueasndHashMaps.HashMapLeetCode;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {
    public int modNumber;
    List<BucketLinkedList> list;

    public MyHashMap(){
        this.modNumber = 2341;
        this.list = new ArrayList<BucketLinkedList>();
        for (int i = 0; i < 2341 ; i++) {
            this.list.add(new BucketLinkedList());
        }
    }

    public void put(int key, int value){
        // calculate index with modulus (hash function)
        int index = key%modNumber;
        list.get(index).update(key, value); // get() methodu BucketlinkedList içinde yaptık

    }

    public int get(int key){
        // calculate index with modulus (hash function)
        int index = key%modNumber;
        return this.list.get(index).get(key);  // get() methodu BucketlinkedList içinde yaptık
    }

    public void remove(int key){
        // calculate index with modulus (hash function)
        int index = key%modNumber;
        list.get(index).remove(key);
    }


}
