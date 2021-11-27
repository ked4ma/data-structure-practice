package practice.chap1;

import java.util.Arrays;

public class Ch1Q2J implements Ch1Q2 {
    // 1. distinguish lower and upper case ?
    // 2. consider white space as 1 word ?
    // 3. char code

    // if char code is ascii
    @Override
    public boolean isPermutationAscii(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] counts = new int[128];
        for (int i = 0; i < a.length(); i++) {
            counts[a.charAt(i)]++;
            counts[b.charAt(i)]--;
        }

        for (int i = 0; i < 128; i++) {
            if (counts[i] != 0) return false;
        }
        return true;
    }

    @Override
    public boolean isPermutationWithSort(String a, String b) {
        if (a.length() != b.length()) return false;

        return sort(a).equals(sort(b));
    }

    private static String sort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
