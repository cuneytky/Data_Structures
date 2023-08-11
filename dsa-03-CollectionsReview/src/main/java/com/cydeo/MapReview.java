package com.cydeo;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReview {
    public static void main(String[] args) {
        // create hash map
        Map<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");

        String st= "JJavvaDDevelloopperr";
        System.out.println(findFirstNonRepeating(st));//  null
    }
    public static Character findFirstNonRepeating(String str){
        // 1- create a map : this will cost me space complexity O(n)
        Map<Character,Integer> map= new TreeMap<>();
        int count;

        // 2- count the frequency of chars
        for(Character ch:str.toCharArray()){
            if(map.containsKey(ch)) {
                count=map.get(ch);
                map.put(ch, count+1);
            }
            else map.put(ch, 1);
        }

        // 3- start from the beginning and check if there is a char with frequency 1
        for(Character ch:str.toCharArray()){
            if(map.get(ch)==1) return ch;
        }
        return null;
    }
    /*
    Algorithm Problem (First Non-Repeating Char in a String)
Find the first non-repeating char in a string.
Example:
String=“Java Developer”
Output: j
     */
}
