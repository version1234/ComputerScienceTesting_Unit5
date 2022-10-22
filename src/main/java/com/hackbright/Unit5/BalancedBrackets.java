package com.hackbright.Unit5;

import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalancedBrackets(String s) {

        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');
        bracketPairs.put('>', '<');

        for (int i = 0; i < s.length(); i += 1) {

            if (bracketPairs.containsValue(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
            else if (bracketPairs.containsKey(s.charAt(i))) {
                if (stack.isEmpty()) {
                    return false;
                }
                Character recentBracket = stack.pop();
                if (!recentBracket.equals(bracketPairs.get(s.charAt(i)))) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
