public class URLify {

    static String toURL(String words, int trueLength) {

        // Convert words to array
        char[] wordsArray = words.toCharArray();

        // Count white spaces
        int whites = 0;
        for (int i = 0; i < trueLength; i++) {
            if (wordsArray[i] == ' ') {
                whites++;
            }
        }

        // Loop array in reverse order
        for (int i = trueLength-1; i >= 0; i--) {
            if (wordsArray[i] == ' ') {
                int offset = 2*(whites-1);
                wordsArray[i+offset] = '%';
                wordsArray[i+offset+1] = '2';
                wordsArray[i+offset+2] = '0';
                whites--;
            } else {
                int offset = 2*whites;
                wordsArray[i+offset] = wordsArray[i];
            }
        }

        // Convert array back to string
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : wordsArray) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(toURL("Good Morning World    ", 18));
    }
}