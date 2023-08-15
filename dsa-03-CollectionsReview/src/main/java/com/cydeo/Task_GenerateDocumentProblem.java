package com.cydeo;

import java.util.HashMap;

public class Task_GenerateDocumentProblem {
    public static void main(String[] args) {

        String list="!veDJaCyd vaeo perelo xw";
        String document = "Cydeo Java Developer";
        System.out.println(generateDocumentBruteForce(list,document));
        System.out.println(generateDocumentOptimal(list,document));

    }

    public static boolean generateDocumentBruteForce(String charString, String document){
        for (int i = 0; i < document.length() ; i++) {
            char character = document.charAt(i);
            int documentCharFreq = countCharFrequency(character,document); // O(n)
            int charListFreq = countCharFrequency(character,charString);   // O(n)
            if(documentCharFreq>charListFreq) return false;
        }                                                                  // n * (n+n) => 2n2 => n2
        return true;
    }

    public static int countCharFrequency(Character character, String str){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);
            if(character == c) count++;
        }
        return count;
    }

    public static boolean generateDocumentOptimal(String charString, String document){
        HashMap<Character,Integer> charCount = new HashMap<>();
        for (int i = 0; i < charString.length() ; i++) {
        char character = charString.charAt(i);
        charCount.put(character,charCount.getOrDefault(character,0)+1);
        }

        for (int i = 0; i < document.length() ; i++) {
            char character = document.charAt(i);
            if(!charCount.containsKey(character)||charCount.get(character)==0) return false;
            charCount.put(character,charCount.get(character)-1); // remaining elements updated.
        }
        return true;

    }
// how we keep frequencies?
    // how we update


}
/*
Algorithm Problem: Generate Document
39
Difficulty: Easy
Category: Strings
• You're given a string of available characters and a string representing a document that you need to generate.
Write a function that determines if you can generate the document using the available characters. If you can
generate the document, your function should return true; otherwise, it should return false. You're only able to
generate the document if the frequency of unique characters in the characters string is greater than or equal
to the frequency of unique characters in the document string.
• For example, if you're given characters = "abcabc" and document = "aabbccc" you cannot generate the
document because you're missing one c . The document that you need to create may contain any characters,
including special characters, capital letters, numbers, and spaces. Note: you can always generate the empty
string ( "" ).
• Sample Input :
• characters = "!veDJaCyd vaeo perelo xw" document = "Cydeo Java Developer!"
• Sample Output :
• true
 */