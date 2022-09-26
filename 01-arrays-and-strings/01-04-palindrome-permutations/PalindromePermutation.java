public class PalindromePermutation {

    static boolean isPalindromePermutation(String words) {
        
        // Array to count character frequencies
        int a = (int) 'a';
        int z = (int) 'z';
        int charFreq[] = new int[z-a+1];

        // Convert words to array
        char wordsArray[] = words.toCharArray();

        // Count character frequencies, case innsensitively
        for (char c : wordsArray) {            
            if (Character.isAlphabetic(c) == true) {
                c = Character.toLowerCase(c);
                charFreq[c - a]++;
            }
        }

        // Count occurences of odd character counts
        int oddCount = 0;
        for (int c : charFreq) {
            if (c % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }

    public static void main(String[] args) {

        String word1 = "Tact coa";
        String word2 = "Renzo Belon";

        System.out.println(word1 + " -> " + isPalindromePermutation(word1));
        System.out.println(word2 + " -> " + isPalindromePermutation(word2));
        
    }
}