// Given a string, return true if it ends in "ly".

public class EndsLy {

  public static void main(String[] args) {
    Boolean res = endsLy("oddly");
    System.out.println(res);
    // output: true
  }

  public static boolean endsLy(String str) {
    int len = str.length();
    if (len <= 1) return false;

    return str.substring(str.length() - 2).equals("ly");
  }

}
