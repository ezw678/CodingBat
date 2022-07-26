// Given a string, return a "rotated right 2" version where the last
// 2 chars are moved to the start. The string length will be at least 2.

public class Right2 {

  public static void main(String[] args) {
    String res = right2("Hello");
    System.out.println(res);
    // output: loHel
  }

  public static String right2(String str) {
    int len = str.length();
    if (str.length() <= 2) return str;

    return str.substring(len - 2) + str.substring(0, len - 2);
  }

}

