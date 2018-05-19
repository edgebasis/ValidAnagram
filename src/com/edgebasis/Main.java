package com.edgebasis;

public class Main {

    public static void main(String[] args) {
        String s ="abcd";
        String t = "adbc";

        // add your strings here
        if(s==null || t==null) return;
        if(s.length()!=t.length()) return;

        char[] letters = s.toCharArray();
        char[] chars = t.toCharArray();
        int[] temp = new int[26];
        int counter=0;

        for(int i=0; i< s.length(); i++) {
            temp[letters[i]-'a'] += letters[i]-'a';
            temp[chars[i]-'a'] -= chars[i]-'a';


        }

        for(int i=0; i<temp.length;i++) if(temp[i]!=0) counter=-1;
        if(counter==0)
        System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }

}
