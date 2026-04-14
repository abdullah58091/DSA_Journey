package com.company.String_DSA;
// Approach: Frequency Count (Hashing)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Valid_Anagram {

    public static  boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t =  "nagaram";

        boolean result = isAnagram(s,t);
        System.out.println("Is Anagram : " + result);
    }
}

