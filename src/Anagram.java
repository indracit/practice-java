import java.util.Arrays;

public class Anagram {

    static boolean isAnagram(String a, String b) {

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        if (arr1.length != arr2.length) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;

    }

    // false
    // true
    public static void main(String[] args) {

        String a = "allergy";
        String b = "allergic";
        String a1 = "geeksforgeeks";
        String b1 = "forgeeksgeeks";

        System.out.println(isAnagram(a, b));
        System.out.println(isAnagram(a1, b1));

    }
}
