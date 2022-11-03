package practices;

public class TextPalindromeFinder {

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        String str = "LEVEL";
        System.out.println(str +" isPalindrome ? --> " + isPalindrome(str) );

        String str2 = "LEVER";
        System.out.println(str2 +" isPalindrome ? --> " + isPalindrome(str2) );
    }
}
