package com.blz;

public class GenericMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Programs");

        MaximumNum max = new MaximumNum<>("Akash", "Ram", "Lanjewar");
        max.printMaxStrings();
    }
}
