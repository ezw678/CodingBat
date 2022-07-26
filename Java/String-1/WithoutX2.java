// Given a string, if one or both of the first 2 chars is 'x', return
// the string without those 'x' chars, and otherwise return the string
// unchanged. This is a little harder than it looks.

public class WithoutX2 {

  public static void main(String[] args) {
    String res = withoutX2("xHi");
    System.out.println(res);
    // output: "Hi"
  }

  public static String withoutX2(String str) {
    int len = str.length();
    if (len == 0) return "";
    if (len == 1) {
      if (str.charAt(0) == 'x')
        return "";
      else
        return str;
    }

    String prev = str.substring(0, 2).replaceAll("[x]", "");

    return prev + str.substring(2);
  }

}
