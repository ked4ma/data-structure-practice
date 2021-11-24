package chap1;

public class Q1_1J {
    // need to ask char code.
    // this method expect it is ascii.
    // exec order: O(n)
    // mem order : O(1) = O(128)
    public boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            if (charSet[val]) return false;

            charSet[val] = true;
        }
        return true;
    }

    public boolean isUniqueCharsWithoutOtherDataStructure(String str) {
        if (str.length() > 128) return false;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }
}
