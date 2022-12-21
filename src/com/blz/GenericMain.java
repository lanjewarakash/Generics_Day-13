package com.blz;

public class GenericMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Programs");

        MaximumNum max = new MaximumNum<>(45.47f, 65.98f, 96.08f);
        max.printMax();
    }
}
