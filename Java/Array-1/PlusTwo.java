// Given 2 int arrays, each length 2, return a new array length 4 containing
// all their elements.

import java.util.Arrays;

public class PlusTwo {

  public static void main(String[] args) {
    int [] a = {1, 2};
    int [] b = {3, 4};
    System.out.println(Arrays.toString(plusTwo(a, b)));
    // output: [1, 2, 3, 4]
  }

  public static int[] plusTwo(int[] a, int[] b) {
    int [] arr = {a[0], a[1], b[0], b[1]};

    return arr;
  }

}
