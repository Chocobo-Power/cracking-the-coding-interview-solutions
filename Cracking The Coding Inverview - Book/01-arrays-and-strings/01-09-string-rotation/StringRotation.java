public class StringRotation {

    static boolean isRotation(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        String str2str2 = str2 + str2;
        return str2str2.contains(str1);
    }

    public static void main(String[] args) {
        String str1 = "renzo";
        String str2 = "zoren";

        System.out.printf("--------------------\n");
        System.out.printf("| Word 1   | %s |\n", str1);
        System.out.printf("| Word 2   | %s |\n", str2);
        System.out.printf("| Rotation | %b  |\n", isRotation(str1, str2));
        System.out.printf("--------------------\n");
        
    }
}