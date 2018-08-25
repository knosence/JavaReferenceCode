package com.referenceCode;

public class Fibinacci {

    public static long fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void fibSeq(int aNumber) {
        for (int i = 0; i < aNumber + 1; i++) {
            System.out.println(i + " = " + fibonacci(i));
        }
    }

    public static void main(String[] args) {
        fibSeq(50);
    }


}
