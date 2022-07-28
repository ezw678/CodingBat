// Return true if the given string contains an appearance of "xyz" where the xyz is not
// directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

public class XyzThere {

  public static void main(String[] args) {
    boolean res = xyzThere("abcxyz");

    System.out.println(res);
    // output: true
  }

  public static boolean xyzThere(String str) {
    int index = str.indexOf("xyz");

    if (index < 0) return false;

    if (index == 0 || (index > 0 && str.charAt(index - 1) != '.'))
      return true;
    else {
      for (int i = index + 3; i < str.length() - 2; i++) {
        String s = str.substring(i, i + 3);
        if (s.equals("xyz") && str.charAt(i - 1) != '.')
          return true;
      }
    }

    return false;
  }

}
