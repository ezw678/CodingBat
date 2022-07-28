// Given two strings, word and a separator sep, return a big string made of count occurrences
// of the word, separated by the separator string.

public class RepeatSeparator {

  public static void main(String[] args) {
    String res = repeatSeparator("Word", "X", 3);

    System.out.println(res);
    // output: WordXWordXWord
  }

  public static String repeatSeparator(String word, String sep, int count) {
    String res = "";
    for (int i = 0; i < count; i++) {
      res += word + sep;
    }

    sep = java.util.regex.Pattern.quote(sep);
    res = res.replaceAll(sep + "$", "");
    return res;
  }

}
