// Given a string and an index, return a string length 2 starting
// at the given index. If the index is too big or too small to
// define a string length 2, use the first 2 chars. The string
// length will be at least 2.

public class TwoChar {

  public static void main(String[] args) {
    String res = twoChar("java", 0);
    System.out.println(res);
    // output: ja
  }

  public static String twoChar(String str, int index) {
    int len = str.length();
    if (index + 1 >= len || index < 0) return str.substring(0, 2);

    return str.substring(index, index + 2);
  }

}
