// Given 2 strings, a and b, return a new string made of the first
// char of a and the last char of b, so "yo" and "java" yields "ya".
// If either string is length 0, use '@' for its missing char.

public class LastChars {

  public static void main(String[] args) {
    String res = lastChars("last", "chars");
    System.out.println(res);
    // output: ls
  }

  public static String lastChars(String a, String b) {
    int al = a.length();
    int bl = b.length();

    String res = "";
    res += al == 0 ? "@" : a.substring(0, 1);
    res += bl == 0 ? "@" : b.substring(bl - 1);

    return res;
  }

}
