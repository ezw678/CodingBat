// Given a string of even length, return a string made of the
// middle two chars, so the string "string" yields "ri".
// The string length will be at least 2.

public class MiddleTwo {

  public static void main(String[] args) {
    String res = middleTwo("string");
    System.out.println(res);
    // output:  ri
  }

  public static String middleTwo(String str) {
    int len = str.length();
    int mid = len / 2;
    if (len == 2) return str;

    return (str.substring(mid - 1, mid + 1));
  }

}
