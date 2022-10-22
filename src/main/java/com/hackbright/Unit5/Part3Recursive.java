package com.hackbright.Unit5;

public class Part3Recursive {
    public static void main(String[] args) {

        String[] stringList= {"hi","hey","there", "you"};
        String searchWord ="hey7";
        int index =0;

        System.out.println(" Index of the key is " + recursive_search(searchWord,stringList,index));

    }

    static int recursive_search(String searchWord, String[] stringList, int index){
        try {
            if (stringList[index] == searchWord) {
                return index;
            }
        }catch(Exception exp){
            return -1;
        }

        return recursive_search(searchWord,stringList,index+1);
    }

}
