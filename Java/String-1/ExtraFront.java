// Given a string, return a new string made of 3 copies of the first
// 2 chars of the original string. The string may be any length. If
// there are fewer than 2 chars, use whatever is there.

public class ExtraFront {

  public static void main(String[] args) {
    String res = extraFront("Hello");
    System.out.println(res);
    // output:  "HeHeHe"
  }

  public static String extraFront(String str) {
    int len = str.length();

    if (len == 0) return str;
    if (len == 1) return str + str + str;

    String s = str.substring(0, 2);
    return s + s + s;
  }

}
