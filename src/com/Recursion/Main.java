package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	java program to find that the number is even or odd without using modulous operator:
	 */
        System.out.println(isEven(66));

    }
    private static boolean isEven(int n){
        return (n&1)==0;
    }
}
