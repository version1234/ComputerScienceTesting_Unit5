package com.hackbright.Unit5;

public class BalancedParentheses {

    public static boolean isBalancedParentheses(String s) {
        int numOpenParens = 0;
        int numClosedParens = 0;

        for (int i = 0; i < s.length(); i += 1) {
            if (s.charAt(i) == '(') {
                numOpenParens +=1;
            }
            else if (s.charAt(i) == ')') {
                numClosedParens += 1 ;
            }
            if (numOpenParens < numClosedParens) {
                return false;
            }
        }

        return numOpenParens == numClosedParens;
    }
}
