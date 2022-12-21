package com.blz;

public class MaximumNum<T extends Comparable> {
    T x;
    T y;
    T z;

    public MaximumNum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void printMaxStrings() {
        com.blz.MaximumNum.printMax(x, y, z);
    }

    private static <T extends Comparable> void printMax(T x, T y, T z) {
        if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
            System.out.println(x);
        } else if (y.compareTo(x) > 0 && y.compareTo(z) > 0) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}
