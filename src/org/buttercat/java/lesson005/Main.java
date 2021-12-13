package org.buttercat.java.lesson005;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    final static String str = new String("Представь себе, что твой папа - самый умный человек на Земле и знает ответы на все вопросы, и всегда и во всем прав, и может это доказать. А теперь представь себе другого малыша на какой-нибудь уютной планете за миллион световых лет от нашей Земли, и у этого малыша есть папа, который умное всех на этой милой далекой планете. И он тоже знает все на свете и всегда во всем прав, как твои папа. Оба папы самые умные на свете и всегда во всем правы. Но вот беда - если они когда-нибудь встретятся, начнется ужасный спор, потому что они ни в чем друг с другом не согласны! Конечно, ты можешь сказать, что твой папа прав, а папа другого малыша неправ, но ведь Вселенная - такое большое пространство! В ней достаточно места для множества людей, которые все правы и все же ни за что не согласятся друг с другом. А оба папы правы и все же готовы спорить до драки - по той причине, что существует бесконечное множество возможностей быть правым. Однако есть во Вселенной такие места, где до каждого папы доходит наконец то, о чем говорит другой папа. В этих местах все разные правды соединяются так же ловко, как детали в электронных часах твоего паны. Такое место мы и называем хроно-синкластический инфундибулум.");


    public static void main(String[] args) throws Exception {
        lesson5 l5 = new lesson5();

// Task 1
        System.out.println(" ------ Task 1 ------ \n");

        System.out.println("Our text:");
        System.out.println(str);

        System.out.println("");
        System.out.println("The longest sentence:");
        System.out.println(l5.getTheLongestSentence(str));

        System.out.println("");
        System.out.println("The longest word:");
        System.out.println(l5.getTheLongestWord(str));

// Task 2
        System.out.println("\n ------ Task 2 ------ \n");

        System.out.println("Enter a sentence: ");
        System.out.println(l5.isPalindrome(new BufferedReader(new InputStreamReader(System.in)).readLine()) ? "it's a palindrome" : "it isn't a palindrome");

// Task 3
        System.out.println("\n ------ Task 3 ------ \n");

        System.out.println("Enter a sentence: ");
        System.out.println(l5.getCensured(new BufferedReader(new InputStreamReader(System.in)).readLine(),"бяка"));

// Task 4
        System.out.println("\n ------ Task 4 ------ \n");

        System.out.println("Do you remember our big string?");
        System.out.println("Lets count how many time \"папа\" occurrences in our big text: " + l5.getEntryCount(str, "папа"));

// Task 5
        System.out.println("\n ------ Task 5 ------ \n");

        System.out.println("Enter a sentence: ");
        System.out.println(l5.turnWordsBack(new BufferedReader(new InputStreamReader(System.in)).readLine()));
    }
}