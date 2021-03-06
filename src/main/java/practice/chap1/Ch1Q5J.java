package practice.chap1;

import org.jetbrains.annotations.NotNull;

public class Ch1Q5J implements Ch1Q5 {
  @Override
  public boolean oneEditDistance(@NotNull String first, @NotNull String second) {
    if (Math.abs(first.length() - second.length()) > 1) return false;

    String s1 = first.length() < second.length() ? first : second;
    String s2 = first.length() < second.length() ? second : first;

    int index1 = 0;
    int index2 = 0;
    boolean foundDifference = false;
    while (index1 < s1.length() && index2 < s2.length()) {
      if (s1.charAt(index1) != s2.charAt(index2)) {
        if (foundDifference) return false;
        foundDifference = true;

        if (s1.length() == s2.length()) {
          index1++;
        }
      } else {
        index1++;
      }
      index2++;
    }
    return true;
  }
}
