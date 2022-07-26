// Given two strings, append them together (known as "concatenation")
// and return the result. However, if the concatenation creates a
// double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

public class ConCat {

  public static void main(String[] args) {
    String res = conCat("abc", "cat");
    System.out.println(res);
    // output: abcat
  }

  public static String conCat(String a, String b) {
    int al = a.length();
    int bl = b.length();

    if (al == 0)
      return b;

    if (bl == 0)
      return a;

    if (a.charAt(al - 1) == b.charAt(0))
      return a + b.substring(1);
    else
      return a + b;
  }

}
