package com.blz;

import java.util.Scanner;

public class GenericMain<T> {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Programs");

        System.out.println(" Press 1 to Sort Integers  \n Press 2 to Sort Floats \n Press 3 to Sort Strings");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                findingMaxInteger();
                break;
            case 2:
                findingMaxFloat();
                break;
            case 3:
                findingMaxString();
        }

    }

    static MaximumNum<Integer> object = new MaximumNum<>();

    public static void findingMaxInteger() {
        System.out.println("\ninteger Sorted in ascending order.....................");
        object.compare(40, 30, 10, 20);
    }

    public static void findingMaxFloat() {
        System.out.println("\nFloat Sorted in ascending order.....................");
        object.compare(46.86f, 87.87f, 34.65f, 42.12f);
    }

    public static void findingMaxString() {
        System.out.println("\nSorted in ascending order.....................");
        object.compare("Akash", "Ram", "Lanjewar", "Nagpur");
    }
}
