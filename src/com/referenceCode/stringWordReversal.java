package com.referenceCode;

import java.util.Scanner;

public class stringWordReversal {

    public static int lenOfString(String sentence) {
        char[] charSentence = sentence.toCharArray();
        return charSentence.length;
    }

    public static void reverseWords(String sentence) {
        StringBuilder reversedString = new StringBuilder(sentence);

        for (String word : sentence.split("([^A-Za-z'])")) {
            if (word.matches("([^'])\\w+")) {
                reversedString.replace(sentence.indexOf(word),
                        sentence.indexOf(word) + word.length(),
                        new StringBuilder(word).reverse().toString());
            }
        }
        System.out.println(reversedString.toString());
    }

    public static void reverseAltWords(String sentence) {
        StringBuilder reversedString = new StringBuilder(sentence);

        int count = 0;
        for (String word : sentence.split("([^A-Za-z'])")) {
            if (count % 2 == 0) {
                count++;
            } else if (word.matches("([^'])\\w+")) {
                reversedString.replace(sentence.indexOf(word),
                        sentence.indexOf(word) + word.length(),
                        new StringBuilder(word).reverse().toString());
                count++;
            }
        }
        System.out.println(reversedString.toString());
    }

    public static void main(String[] args) {
        //Made 'I'm "an" Raven.' to show that an has been switched.
        Scanner scan = new Scanner(System.in);
        System.out.println("My name is Nadario. I'm an Raven.");

        System.out.println("\"My name is Nadario. I'm an Raven.\" character count is = " + lenOfString("My name is Nadario. I'm an Raven."));
        reverseWords("My name is Nadario. I'm an Raven.");

        String userInput = scan.nextLine();
        reverseAltWords(userInput);
    }

}
