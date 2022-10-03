// Given a string, return a string where every appearance of the lowercase word "is" has been
// replaced with "is not". The word "is" should not be immediately preceeded or followed by
// a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char)
// tests if a char is a letter.)

public class NotReplace {

  public static void main(String[] args) {
    String str = "is test";

    System.out.println(notReplace(str));
    // output: "is not test"
  }

  public static String notReplace(String str) {
    return str.replaceAll("(?<![a-zA-Z])is(?![a-zA-Z])", "is not");
  }

}
