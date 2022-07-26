// Given a string, return a version without the first 2 chars. Except
// keep the first char if it is 'a' and keep the second char if it
// is 'b'. The string may be any length. Harder than it looks.

public class DeFront {

  public static void main(String[] args) {
    String res = deFront("Hello");
    System.out.println(res);
    // output: "llo"
  }

  public static String deFront(String str) {
    String res = str.replaceFirst("^(.)[^b]", "$1");
    res = res.replaceFirst("^[^a]", "");

    return res;
  }

}
