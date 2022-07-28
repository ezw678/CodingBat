// Return a version of the given string, where for every star (*) in the string the
// star and the chars immediately to its left and right are gone. So "ab*cd" yields
// "ad" and "ab**cd" also yields "ad".

public class StarOut {

  public static void main(String[] args) {
    String res = starOut("ab*cd");

    System.out.println(res);
    // output: ad
  }

  public static String starOut(String str) {
    return str.replaceAll("(.?\\*+.?)", "");
  }

}
