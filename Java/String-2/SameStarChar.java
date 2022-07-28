// Returns true if for every '*' (star) in the string, if there are chars both immediately
// before and after the star, they are the same.

public class SameStarChar {

  public static void main(String[] args) {
    boolean res = sameStarChar("xy*yzz");

    System.out.println(res);
    // output: true
  }

  public static boolean sameStarChar(String str) {
    if (str.indexOf("*") < 0) return true;

    int len = str.length();

    for (int i = 1; i < len - 1; i++) {
      if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
        return false;
    }

    return true;
  }

}
