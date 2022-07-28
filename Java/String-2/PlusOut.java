// Given a string and a non-empty word string, return a version of the original String
// where all chars have been replaced by pluses ("+"), except for appearances of the
// word string which are preserved unchanged.

public class PlusOut {

  public static void main(String[] args) {
    String res = plusOut("12xy34", "xy");

    System.out.println(res);
    // output: ++xy++
  }

  public static String plusOut(String str, String word) {
    StringBuilder sb = new StringBuilder(str);

    for (int i = 0; i < str.length(); ) {
      if (!str.startsWith(word, i)) {
        sb.setCharAt(i, '+');
        i++;
      } else {
        i += word.length();
      }
    }

    return sb.toString();
  }

}
