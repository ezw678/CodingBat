// Start with 2 int arrays, a and b, each length 2. Consider the sum of the
// values in each array. Return the array which has the largest sum. In event
// of a tie, return a.

import java.util.Arrays;

public class BiggerTwo {

  public static void main(String[] args) {
    int [] a = {1, 2} ;
    int [] b = {3, 4} ;
    System.out.println(Arrays.toString(biggerTwo(a, b)));
    // output: [3, 4]
  }

  public static int[] biggerTwo(int[] a, int[] b) {
    int sum_a = a[0] + a[1];
    int sum_b = b[0] + b[1];
    if (sum_a >= sum_b)
      return a;
    else
      return b;
  }

}
