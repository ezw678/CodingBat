// Given a string, return the longest substring that appears at both the beginning and end of
// the string without overlapping. For example, sameEnds("abXab") is "ab".

public class SameEnds {

  public static void main(String[] args) {
    String str = "abXYab";

    System.out.println(sameEnds(str));
    // output: "ab"
  }

  public static String sameEnds(String string) {
    int len = string.length();

    int l = len / 2, r = len / 2;
    if (len % 2 != 0)
      r = len / 2 + 1;

    while (l >= 0 && r < len) {
      String lstr = string.substring(0, l);
      if (lstr.equals(string.substring(r)))
        return lstr;

      l--;
      r++;
    }

    return "";
  }

}
