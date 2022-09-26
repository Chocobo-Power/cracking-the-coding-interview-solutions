public class StringCompression {
    
    static String compressString(String original) {

        // Convert string to array
        char[] originalArr = original.toCharArray();

        StringBuilder compressedStringBuilder = new StringBuilder();

        // Initialize currChar and charCount to first element
        char currChar = originalArr[0];
        int charCount = 1;
        
        // Iterate string with two pointers
        for (int i = 0; i < originalArr.length-1; i++) {
            if (originalArr[i] == originalArr[i+1]) {
                charCount++;
            } else {
                compressedStringBuilder.append(currChar);
                compressedStringBuilder.append(charCount);
                currChar = originalArr[i+1];
                charCount = 1;
            }  
        }

        // Append last currChar and charCount to compressed string builder
        compressedStringBuilder.append(currChar);
        compressedStringBuilder.append(charCount);

        String compressedString = compressedStringBuilder.toString();
        // return compressedString;
        return (compressedString.length() < original.length()) ? compressedString : original;
    }

    public static void main(String[] args) {
        System.out.println(compressString("AAAAAABBBBBCCCD"));
        System.out.println(compressString("Renzo"));
    }
}
