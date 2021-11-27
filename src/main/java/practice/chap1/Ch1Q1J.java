package practice.chap1;

public class Ch1Q1J implements Ch1Q1{

    // need to ask char code.
    // this method expect it is ascii.
    // exec order: O(n)
    // mem order : O(1) = O(128)
    @Override
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

    @Override
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
