package com.blz;

public class GenericMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Programs");

        MaximumNum max = new MaximumNum<>(10, 20, 30);
        max.printMax();
    }
}
