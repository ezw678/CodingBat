// Return true if the given string contains a "bob" string, but where the middle 'o' char
// can be any char.

public class BobThere {

  public static void main(String[] args) {
    boolean res = bobThere("abcbob");
    System.out.println(res);
    // output: true

    boolean res2 = bobThere2("abcbob");
    System.out.println(res2);
    // output: true
  }

  public static boolean bobThere(String str) {
    int len = str.length();

    for (int i = 0; i < len - 2; i++) {
      if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
        return true;
    }

    return false;
  }

  public static boolean bobThere2(String str) {
    return str.matches (".*b.b.*");
  }

}
