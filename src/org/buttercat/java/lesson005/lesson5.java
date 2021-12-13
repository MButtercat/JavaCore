package org.buttercat.java.lesson005;

public class lesson5 {

    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String getTheLongestSentence(String str) {
        String s = new String();
        int l = 0;
        for(String sent : str.split("[.] ")) {
            if(sent.length() > l) {
                s = sent;
                l = sent.length();
            }
        }
        return s;
    }

    public String getTheLongestWord(String str) {
        String s = new String();
        int l = 0;
        for(String w : str.split("[\" - \"., ]")) {
            if(w.length() > l) {
                s = w;
                l = w.length();
            }
        }
        return s;
    }

    public boolean isPalindrome(String str) {
        String str1 = str.toLowerCase().replaceAll("[^а-я0-9]","");
        String str2 = reverseString(str1);// new StringBuilder(str1).reverse().toString();
        return str1.equals(str2);
    }

    public String getCensured(String str, String cens) {
        return str.replaceAll(cens, "[censored]");
    }

    public int getEntryCount(String str, String req) {
        return (str.length()-str.replaceAll(req, "").length()) / req.length();
    }

    public String turnWordsBack(String str) {
        String res = new String();
        for(String w : str.split(" ")) {
            res += reverseString(w) + " ";
        }
        return res;
    }
}