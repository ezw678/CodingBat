// Given a string and an int n, return a string made of the first n characters of the string,
// followed by the first n-1 characters of the string, and so on. You may assume that n is
// between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

public class RepeatFront {

  public static void main(String[] args) {
    String res = repeatFront("Chocolate", 4);

    System.out.println(res);
    // output: ChocChoChC
  }

  public static String repeatFront(String str, int n) {
    String res = "";
    for (int i = n; i >= 0; i--) {
      res += str.substring(0, i);
    }

    return res;
  }

}
