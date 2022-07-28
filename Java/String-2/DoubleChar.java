// Given a string, return a string where for every char in the original, there are two chars.

public class DoubleChar {

  public static void main(String[] args) {
    String res = doubleChar("The");

    System.out.println(res);
    // output: TThhee
  }

  public static String doubleChar(String str) {
    char [] chs = str.toCharArray();

    String res = "";
    for (char ch : chs) {
      res += (char) ch;
      res += (char) ch;
    }

    return res;
  }

}
