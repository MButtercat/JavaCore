package org.buttercat.java.lesson003;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

class listHelper {
    private ArrayList<Integer> l3, l5, l35;
    public listHelper() {
        l3 = new ArrayList<Integer>();
        l5 = new ArrayList<Integer>();
        l35 = new ArrayList<Integer>();
    }

    public void addToL3(Integer i) {
        l3.add(i);
    }
    public void addToL5(Integer i) {
        l5.add(i);
    }
    public void addToL35(Integer i) {
        l35.add(i);
    }

    public ArrayList<Integer> getL3() {
        return l3;
    }
    public ArrayList<Integer> getL5() {
        return l5;
    }
    public ArrayList<Integer> getL35() {
        return l35;
    }
}

public class Main {
    final static int oddMax = 99;

    public static void main(String[] args) throws Exception {
        lesson3 l3 = new lesson3();

        // Task 1
        System.out.println(" ------ Task 1 ------ ");

        try {
            System.out.print("list of first odd numbers up to " + oddMax + ": ");
            for (Integer i : l3.oddGen(oddMax)) {
                System.out.print(i + (i < oddMax-1 ? ", " : "\n"));
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

// Task 2
        System.out.println("\n ------ Task 2 ------ ");

        try {
            listHelper lm = l3.commonMultiples(oddMax+1);
            System.out.print("List of numbers with multiple 3: ");
            for (Integer i : lm.getL3()) {
                System.out.print(i + (i < Collections.max(lm.getL3()) ? ", " : "\n"));
            }
            System.out.print("List of numbers with multiple 5: ");
            for (Integer i : lm.getL5()) {
                System.out.print(i + (i < Collections.max(lm.getL5()) ? ", " : "\n"));
            }
            System.out.print("List of numbers with multiples 3 and 5: ");
            for (Integer i : lm.getL35()) {
                System.out.print(i + (i < Collections.max(lm.getL35()) ? ", " : "\n"));
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

// Task 3
        System.out.println("\n ------ Task 3 ------ ");

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[3];
        String[] ind = new String[]{"first", "second", "third"};
        for(int j = 0; j < 3; j++) {
            System.out.print("Enter the " + ind[j] + " number: ");
            arr[j] = Integer.parseInt(inp.readLine());
        }
        System.out.println("Result: " + l3.isSumCorrect(arr));

// Task 4
        System.out.println("\n ------ Task 4 ------ ");

        for(int j = 0; j < 3; j++) {
            System.out.print("Enter the " + ind[j] + " number: ");
            arr[j] = Integer.parseInt(inp.readLine());
        }
        System.out.println("Result: " + l3.isCompCorrect(arr));

// Task 5
        System.out.println("\n ------ Task 5 ------ ");
        boolean res = false;
        int attempts = 1;
        do {
            int arrSz = ThreadLocalRandom.current().nextInt(5, 16);
            System.out.println("Attempt " + attempts + " for finding perfect array with " + arrSz + " elements");
            int[] rndArr = new int[arrSz];
            for (int i = 0; i < arrSz; i++) {
                rndArr[i] = ThreadLocalRandom.current().nextInt(-5, 6);
            }
            System.out.println("Our array: " + Arrays.toString(rndArr));
            System.out.println("First element: " + rndArr[0] + (rndArr[0] == 3 ? " is equal 3" : " isn't equal 3"));
            System.out.println("Last element: " + rndArr[rndArr.length-1] + (rndArr[rndArr.length-1] == 3 ? " is equal 3" : " isn't equal 3"));
            res =((rndArr[0] == 3) | (rndArr[rndArr.length-1] == 3));
            attempts++;
            System.out.println("");
        } while(!res);
        System.out.println("Hooray! We find it!");

// Task 6
        System.out.println("\n ------ Task 6 ------ ");

        int arrSz = ThreadLocalRandom.current().nextInt(10, 31);
        System.out.println("Generate array with " + arrSz + " elements");
        int[] rndArr = new int[arrSz];
        for (int i = 0; i < arrSz; i++) {
            rndArr[i] = ThreadLocalRandom.current().nextInt(-5, 6);
        }
        System.out.println("Our array: " + Arrays.toString(rndArr));
        System.out.println("This array " + (IntStream.of(rndArr).anyMatch(x -> x == 3) ? "contains 3" : "doesn't contain 3"));
    }
}
