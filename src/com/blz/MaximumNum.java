package com.blz;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumNum<T extends Comparable<T>> {
    T x;
    T y;
    T z;
    T a;

    public void MaximumNum(T x, T y, T z, T a) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;
    }

    static <T extends Comparable> Object compare(T x, T y, T z, T a) {
        ArrayList<T> arrayList = new ArrayList<T>();
        arrayList.add(x);
        arrayList.add(y);
        arrayList.add(z);
        arrayList.add(a);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println("sorted list : " + arrayList);

        return null;
    }
}