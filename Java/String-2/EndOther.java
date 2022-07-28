// Given two strings, return true if either of the strings appears at the very end of
// the other string, ignoring upper/lower case differences (in other words, the computation
// should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version
// of a string.

public class EndOther {

  public static void main(String[] args) {
    boolean res = endOther("Hiabc", "abc");

    System.out.println(res);
    // output: true
  }

  public static boolean endOther(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();

    int la = a.length();
    int lb = b.length();

    if (la >= lb)
      return a.substring(la - lb).equals(b);
    else
      return b.substring(lb - la).equals(a);
  }

}
