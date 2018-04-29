package hwr.com.hwreverse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public final class Anagrams {

    private Anagrams() {
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseIgnoreNotLiteral(String input) {
        StringBuilder sb = new StringBuilder();
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] out = words[i].toCharArray();
            int start = 0;
            int end = out.length - 1;
            char temp;
            while (end > start) {
                if (!stateReverse(out[start]))
                    start++;
                if (!stateReverse(out[end]))
                    end--;
                temp = out[start];
                out[start] = out[end];
                out[end] = temp;
                end--;
                start++;
            }
            sb.append(new String(out));
            if (words.length > 1 && i < words.length - 1)
                sb.append(" ");
        }
        return new String(sb);
    }

    private static boolean stateReverse(char c) {
        Pattern p = Pattern.compile("[a-zA-Z]");
        Matcher m = p.matcher(String.valueOf(c));
        return m.matches();
    }

}
