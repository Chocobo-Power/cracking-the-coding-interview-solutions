// Check if the two words have the same character counts
 
public class CheckPermutation2 {

    static boolean isPermutation(String w1, String w2) {

        int[] letters = new int[128];

        // Is it better to convert the string to an array and iterate
        // the array, than to iterate the string directly??
        char[] arr1 = w1.toCharArray();
        for (char c : arr1) {
            letters[c]++;
        }

        for (int i = 0; i < w2.length(); i++) {
            int c = (int) w2.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPermutation("renzo", "ozner"));
    }
}
