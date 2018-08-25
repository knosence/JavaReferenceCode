/*
Making Change: Given an input x, write a function to
determine the minimun number of coins required to make
that exact amount of change.

using the American coin system: 1 5 10 25
 */

package com.referenceCode;

public class MakingChange {

    final static int[] coins = {25, 10, 5, 1};


    public static int change(int x, int[] coins) {
        int[] cache = new int[x];
        for (int i = 1; i < x; i++) {
            cache[i] = -1;
        }


        return change(x, coins, cache);
    }

    public static int change(int x, int[] coins, int[] cache) {

        if (x == 0) {
            return 0;
        }

        int min = x;
        for (int coin : coins) {
            if (x - coin >= 0) {
                int c;
                if (cache[x - coin] >= 0) {
                    c = cache[x - coin];
                } else {
                    c = change(x - coin, coins, cache);
                    cache[x - coin] = c;
                }
                if (min > c + 1) {
                    min = c + 1;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(change(100, coins));
    }
}
