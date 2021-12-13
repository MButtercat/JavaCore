package org.buttercat.java.lesson004;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws Exception {
        lesson4 l4 = new lesson4();

// Task 1
        System.out.println(" ------ Task 1 ------ \n");

        Integer[][] a = new Integer[][] { {1, 2, 3, 4, 5, 6, 7, 8, 8},
                                          {4, 4, 3, 3, 2, 1, 0, -1, -2},
                                          {5, 2, 3, 4, 1, 2, 3, 4, 6},
                                          {1, 1, 1, 1, 1, 1, 1, 1, 1} };
        for (int i = 0; i < 4; i++) {
            System.out.print("Array " + (i+1) + " " + Arrays.toString(a[i]));
            switch (l4.isArraySorted(a[i])) {
                case 1:
                    System.out.println(" is descending sorted");
                    break;
                case 0:
                    System.out.println(" is unsorted or contains an equal values");
                    break;
                case -1:
                    ;
                    System.out.println(" is ascending sorted");
                    break;
            }
        }
// Task 2
        System.out.println("\n ------ Task 2 ------ \n");

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the array size: ");
        int aSz = Integer.parseInt(inp.readLine());
        int[] a1 = new int[aSz];

        System.out.print("Enter the array's values: ");
        for(int i = 0; i < aSz; i++) {
            a1[i] = Integer.parseInt(inp.readLine());
        }

        System.out.print("Result: " + Arrays.toString(a1));

// Task 3
        System.out.println("\n ------ Task 3 ------ \n");

        for (int i = 0; i < 4; i++) {
            System.out.println("Array " + (i+1) + " " + Arrays.toString(a[i]));

            System.out.print("Lets swap extreme elements: ");
            l4.swapVals(a[i], 0, a[i].length-1);
            System.out.println(Arrays.toString(a[i]));
            l4.swapVals(a[i], 0, a[i].length-1);

            System.out.print("Lets swap whole array: ");
            l4.swapArr(a[i]);
            System.out.println(Arrays.toString(a[i]));
            System.out.println(" ");
        }

// Task 4
        System.out.println("\n ------ Task 4 ------ \n");

        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        aSz = rnd.nextInt(50,99);

        System.out.print("Make an array with " + aSz + " elements: ");
        Integer[] a2 = new Integer[aSz];

        for (int i = 0; i < a2.length; i++) {
            a2[i] = rnd.nextInt(-10,11);
        }
        System.out.println(Arrays.toString(a2));

        System.out.println("Lets find the first unique element");
        int ind = 0;
        int unq = 0;
        boolean finded = false;
        for (ind = 0; ind < a2.length; ind++) {
            unq = l4.entryCnt(a2, a2[ind]);
            if(unq == 1) {
                finded = true;
                break;
            }
        }
        if(finded) {
            System.out.println("The first unique element is " + a2[ind] + " (index " + ind + ")");
        } else {
            System.out.println("This array have no unique elements");
        }

// Task 5
        System.out.println("\n ------ Task 5 ------ \n");

        aSz = rnd.nextInt(1000,2000);

        System.out.print("Make an array with " + aSz + " elements: ");
        Integer[] a3 = new Integer[aSz];
        for (int i = 0; i < a3.length; i++) {
            a3[i] = rnd.nextInt(-1000,1001);
        }
        System.out.println(Arrays.toString(a3));

        a3 = mysort.mergeSort(a3);
        System.out.println("\n-------------------------\n");
        System.out.println("Merge sorted array: " + Arrays.toString(a3));

        System.out.println("\n-------------------------\n");
        l4.swapArr(a3);
        System.out.println("Or vise versa: " + Arrays.toString(a3));
    }
}