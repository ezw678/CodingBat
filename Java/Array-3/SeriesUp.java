// Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
// (spaces added to show the grouping). Note that the length of the array will
// be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

import java.util.Arrays;

public class SeriesUp {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(seriesUp(3)));
    System.out.println(Arrays.toString(seriesUp2(3)));
    // output: [1, 1, 2, 1, 2, 3]
  }

  // solution 1
  public static int[] seriesUp(int n) {
    int len = n * (n + 1) / 2;
    int [] arr = new int [len];

    int k = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        arr[k] = j + 1;
        k++;
      }
    }

    return arr;
  }

  // solution 2
  public static int[] seriesUp2(int n) {
    int size = n * (n + 1) / 2;
    int [] arr = new int [size];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        arr[i * (i + 1) / 2 + j] = j + 1;     //triangle numbers i*(i+1)/2   1, 3, 6, 10
      }
    }

    return arr;
  }

}
