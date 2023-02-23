package org.example;

public class Main {
    public static void main(String[] args) {
        String word = "hello \nword";
        System.out.println(word.replaceAll("\\s+", "").length());
        String[] arr = word.split("\n");
        if (arr[0].compareTo(arr[1]) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        var word1 = arr[0].substring(0,1).toUpperCase() + arr[0].substring(1);
        var word2 = arr[1].substring(0,1).toUpperCase() + arr[1].substring(1);

        System.out.println(word1 + " " + word2);
    }
}