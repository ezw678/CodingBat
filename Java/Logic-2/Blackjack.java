// Given 2 int values greater than 0, return whichever value is
// nearest to 21 without going over. Return 0 if they both go over.

public class Blackjack {

  public static void main(String[] args) {
    int res = blackjack(19, 21);
    System.out.println(res);
    // output: 21
  }

  public static int blackjack(int a, int b) {
    if (a > 21 && b > 21)
      return 0;
    else if (a <= 21 && b > 21)
      return a;
    else if (a > 21 && b <= 21)
      return b;
    else {
      if (a >= b)
        return a;
      else
        return b;
    }
  }

}
