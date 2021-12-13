package org.buttercat.java.lesson004;

import java.util.Arrays;

public class mysort {
    private static Integer[] mergeArrays(Integer[] a, Integer[] b) {
        Integer[] c = new Integer[a.length+b.length];

        int i=0, j=0;
        for (int k=0; k<c.length; k++) {

            if (i > a.length-1) {
                c[k] = b[j];
                j++;
            }
            else if (j > b.length-1) {
                c[k] = a[i];
                i++;
            }
            else if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            }
            else {
                c[k] = b[j];
                j++;
            }
        }
        return c;
    }
    public static Integer[] mergeSort(Integer[] a) {
        if(a == null) {
            return null;
        }

        if(a.length < 2) {
            return a;
        }

        int n = 0;
        int l = a.length/2;
        int m = l+1;
        int r = a.length;


        Integer[] b = new Integer[l];
        System.arraycopy(a, n, b, n, l);
        Integer[] c = new Integer[r-l];
        System.arraycopy(a, l, c, n, r-l);

        b = mergeSort(b);
        c = mergeSort(c);

        return mergeArrays(b, c);
    }
}
