// We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately
// to its left or right. Return true if all the g's in the given string are happy.

public class GHappy {

  public static void main(String[] args) {
    String str = "xxggxx";

    System.out.println(gHappy(str));
    // output: true
  }

  static boolean gHappy(String str) {
    if (str.length() == 0) return true;
    if (!str.contains("g")) return false;

    String res = str.replaceAll("(?<=g)g|g(?=g)", "@");
    if (!res.contains("g")) {
      return true;
    } else {
      return false;
    }
  }

}
