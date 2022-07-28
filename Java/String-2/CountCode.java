// Return the number of times that the string "code" appears anywhere in the given
// string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

public class CountCode {

  public static void main(String[] args) {
    int res = countCode("aaacodebbb");

    System.out.println(res);
    // output: 1
  }

  public static int countCode(String str) {
    int len = str.length();

    int count = 0;
    for (int i = 0; i < len - 3; i++) {
      String s = str.substring(i, i + 2);
      if (s.equals("co") && str.charAt(i + 3) == 'e')
        count++;
    }

    return count;
  }

}
