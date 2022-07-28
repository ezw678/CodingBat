// Given a string, consider the prefix string made of the first N chars of the string. Does
// that prefix string appear somewhere else in the string ? Assume that the string is not
// empty and that N is in the range 1..str.length().

public class PrefixAgain {

  public static void main(String[] args) {
    boolean res = prefixAgain("abXYabc", 1);

    System.out.println(res);
    // output: true
  }

  public static boolean prefixAgain(String str, int n) {
    int len = str.length();
    if (len < n * 2)
      return false;

    String ps = str.substring (0, n);
    String rs = str.substring (n);

    return rs.contains(ps);
  }

}
