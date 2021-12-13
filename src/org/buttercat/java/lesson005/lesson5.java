package org.buttercat.java.lesson005;

public class lesson5 {
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
        String str1 = str.toLowerCase().replaceAll("[^а-я]","");
        String str2 = new StringBuilder(str1).reverse().toString();
        return str1.equals(str2);
    }

    public String getCensured(String str, String cens) {
        return str.replaceAll(cens, "[censored]");
    }
}
