// Given 2 int arrays, a and b, return a new array length 2 containing, as
// much as will fit, the elements from a followed by the elements from b.
// The arrays may be any length, including 0, but there will be 2 or more
// elements available between the 2 arrays.

import java.util.Arrays;

public class Make2 {

  public static void main(String[] args) {
    int [] a = {4, 5};
    int [] b = {1, 2, 3};
    System.out.println(Arrays.toString(make2(a, b)));
    // output: [4, 5]
  }

  public static int[] make2(int[] a, int[] b) {
    int len_a = a.length;
    int len_b = b.length;
    int [] arr = new int [2];

    switch (len_a) {
    case 0:
      arr[0] = b[0];
      arr[1] = b[1];
      break;
    case 1:
      arr[0] = a[0];
      arr[1] = b[0];
      break;
    case 2:
      arr[0] = a[0];
      arr[1] = a[1];
      break;
    default:
      arr[0] = a[0];
      arr[1] = a[1];
      break;
    }

    return arr;
  }

}
