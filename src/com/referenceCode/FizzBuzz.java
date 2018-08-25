/*
FizzBuzz: Output numbers from 1 to x. If the number is divisible
by 3, replace it with "Fizz". If it is divisible by 5, replace it
with "Buzz". If it is divisible by 3 and 5 replace it with
"FizzBuzz".

eg:
1
2
Fizz
4
Buzz
6
...
14
FizzBuzz
16
...
 */

package com.referenceCode;

public class FizzBuzz {
    public static void FizzBuzz(int x) {
        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz(100);
    }
}


/*

 */