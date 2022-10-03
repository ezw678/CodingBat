// Given a string, look for a mirror image (backwards) string at both the beginning and end of
// the given string. In other words, zero or more characters at the very begining of the given
// string, and at the very end of the string in reverse order (possibly overlapping). For
// example, the string "abXYZba" has the mirror end "ab".

public class MirrorEnds {

  public static void main(String[] args) {
    String str = "abXYZba";

    System.out.println(mirrorEnds(str));
    // output: "ab"
  }

  public static String mirrorEnds(String string) {
    int len = string.length();

    int l = 0, r = len - 1;
    while (l < len && r >= 0) {
      if (string.charAt(l) != string.charAt(r))
        break;

      l++;
      r--;
    }

    return string.substring(0, l);
  }

}
