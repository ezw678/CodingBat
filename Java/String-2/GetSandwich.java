// A sandwich is two pieces of bread with something in between. Return the string that is
// between the first and last appearance of "bread" in the given string, or return the
// empty string "" if there are not two pieces of bread.

public class GetSandwich {

  public static void main(String[] args) {
    String res = getSandwich("breadjambread");

    System.out.println(res);
    // output: jam
  }

  public static String getSandwich(String str) {
    int indxl = str.indexOf("bread");
    int indxr = str.lastIndexOf("bread");

    if (indxl == -1 || indxl == indxr) return "";

    return str.substring(indxl + 5, indxr);
  }

}
