// Given a string of even length, return the first half. So the
// string "WooHoo" yields "Woo".

public class FirstHalf {

  public static void main(String[] args) {
    String res = firstHalf("WooHoo");
    System.out.println(res);
    // output: → "Woo"
  }

  public static String firstHalf(String str) {
    return str.substring(0, str.length() / 2);
  }

}