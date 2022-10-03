// Given a string, return true if the number of appearances of "is" anywhere in the string is
// equal to the number of appearances of "not" anywhere in the string (case sensitive).

public class EqualIsNot {

  public static void main(String[] args) {
    String str = "This is notnot";

    System.out.println(equalIsNot(str));
    // output: true
  }

  public static boolean equalIsNot(String str) {
    str = str.replaceAll("is", "@");
    str = str.replaceAll("not", "&");
    char [] chs = str.toCharArray();

    int count = 0;
    for (char c : chs) {
      if (c == '@')
        count++;
      else if (c == '&')
        count--;
    }

    return count == 0;
  }

}
