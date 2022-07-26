// Given a string of any length, return a new string where the last 2 chars,
// if present, are swapped, so "coding" yields "codign".

public class LastTwo {

  public static void main(String[] args) {
    String res = lastTwo("coding");
    System.out.println(res);
    // output: codign
  }

  public static String lastTwo(String str) {
    int len = str.length();
    if (len <= 1) return str;

    String res = "";
    res += str.substring(0, len - 2);
    res += String.valueOf(str.charAt(len - 1)) + String.valueOf(str.charAt(len - 2));

    return res;
  }

}
