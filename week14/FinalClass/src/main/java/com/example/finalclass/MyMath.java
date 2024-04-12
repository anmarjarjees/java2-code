package com.example.finalclass;
// This file is our Model
public class MyMath {

    public static int calculateFactorial(int number) {
        // 5! = 5 * 4 * 3 * 2 * 1
        int result=1;
        for (int i = number; i > 0 ; i--) {
            result *=i;
        }
        return result;
    }
}
