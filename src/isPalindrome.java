public class isPalindrome {
    static int isPalindromes(String S) {

        String afterReverse = new StringBuilder(S).reverse().toString();

        if (afterReverse.equals(S)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        String S = "abba";
        System.out.println(isPalindromes(S));
    }
}
