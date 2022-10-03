// We'll say that a "triple" in a string is a char appearing three times in a row.
// Return the number of triples in the given string. The triples may overlap.

public class CountTriple {

  public static void main(String[] args) {
    String str = "xxxabyyyycd";

    System.out.println(countTriple(str));
    // output: 3
  }

  static int countTriple(String str) {
    int len = str.length();

    int count = 0;
    for (int i = 0; i < len - 2; i++) {
      char ch = str.charAt(i);
      if (str.charAt(i + 1) == ch && str.charAt(i + 2) == ch)
        count++;
    }

    return count;
  }

}
