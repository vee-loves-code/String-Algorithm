package org.example;

public class CheckCase {
    public static int checkAlpha(String word){
        String [] array = word.split("\n");
        String firstWord = array[0];
        String secondWord = array[1];

        int sum = firstWord.length() + secondWord.length();
        System.out.println(sum);

        String compare = firstWord.compareTo(secondWord) > 0 ? "Yes" : "No";


        System.out.println(compare);

        String firstWordCapital = capitalizeFirstLetter(firstWord);
        String secondWordCapital = capitalizeFirstLetter(secondWord);

        System.out.println(firstWordCapital + " " + secondWordCapital);

        return sum;
    }

    private static String capitalizeFirstLetter(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
