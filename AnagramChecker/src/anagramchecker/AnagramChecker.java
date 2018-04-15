package anagramchecker;

import java.util.Scanner;

public class AnagramChecker{
    public static void main(String[] args) {
        String string1, string2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        string1 = in.nextLine();
        System.out.println("Enter the second string: ");
        string2 = in.nextLine();
        
//        remove all spaces
        string1= string1.replaceAll("\\s","");
        string2=string2.replaceAll("\\s", "");
        
        if (isAnagram(string1, string2))
            System.out.println("The two strings are"+
                             " anagram of each other");
        else
            System.out.println("The two strings are not"+
                               " anagram of each other");
    }
    static boolean isAnagram(String word, String anagram) {
        boolean isAnagram = false;
        if (word != null && anagram != null && word.length() == anagram.length()) {
            char[] arr = word.toCharArray();
            StringBuilder temp = new StringBuilder(anagram);
            int wordLength = word.length();
            for (char ch : arr) {
                int index = temp.indexOf("" + ch);
                if (index != -1) {
                    temp.deleteCharAt(index);
                }
            }
            isAnagram = temp.toString().isEmpty();
        }
        return isAnagram;
    }
}