package com.ntuthuko;

public class LongestString {

    public static void main(String[] args) {
        String[] words = {"the", "quick", "brown", "fox", "ate", "my", "chickens"};
        longest(words);
    }

    public static void longest(String[] words) {
        if (words == null || words.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        String longestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("Longest word: " + longestWord);
    }
}
