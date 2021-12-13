package org.buttercat.java.lesson004;

public class lesson4 {
    public int isArraySorted(Integer[] a) {
        if((a == null) | (a.length < 2))
            return 0;

        int lastComp = Integer.compare(a[0].intValue(), a[1].intValue());
        for (int i = 1; i < a.length-1; i++) {
            int curComp = Integer.compare(a[i].intValue(), a[i+1].intValue());
            if(curComp == 0)
                continue;;
            if((curComp != lastComp) && (lastComp != 0)) {
                return 0;
            }
            lastComp = curComp;
        }
        return lastComp;
    }

    public void swapVals(Integer[] a, int i, int j) {
        int tmp = a[i].intValue();
        a[i] = a[j];
        a[j] = tmp;
    }

    public void swapArr(Integer[] a) {
        for(int i = 0; i < a.length/2; i++) {
            swapVals(a, i, a.length-i-1);
        }
    }

    public int entryCnt(Integer a[], int i) {
        int c = 0;
        for (int j = 0; j < a.length; j++) {
            if(i == a[j].intValue())
                c++;
        }
        return c;
    }
}
