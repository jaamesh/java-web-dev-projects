package org.example;


import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String test = "Now is the time for all good men to come to the aid of their country.";
        char[] testArray = test.toCharArray();
        HashMap<Character, Integer> foundChars = new HashMap<>();

        for(char chr : testArray) {
            if (foundChars.containsKey(chr)){
                foundChars.put(chr, foundChars.get(chr)+1);
            } else {
                foundChars.put(chr, 1);
            }
        }

        System.out.println(foundChars);


    }
}