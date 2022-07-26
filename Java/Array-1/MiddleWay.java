// Given 2 int arrays, a and b, each length 3, return a new array
// length 2 containing their middle elements.

import java.util.Arrays;

public class MiddleWay {

  public static void main(String[] args) {
    int [] a = {1, 2, 3};
    int [] b = {4, 5, 6};
    System.out.println(Arrays.toString(middleWay(a, b)));
    // output: [2, 5]
  }

  public static int[] middleWay(int[] a, int[] b) {
    int [] arr = {a[1], b[1]};
    return arr;
  }

}
