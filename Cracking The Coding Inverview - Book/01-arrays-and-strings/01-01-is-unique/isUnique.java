import java.util.Arrays;

public class isUnique {

    public static Boolean allUnique(String word) {

        // Represent all ASCII characters in a boolean array
        Boolean[] charSet = new Boolean[128];
        Arrays.fill(charSet, Boolean.FALSE);

        for (int i = 0; i < word.length(); i++) {
            int index = (int) word.charAt(i);
            if (charSet[index] == true) {
                return false;
            }
            charSet[index] = true;
        }
        return true;
    }

    public static void main(String[] args) {

        // Test if some words have all unique characters
        String[] words = {"Renzo", "Abigail", "Aitana", "Belon", "Giol"};
        System.out.println("Words with unique characters:");
        for (String word : words) {
            if (allUnique(word) == true) {
                System.out.println(word + " -> true");
            } else {
                System.out.println(word + " -> false");
            }
        }
    }
}
