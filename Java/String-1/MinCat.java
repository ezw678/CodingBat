// Given two strings, append them together (known as "concatenation")
// and return the result. However, if the strings are different lengths,
// omit chars from the longer string so it is the same length as the
// shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

public class MinCat {

  public static void main(String[] args) {
    String res = minCat("Hello", "Hi");
    System.out.println(res);
    // output: loHi
  }

  public static String minCat(String a, String b) {
    int al = a.length();
    int bl = b.length();

    if (al < bl)
      return a + b.substring(bl - al);
    else if (al > bl)
      return a.substring(al - bl) + b;
    else
      return a + b;
  }

}
