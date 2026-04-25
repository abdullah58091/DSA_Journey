package com.company.Arrays.Practice_Easy;

public class Palindrom {

            public static boolean isPalindrome(String s) {

                int i = 0;
                int j = s.length()-1;

                while (i < j){

                    if (!Character.isLetterOrDigit(s.charAt(i))) {
                        i++;
                    }
                    else  if (!Character.isLetterOrDigit(s.charAt(j))) {
                        j--;
                    }
                    else {
                        if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                            return false;
                        }

                        i++;
                        j--;
                    }
                }

                return true;
            }
               public static void main(String[] args) {

                   String s = "A man, a plan, a canal: Panama";
                   System.out.println(isPalindrome(s));
        }
    }

