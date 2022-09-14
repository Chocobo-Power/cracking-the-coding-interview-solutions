// package 01-arrays-and-strings.01-01-is-unique.mySolutions.Java;

public class isUnique {

    // This is a method
    //      accepts a string, returns a boolean
    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }

        // Array of 128 booleans, initialized to false
        boolean[] char_set = new boolean[128];

        // loop over the string
        for (int i = 0; i < str.length(); i++) {    // for loop over the string
            int val = str.charAt(i);                // get character at index, cast it to int
            if (char_set[val]) return false;        // index char_set with val to check boolean... if true, return false (stops loop)
            char_set[val] = true;                   // set index at val to true, inside the char_set array
        }
        return true;                                // if no false triggered before, just return true
    }

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word));
        }
    }

}
