// Given a string, does "xyz" appear in the middle of the string? To define middle, we'll
// say that the number of chars to the left and right of the "xyz" must differ by at most
// one. This problem is harder than it looks.

public class XyzMiddle {

  public static void main(String[] args) {
    boolean res = xyzMiddle("AAxyzBB");

    System.out.println(res);
    // output: true
  }

  public static boolean xyzMiddle(String str) {
    int index = str.indexOf("xyz");
    if (index == -1) return false;

    int len = str.length();
    if (len < 3) return false;

    return xyzMiddle (str, 0, len);
  }

  static boolean xyzMiddle (String str, int idx, int len) {
    if (idx + 3 > str.length()) return false;

    int index = str.indexOf("xyz", idx);
    int prior = index;
    int post = len - index - 3;

    if (Math.abs(post - prior) <= 1)
      return true;
    else
      return xyzMiddle (str, idx + 3, len);
  }

}
