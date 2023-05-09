public class ReverseString {

    static String reverse(String s) {

        char[] a = s.toCharArray();

        String res = "";

        for (int i = a.length - 1; i >= 0; i--) {
            res += a[i];
        }

        return res;
    }

    // skeeG
    public static void main(String[] args) {
        System.out.println(reverse("Geeks"));
    }
}