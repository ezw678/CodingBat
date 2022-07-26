// Given a string, if the string begins with "red" or "blue" return
// that color string, otherwise return the empty string.

public class SeeColor {

  public static void main(String[] args) {
    String res = seeColor("redxx");
    System.out.println(res);
    // output: red
  }

  public static String seeColor(String str) {
    if (str.startsWith("red"))
      return "red";
    else if (str.startsWith("blue"))
      return "blue";
    else
      return "";
  }

}
