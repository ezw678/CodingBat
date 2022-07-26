// Given a string, return a version without both the first and
// last char of the string. The string may be any length, including 0.

public class WithouEnd2 {

  public static void main(String[] args) {
    String res = withouEnd2("Hello");
    System.out.println(res);
    // output: ell
  }

  public static String withouEnd2(String str) {
    int len = str.length();
    if (len <= 2) return "";

    return str.substring(1, len - 1);
  }

}
