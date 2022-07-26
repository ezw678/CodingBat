// Given 2 int arrays, a and b, of any length, return a new array with
// the first element of each array. If either array is length 0,
// ignore that array.

import java.util.Arrays;

public class Front11 {

  public static void main(String[] args) {
    int [] a = {1, 2, 3};
    int [] b = {7, 9, 8};
    System.out.println(Arrays.toString(front11(a, b)));
    // output: [1, 7]
  }

  public static int[] front11(int[] a, int[] b) {
    int len_a = a.length;
    int len_b = b.length;

    if (len_a == 0 && len_b == 0) {
      int [] arr = new int [0];
      return arr;
    } else if (len_a == 0 && len_b != 0) {
      int [] arr = new int [1];
      arr[0] = b[0];
      return arr;
    } else if (len_a != 0 && len_b == 0) {
      int [] arr = new int [1];
      arr[0] = a[0];
      return arr;
    } else {
      int [] arr = new int [2];
      arr[0] = a[0];
      arr[1] = b[0];
      return arr;
    }
  }

}
