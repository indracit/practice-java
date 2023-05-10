public class Paranthesis {

    static boolean ispar(String x) {
        int i = -1;

        if (x.length() == 1)
            return false;

        char[] a = new char[x.length()];

        for (char c : x.toCharArray()) {

            if (c == '{' || c == '(' || c == '[') {

                a[++i] = c;
            } else if (i >= 0
                    && ((a[i] == '(' && c == ')') || (a[i] == '{' && c == '}') || (a[i] == '[' && c == ']'))) {

                --i;
            } else {

                return false;
            }
        }
        if (i >= 0)
            return false;
        return true;
    }

    public static void main(String[] args) {

        String s = "{(])}";

        System.out.println(ispar(s));

    }
}
