// Given a string, if the first or last chars are 'x', return the
// string without those 'x' chars, and otherwise return the
// string unchanged.

public class WithoutX {

  public static void main(String[] args) {
    String res = withoutX("xHix");
    System.out.println(res);
    // output: "Hi"
  }

  public static String withoutX(String str) {
    return str.replaceAll("^[x]|[x]$", "");
  }

}
