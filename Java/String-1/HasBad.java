// Given a string, return true if "bad" appears starting at index 0
// or 1 in the string, such as with "badxxx" or "xbadxx" but not
// "xxbadxx". The string may be any length, including 0. Note: use
// .equals() to compare 2 strings.

public class HasBad {

  public static void main(String[] args) {
    boolean res = hasBad("badxx");
    System.out.println(res);
    // output: true
  }

  public static boolean hasBad(String str) {
    int len = str.length();
    if (len < 3) return false;

    if (str.substring(0, 3).equals("bad") || len > 3 && str.substring(1, 4).equals("bad"))
      return true;
    else
      return false;
  }

}
