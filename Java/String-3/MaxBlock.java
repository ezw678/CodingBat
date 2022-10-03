// Given a string, return the length of the largest "block" in the string. A block is a run of
// adjacent chars that are the same.

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MaxBlock {

  public static void main(String[] args) {
    String str = "abbCCCddBBBxx";

    System.out.println(maxBlock(str));
    System.out.println(maxBlock2(str));
    // output: 3
  }

  // solution 1
  public static int maxBlock(String str) {
    int len = str.length();
    if (len <= 1) return len;

    int max = Integer.MIN_VALUE;
    int count = 1;
    for (int i = 0; i < len - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) {
        count++;
        if (i == len - 2 && max < count)
          max = count;
      } else {
        if (max < count)
          max = count;

        count = 1;
      }
    }

    return max;
  }

  // solution 2
  public static int maxBlock2(String str) {
    Pattern p = Pattern.compile("([a-zA-Z0-9]?)\\1*");
    Matcher m = p.matcher(str);

    int max = Integer.MIN_VALUE;
    while (m.find()) {
      int len = m.group().length();
      if (max < len)
        max = len;
    }

    return max;
  }

}
