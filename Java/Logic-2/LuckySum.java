// Given 3 int values, a b c, return their sum. However, if one of the values is 13
// then it does not count towards the sum and values to its right do not count.
// So for example, if b is 13, then both b and c do not count.

public class LuckySum {

  public static void main(String[] args) {
    int res = luckySum(1, 2, 3);
    System.out.println(res);
    // output: 6
  }

  public static int luckySum(int a, int b, int c) {
    int sum = 0;
    int [] arr = {a, b, c};
    for (int i : arr) {
      if (i == 13)
        break;
      else
        sum += i;
    }

    return sum;
  }

}
