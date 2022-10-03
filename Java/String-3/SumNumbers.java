// Given a string, return the sum of the numbers appearing in the string, ignoring all other
// characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char)
// tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string
// to an int.)

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SumNumbers {

  public static void main(String[] args) {
    String str = "5$$1;;1!!";

    System.out.println(sumNumbers(str));
    System.out.println(sumNumbers2(str));
    // output: 7
  }

  // solution 1
  public static int sumNumbers(String str) {
    return Arrays.asList(str.split("\\D+")).stream().filter(s->!s.isEmpty()).map(s->Integer.parseInt(s)).mapToInt(Integer::intValue).sum();
  }

  // solution 2
  public static int sumNumbers2(String str) {
    Pattern p = Pattern.compile("\\d+");
    Matcher m = p.matcher(str);

    int sum = 0;
    while (m.find()) {
      sum += Integer.parseInt(m.group());
    }

    return sum;
  }

}
