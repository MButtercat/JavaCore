package org.buttercat.java.lesson010;

import java.io.*;
import java.util.ArrayList;

public class Lesson10 {
    public static ArrayList<String> readFile(File f) throws IOException {
        ArrayList<String> a = new ArrayList<String>();
        String text;
        try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
            while ((text = reader.readLine()) != null) {
                a.add(text);
            }
        }
        catch (IOException e) {
            throw e;
        }
        return a;
    }

    public static void writeFile(String s, File f, boolean append) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(f, append))) {
            writer.write(s);
        }
        catch (IOException e) {
            throw e;
        }
    }

    public static void reWriteFile(File out, File in) throws IOException {
        for(String s : readFile(out)) {
            writeFile(s.replaceAll("[^а-яa-zА-ЯA-Z0-9]", "\\$")+"\n", in, true);
        }
    }

    public static void mergeFiles(File out1, File out2, File in) throws IOException {
        for (String s : Lesson10.readFile(out1)) {
            Lesson10.writeFile(s + "\n", in, true);
        }

        Lesson10.writeFile("\n", in, true);

        for (String s : Lesson10.readFile(out2)) {
            Lesson10.writeFile(s + "\n", in, true);
        }
    }

    public static void clearFile(File f) throws IOException {
        writeFile("", f, false);
    }
}
