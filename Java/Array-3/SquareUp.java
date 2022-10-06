// Given n>=0, create an array length n*n with the following pattern, shown here
// for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

import java.util.Arrays;

public class SquareUp {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(squareUp(3)));
    // output: [0, 0, 1, 0, 2, 1, 3, 2, 1]
  }

  public static int[] squareUp(int n) {
    int len = n * n;
    int [] arr = new int [len];

    int count = 0;
    for (int i = len - 1; i >= 0; i = i - n) {
      for (int j = 0; j < n - count; j++) {
        arr[i - j] = j + 1;
      }
      count++;
    }

    return arr;
  }

}
