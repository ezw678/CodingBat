// Given a string, compute a new string by moving the first char to come after the next two
// chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars,
// so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

public class OneTwo {

  public static void main(String[] args) {
    String res = oneTwo("tcagdo");

    System.out.println(res);
    // output: catdog
  }

  public static String oneTwo(String str) {
    int len = str.length();
    if (len < 3) return "";

    String res = "";
    for (int i = 0; i < len - 2; i += 3) {
      res += str.substring(i + 1, i + 3) + str.charAt(i);
    }

    return res;
  }

}
