// Given a string, return the sum of the digits 0-9 that appear in the string, ignoring
// all other characters. Return 0 if there are no digits in the string.
// (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
// Integer.parseInt(string) converts a string to an int.)

import java.util.Arrays;

public class SumDigits {

  public static void main(String[] args) {
    String str = "aa1bc2d3";

    System.out.println(sumDigits(str));
    System.out.println(sumDigits2(str));
    // output: 6
  }

  // solution 1
  static int sumDigits(String str) {
    if (!str.matches(".*\\d.*"))
      return 0;

    int len = str.length();

    int sum = 0;
    for (int i = 0; i < len; i++) {
      char cur = str.charAt(i);
      if (Character.isDigit(cur)) {
        sum += Integer.parseInt(String.valueOf(cur));
      }
    }

    return sum;
  }

  // solution 2
  static int sumDigits2(String str) {
    if (!str.matches(".*\\d.*"))
      return 0;

    return Arrays.asList(str.split("")).stream().filter(s->(Character.isDigit(s.charAt(0)))).mapToInt(i->Integer.parseInt(i)).sum();
  }

}
