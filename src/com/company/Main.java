package com.company;
//find smallest numbe ror string with the use of generic
public class Main {

    public static void main(String[] args) {
        System.out.printf("Min of %d, %d and %d is %d\n\n",
                4, 2, 9, minimum(4, 2, 9));

        System.out.printf("Min of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, minimum(6.6, 8.8, 7.7));

        System.out.printf("Min of %s, %s and %s is %s\n","pear",
                "apple", "orange", minimum("pear", "apple", "orange"));
    }

    public static <T extends Comparable<T>> T minimum(T x, T y, T z) {
        T min = x;
        if (y.compareTo(min) < 0)
            min = y;

        if (z.compareTo(min) < 0)
            min = z;
        return min;
    }
}
