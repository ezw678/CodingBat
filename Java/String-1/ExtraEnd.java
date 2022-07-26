// Given a string, return a new string made of 3 copies of the last 2
// chars of the original string. The string length will be at least 2.

public class ExtraEnd {

  public static void main(String[] args) {
    String res = extraEnd("Hello");
    System.out.println(res);
    // output:  → "lololo"
  }

  public static String extraEnd(String str) {
    String s = str.substring(str.length() - 2);
    return s + s + s;
  }

}