package practice.chap1;

import org.jetbrains.annotations.NotNull;

public class Ch1Q4J implements Ch1Q4 {
  @Override
  public boolean isPalindromeAscii(@NotNull String str, boolean checkCase) {
    if (!checkCase) {
      str = str.toLowerCase();
    }
    int[] counts = new int[128];
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c == ' ') continue;
      counts[str.charAt(i)]++;
    }
    int oddCount = 0;
    for (int i = 0; i < 128; i++) {
      if (counts[i] % 2 != 0) oddCount++;
    }
    return oddCount <= 1;
  }
}
