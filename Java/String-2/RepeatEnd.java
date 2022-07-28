// Given a string and an int n, return a string made of n repetitions of the last n characters
// of the string. You may assume that n is between 0 and the length of the string, inclusive.

public class RepeatEnd {

  public static void main(String[] args) {
    String res = repeatEnd("Hello", 3);

    System.out.println(res);
    // output: llollollo
  }

  public static String repeatEnd(String str, int n) {
    String s = str.substring (str.length() - n);

    String res = "";
    for (int i = 0; i < n; i++) {
      res += s;
    }

    return res;
  }

}
