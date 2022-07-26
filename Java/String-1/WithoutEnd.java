// Given a string, return a version without the first and last
// char, so "Hello" yields "ell". The string length will be at least 2.

public class WithoutEnd {

  public static void main(String[] args) {
    String res = withoutEnd("Hello");
    System.out.println(res);
    // output: → "ell"
  }

  public static String withoutEnd(String str) {
    return str.substring(1, str.length() - 1);
  }

}