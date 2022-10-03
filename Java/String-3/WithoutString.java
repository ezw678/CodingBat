// Given two strings, base and remove, return a version of the base string where all instances
// of the remove string have been removed (not case sensitive). You may assume that the remove
// string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing
// "xx" leaves "x".

public class WithoutString {

  public static void main(String[] args) {
    String base = "Hello there";
    String remove = "llo";

    System.out.println(withoutString(base, remove));
    // output: "He there"
  }

  static String withoutString(String base, String remove) {
    String ptn = java.util.regex.Pattern.quote(remove);
    return base.replaceAll("(?i)" + ptn, "");
  }

}
