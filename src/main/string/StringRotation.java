package main.string;

public class StringRotation {

    public static String wholeRotate(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - i - 1] = tmp;
        }

        return pr(String.valueOf(s));
    }

    public static String partialRotate(char[] s) {
        int startOfToken = 0;
        for (int i = 0; i < s.length; i++) {

            if (s[i] == ' ') {
                int start = startOfToken;
                int end = i - 1;
                int mid = (start + end) / 2;
                for (int j = 0; j < mid - start + 1; j++) {
                    char tmp = s[j + start];
                    s[j + start] = s[end - j];
                    s[end - j] = tmp;
                }
                startOfToken = i + 1;
            }
        }
        return String.valueOf(s);
    }

    public static String pr(String str) {
        String res = "";
        String[] token = str.split(" ");
        for (int j = 0; j < token.length; j++) {
            String ss = token[j];
            char[] s = ss.toCharArray();
            for (int i = 0; i < s.length / 2; i++) {
                char tmp = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - i - 1] = tmp;
            }
            res += String.valueOf(s);
            if (j != token.length - 1) {
                res += " ";
            }
        }
        return res;
    }
}
