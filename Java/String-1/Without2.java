// Given a string, if a length 2 substring appears at both its beginning
// and end, return a string without the substring at the beginning,
// so "HelloHe" yields "lloHe". The substring may overlap with itself,
// so "Hi" yields "". Otherwise, return the original string unchanged.

public class Without2 {

  public static void main(String[] args) {
    String res = without2("HelloHe");
    System.out.println(res);
    // output:  "lloHe"
  }

  public static String without2(String str) {
    int len = str.length();
    if (len == 2) return "";
    if (len == 1) return str;
    if (len == 0) return "";

    if (str.substring(0, 2).equals(str.substring(len - 2)))
      return str.substring(2);
    else
      return str;
  }

}
