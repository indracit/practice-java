public class Reverse_words {

    static String reverse(String words) {
        String[] stringArr = words.split(" ");
        String result = "";
        for (int i = stringArr.length - 1; i >= 0; i--) {

            System.out.println(stringArr[i]);
            result = result + stringArr[i] + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) throws Exception {
        String words = "i love programming very much";
        System.out.println(reverse(words));
    }
}
