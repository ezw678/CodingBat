// Given 3 int values, a b c, return their sum. However, if one of the
// values is the same as another of the values, it does not count
// towards the sum.

public class LoneSum {

  public static void main(String[] args) {
    int res = loneSum(1, 2, 3);
    System.out.println(res);
    // output:  6
  }

  public static int loneSum(int a, int b, int c) {
    if (a == b && b == c)
      return 0;
    else if (a == b && b != c)
      return c;
    else if (a != b && b == c)
      return a;
    else if (a != b && a == c)
      return b;
    else
      return a + b + c;
  }

}
