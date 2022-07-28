// Given a string and a non-empty word string, return a string made of each char just
// before and just after every appearance of the word in the string. Ignore cases where
// there is no char before or after the word, and a char may be included twice if it is
// between two words.

public class WordEnds {

  public static void main(String[] args) {
    String res = wordEnds("abcXY123XYijk", "XY");

    System.out.println(res);
    // output: c13i
  }

  public static String wordEnds(String str, String word) {
    int len = str.length();
    StringBuilder sb = new StringBuilder(str);

    String res = "";
    for (int i = 0; i < len;) {
      if (str.startsWith(word, i)) {
        if (i != 0) {
          res += str.charAt(i - 1);
        }
        if (i != len - word.length()) {
          res += str.charAt(i + word.length());
        }
        i = i + word.length();
      } else {
        i++;
      }
    }

    return res;
  }

}
