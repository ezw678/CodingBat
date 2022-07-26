// Given a string, return the string made of its first two chars,
// so the String "Hello" yields "He". If the string is shorter
// than length 2, return whatever there is, so "X" yields "X",
// and the empty string "" yields the empty string "". Note that
// str.length() returns the length of a string.

public class FirstTwo {

  public static void main(String[] args) {
    String res = firstTwo("Hello");
    System.out.println(res);
    // output: → "He"
  }

  public static String firstTwo(String str) {
    if (str.length() <= 2) return str;
    return String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(1));
  }

}