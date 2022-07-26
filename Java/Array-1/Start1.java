// Start with 2 int arrays, a and b, of any length. Return how many of
// the arrays have 1 as their first element.

import java.util.Arrays;

public class Start1 {

  public static void main(String[] args) {
    int [] a = {1, 2, 3};
    int [] b = {1, 3};
    System.out.println(start1(a, b));
    // output: 2
  }

  public static int start1(int[] a, int[] b) {
    int count = 0;
    if (a.length != 0 && a[0] == 1) count++;
    if (b.length != 0 && b[0] == 1) count++;

    return count;
  }

}
