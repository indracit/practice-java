public class Longestpalindrome {

    static String longestPalin(String S) {
        int n = S.length();
        String longest = "";
        for (int i = 0; i < n; i++) {
            int j = n - 1;
            while (j > i) {

                if (S.charAt(i) == S.charAt(j) && longest.length() < (j - i + 1)) {
                    String beforereverse = S.substring(i, j + 1);
                    String afterreverse = new StringBuilder(beforereverse)
                            .reverse()
                            .toString();

                    if (afterreverse.equals(beforereverse)) {
                        longest = afterreverse;
                    }
                }
                j--;
            }
        }
        return longest.length() == 0 ? S.substring(0, 1) : longest;

    }

    public static void main(String[] args) {
        String S = "aaaabbaa";
        System.out.println(longestPalin(S));
    }
}
