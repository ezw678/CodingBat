// Given two strings, a and b, create a bigger string made of the first char of a, the
// first char of b, the second char of a, the second char of b, and so on. Any leftover
// chars go at the end of the result.

public class MixString {

  public static void main(String[] args) {
    String res = mixString("abc", "xyz");

    System.out.println(res);
    // output: axbycz
  }

  public static String mixString(String a, String b) {
    int la = a.length();
    int lb = b.length();
    int min = Math.min(la, lb);

    String res = "";
    for (int i = 0; i < min; i++) {
      res += a.charAt(i);
      res += b.charAt(i);
    }

    if (la > lb) {
      res += a.substring(lb);
    } else
      res += b.substring(la);

    return res;
  }

}
