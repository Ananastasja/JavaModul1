package day1;

public class Test {
    public static void main(String[] args) {
        System.out.println(helloName("Bob"));// → "Hello Bob!"
        System.out.println(helloName("Alice"));// → "Hello Alice!"
        System.out.println(helloName("X"));// → "Hello X!"
        split();
        System.out.println(makeOutWord("<<>>", "Yay"));// → "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo"));// → "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word"));// → "[[word]]"
        split();
        System.out.println(firstHalf("WooHoo"));// → "Woo"
        System.out.println(firstHalf("HelloThere"));// → "Hello"
        System.out.println(firstHalf("abcdef"));// → "abc"
        split();
        System.out.println(nonStart("Hello", "There"));// → "ellohere"
        System.out.println(nonStart("java", "code"));// → "avaode"
        System.out.println(nonStart("shotl", "java"));// → "hotlava"
        split();
        System.out.println(middleThree("Candy"));// → "and"
        System.out.println(middleThree("and"));// → "and"
        System.out.println(middleThree("solving"));// → "lvi"
        split();
        System.out.println(lastChars("last", "chars"));// → "ls"
        System.out.println(lastChars("yo", "java"));// → "ya"
        System.out.println(lastChars("hi", ""));// → "h@"
        split();
        System.out.println(makeAbba("Hi", "Bye"));// → "HiByeByeHi"
        System.out.println(makeAbba("Yo", "Alice"));// → "YoAliceAliceYo"
        System.out.println(makeAbba("What", "Up"));// → "WhatUpUpWhat"
    }

    private static String makeAbba(String s1, String s2) {
        return s1 + s2 + s2 + s1;
    }

    private static String lastChars(String first, String last) {
        if (last.length() == 0) {
            return first.substring(0, 1) + "@";
        } else return first.substring(0, 1) + last.substring(last.length() - 1);
        //String firstLast = first.substring(0, 1) + last.substring(last.length() - 1);


    }

    private static String middleThree(String myWord) {
        return myWord.substring(myWord.length() / 2 - 1, myWord.length() / 2 + 2);
    }

    private static String nonStart(String s1, String s2) {
        return s1.substring(1) + s2.substring(1);
    }

    private static String firstHalf(String word) {
        String firstH = word.substring(word.length() / 2);
        return firstH;
    }

    private static String makeOutWord(String a, String b) {
        String newWord = a.substring(0, 2) + b + a.substring(2);
        return newWord;
    }

    private static void split() {
        System.out.println("------------------");
    }

    private static String helloName(String name) {
        return "Hello, " + name + "!";
    }
}
