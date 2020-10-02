package com.tutorial;

public class BreakContinueinWhileLoop {
    public static void main(String[] asgr){
        // break example
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

        // continue example
        int y = 0;
        while (y < 10) {
            if (y == 4) {
                y++;
                continue;
            }
            System.out.println(y);
            y++;
        }
    }
}
