package practice.chap1;

import org.jetbrains.annotations.NotNull;

public class Ch1Q3J implements Ch1Q3 {
  @Override
  public void replaceWhiteSpace(@NotNull char[] str, int trueLength) {
    int spaceCount = 0;
    int i = 0;
    for (; i < trueLength; i++) {
      if (str[i] == ' ') {
        spaceCount++;
      }
    }
    int index = i + 2 * spaceCount;
    for (i = trueLength - 1; i >= 0; i--) {
      if (str[i] == ' ') {
        str[index - 1] = '0';
        str[index - 2] = '2';
        str[index - 3] = '%';
        index -= 3;
      } else {
        str[index - 1] = str[i];
        index--;
      }
    }
  }
}
