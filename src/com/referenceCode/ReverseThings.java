package com.referenceCode;

public class ReverseThings {
    public static void main(String[] args) {
//in the static method below, write logic that takes a number and reverses it
//input : an int
//output : an int
        System.out.println(reverseNum(123)); //returns 321
        System.out.println(reverseNum(1923)); //returns 3291
    }

    public static int reverseNum(int num) {
        int reversenum = 0;
        /* for loop: No initialization part as num is already
         * initialized and no increment/decrement part as logic
         * num = num/10 already decrements the value of num
         */
        for (; num != 0; ) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }
        return reversenum;
    }
}
