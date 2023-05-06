import java.util.ArrayList;

public class Reverse_words {

    static String reverseArr(ArrayList<String> s) {
        String result = "";
        for (int i = s.size() - 1; i >= 0; i--) {
            result = result + s.get(i);
        }
        return result;
    }

    static String reverse(String words) {

        char[] stringArr = words.toCharArray();
        ArrayList<String> wordarr = new ArrayList<String>();
        String result = "";
        for (int i = 0; i <= stringArr.length - 1; i++) {

            if (stringArr[i] == '.' || stringArr[i] == ' ') {
                wordarr.add(result);
                wordarr.add("" + stringArr[i]);
                result = "";
            } else {
                result = result + stringArr[i];
            }

        }
        wordarr.add(result);
        return reverseArr(wordarr);
    }

    public static void main(String[] args) throws Exception {
        String test1 = "pqr.mno";
        String test2 = "i.like.this.program.very.much";
        System.out.println(reverse(test1));
        System.out.println(reverse(test2));
    }
}
