/*
An ArrayList, or a dynamically resizing array, is an array that resizes itself as
needed while still providing O(1) access. A typical implementation is that when a
vector is full, the array doubles in size. Each doubling takes O(n) time, but
happens so rarely that its amortized time is still O(1).
*/

import java.util.*;
// import java.io.*;


public class ArrayListMerge {
    public static ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<String>();

        for (String w : words) {
            sentence.add(w);
        }

        for (String w : more) {
            sentence.add(w);
        }

        return sentence;
    }

    public static void main(String[] args) {
        String[] words = {"asd", "asd", "asd"};
        String[] more = {"qwe", "qwe", "qwe"};
        System.out.println(merge(words, more));
    }
}
