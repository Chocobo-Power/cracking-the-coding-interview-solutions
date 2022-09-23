public class CheckPermutation1 {

    static String sort(String word) {

        // Create a char array from the word
        char[] charsArray = word.toCharArray();

        // Sort the char array
        java.util.Arrays.sort(charsArray);

        // Convert the array back to a string and return it
        return new String(charsArray);
    }

    static boolean isPermutation(String w1, String w2) {
        if (w1.length() != w2.length()) {
            return false;
        }
        return sort(w1).equals(sort(w2));
    }

    static void println(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        if (args.length != 2) {
            println("Usage: java CheckPermutations str1 str2");
            System.exit(1);
        }
        String w1 = args[0];
        String w2 = args[1];

        println("Permutation: " + isPermutation(w1, w2));
    }
}