package com.hackbright.Unit5;

import java.util.EmptyStackException;

public class ArrayStack {

    private Character[] stack= new Character[10];;
    private int top=0;


    public void push(Character s) {
        if (top == stack.length) {
            // need to resize the backing array
            Character[] newArray = new Character[ stack.length+1];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = s;
    }
    public Character pop() {
        if (top==0) {
            throw new EmptyStackException();
        }

        Character s = stack[--top];
        stack[top] = null;
        return s;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
