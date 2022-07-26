// Given 3 int values, a b c, return their sum. However, if any of the values is
// a teen -- in the range 13..19 inclusive -- then that value counts as 0,
// except 15 and 16 do not count as a teens. Write a separate helper "public
// int fixTeen(int n) {"that takes in an int value and returns that value fixed
// for the teen rule. In this way, you avoid repeating the teen code 3 times
// (i.e. "decomposition"). Define the helper below and at the same indent level
// as the main noTeenSum().


public class NoTeenSum {

  public static void main(String[] args) {
    int res = noTeenSum(1, 2, 3);
    System.out.println(res);
    // output: 6
  }

  public static int noTeenSum(int a, int b, int c) {
    int a1 = fixTeen(a);
    int b1 = fixTeen(b);
    int c1 = fixTeen(c);

    return a1 + b1 + c1;
  }

  public static int fixTeen (int n) {
    if (n >= 13 && n <= 19 && n != 15 && n != 16) {
      return 0;
    } else
      return n;
  }

}
