// Given a string, return true if the first 2 chars in the string also
// appear at the end of the string, such as with "edited".

public class FrontAgain {

  public static void main(String[] args) {
    boolean res = frontAgain("edited");
    System.out.println(res);
    // output: true
  }

  public static boolean frontAgain(String str) {
    if (str.length() <= 1) return false;

    if (str.substring(0, 2).equals(str.substring(str.length() - 2)))
      return true;
    else
      return false;
  }

}
