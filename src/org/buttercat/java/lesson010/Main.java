package org.buttercat.java.lesson010;

import org.buttercat.java.lesson009.Lesson9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("./src/org/buttercat/java/lesson010/file1.txt");
        File file2 = new File("./src/org/buttercat/java/lesson010/file2.txt");
        File in1 = new File("./src/org/buttercat/java/lesson010/outp1.txt");
        File in2 = new File("./src/org/buttercat/java/lesson010/outp2.txt");

        try {
            Lesson10.clearFile(in1);
            Lesson10.clearFile(in2);

            Lesson10.mergeFiles(file1, file2, in1);

            Lesson10.reWriteFile(in1, in2);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
