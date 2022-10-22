package com.hackbright.Unit5;

import java.util.HashMap;

public class Part2Main {

    public static void main(String[] args){

        BalancedParentheses balancedParentheses = new BalancedParentheses();
        String parenString = "we have (a bracket) with (a+(b+c))";
        System.out.println(parenString +":" +balancedParentheses.isBalancedParentheses(parenString));
        parenString = "we have (a bracket with (a+(b+c))";
        System.out.println(parenString +":" +balancedParentheses.isBalancedParentheses(parenString));
        parenString = "we have )a bracket with (a+(b+c))";
        System.out.println(parenString +":" +balancedParentheses.isBalancedParentheses(parenString));


        BalancedBrackets balancedBrackets = new BalancedBrackets();
        String bracketString = "we have [a bracket] with (a+<b+c>)";
        System.out.println(bracketString +":" +balancedBrackets.isBalancedBrackets(bracketString));
        bracketString = "we have [a bracket] {}with {(a+<b+c>)}";
        System.out.println(bracketString +":" +balancedBrackets.isBalancedBrackets(bracketString));
        bracketString = "we have [a bracket] {hi} with(} {(a+<b+c>)}";
        System.out.println(bracketString +":" +balancedBrackets.isBalancedBrackets(bracketString));


        String bracketStringWithArrayStack = "we have [a bracket] with (a+<b+c>)";
        System.out.println(bracketStringWithArrayStack +" -ArrayStack :" +balancedBracketsWithArrayStack(bracketStringWithArrayStack));
        bracketStringWithArrayStack = "we have [a bracket] {}with {(a+<b+c>)}";
        System.out.println(bracketStringWithArrayStack +" -ArrayStack :" +balancedBracketsWithArrayStack(bracketStringWithArrayStack));
        bracketStringWithArrayStack = "we have [a bracket] {hi} with(} {(a+<b+c>)}";
        System.out.println(bracketStringWithArrayStack +" -ArrayStack :" +balancedBracketsWithArrayStack(bracketStringWithArrayStack));
    }



//    public static boolean balancedParentheses(String s) {
//        int numOpenParens = 0;
//        int numClosedParens = 0;
//
//        for (int i = 0; i < s.length(); i += 1) {
//            if (s.charAt(i) == '(') {
//                numOpenParens +=1;
//            }
//            else if (s.charAt(i) == ')') {
//                numClosedParens += 1 ;
//            }
//            if (numOpenParens < numClosedParens) {
//                return false;
//            }
//        }
//
//        return numOpenParens == numClosedParens;
//    }


//    public static boolean balancedBrackets(String s) {
//
//        Stack<Character> stack = new Stack<Character>();
//        HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();
//        bracketPairs.put(')', '(');
//        bracketPairs.put(']', '[');
//        bracketPairs.put('}', '{');
//        bracketPairs.put('>', '<');
//
//        for (int i = 0; i < s.length(); i += 1) {
//
//            if (bracketPairs.containsValue(s.charAt(i))) {
//                stack.push(s.charAt(i));
//            }
//            else if (bracketPairs.containsKey(s.charAt(i))) {
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                Character recentBracket = stack.pop();
//                if (!recentBracket.equals(bracketPairs.get(s.charAt(i)))) {
//                    return false;
//                }
//            }
//        }
//
//        return stack.isEmpty();
//    }

    public static boolean balancedBracketsWithArrayStack(String s) {

        ArrayStack arrayStack = new ArrayStack();
        HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');
        bracketPairs.put('>', '<');

        for (int i = 0; i < s.length(); i += 1) {

            if (bracketPairs.containsValue(s.charAt(i))) {
                arrayStack.push(s.charAt(i));
            }
            else if (bracketPairs.containsKey(s.charAt(i))) {
                if (arrayStack.isEmpty()) {
                    return false;
                }
                Character recentBracket = arrayStack.pop();
                if (!recentBracket.equals(bracketPairs.get(s.charAt(i)))) {
                    return false;
                }
            }
        }

        return arrayStack.isEmpty();
    }


}
