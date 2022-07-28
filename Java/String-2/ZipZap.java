// Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z'
// and ending with 'p'. Return a string where for all such words, the middle letter is
// gone, so "zipXzap" yields "zpXzp".

public class ZipZap {

  public static void main(String[] args) {
    String res = zipZap("zipXzap");

    System.out.println(res);
    // output: zpXzp
  }

  public static String zipZap(String str) {
    return str.replaceAll("z[a-zA-Z]p", "zp");
  }

}
