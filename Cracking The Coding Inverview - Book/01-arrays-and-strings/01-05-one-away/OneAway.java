public class OneAway {

    static boolean isOneAway(String str1, String str2) {

        // Find the difference in lengths
        int lenDiff = Math.abs(str1.length() - str2.length());

        // Length difference is more than 1
        if (lenDiff > 1) {
            return false;
        }

        // Convert strings to arrays
        char strArr1[] = str1.toCharArray();
        char strArr2[] = str2.toCharArray();

        // Lengths are the same, iterate counting difference in characters
        if (lenDiff == 0) {
            int changes = 0;
            for (int i = 0; i < strArr1.length; i++) {
                if (strArr1[i] != strArr2[i]) {
                    changes++;
                }
                if (changes > 1) {
                    return false;
                }
            }
        }

        if (lenDiff != 0) {

            // Make sure str1 is the shorter one
            if (strArr1.length > strArr2.length) {
                char[] tmp = strArr1;
                strArr1 = strArr2;
                strArr2 = tmp;
            }

            // TWO POINTERS APPROACH
            // Iterate shorter string, jump one index on longer string when characters differ
            // Return false if we jump more than one time
            int ptr1 = 0;
            int ptr2 = 0;
            int jumps = 0;
    
            while (ptr1 < strArr1.length) {
                // System.out.printf("| %d | %c | %d | %c |\n", ptr1, strArr1[ptr1], ptr2, strArr2[ptr2]);
                if (strArr1[ptr1] == strArr2[ptr2]) {
                    ptr1++;
                    ptr2++;
                } else {
                    ptr2++;
                    jumps++;
                }

                if (jumps > 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        if (args.length == 2) {
            System.out.println(args[0] + " -> " + args[1] + ": " + isOneAway(args[0], args[1]));
        } else {
            System.out.println("pale -> ple: " + isOneAway("pale", "palo"));
        }
    }
}