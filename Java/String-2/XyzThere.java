// Return true if the given string contains an appearance of "xyz" where the xyz is not
// directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

public class XyzThere {

  public static void main(String[] args) {
    boolean res = xyzThere("abcxyz");

    System.out.println(res);
    // output: true
  }

  public static boolean xyzThere(String str) {
    return str.matches(".*(?<!\\.)xyz.*");
  }

}
