// Given two arrays of ints sorted in increasing order, outer and inner, return true if
// all of the numbers in inner appear in outer. The best solution makes only a single
// "linear" pass of both arrays, taking advantage of the fact that both arrays are
// already in sorted order.

import java.util.Arrays;

public class LinearIn {

  public static void main(String[] args) {
    int [] outer = {1, 2, 4, 6};
    int [] inner = {2, 4};

    System.out.println(linearIn(outer, inner));
    System.out.println(linearIn2(outer, inner));
    // output: true
  }

  // solution 1
  public static boolean linearIn(int[] outer, int[] inner) {
    int len_in = inner.length;

    for (int i = 0; i < len_in; i++) {
      if (Arrays.binarySearch(outer, inner[i]) < 0)
        return false;
    }

    return true;
  }

  // solution 2
  public static boolean linearIn2(int[] outer, int[] inner) {
    int len_out = outer.length;
    int len_in = inner.length;

    int j = 0;
    for (int i = 0; i < len_out && j < len_in; i++) {
      if (outer[i] > inner[j])
        return false;

      if (outer[i] == inner[j])
        j++;
    }

    return j == inner.length;
  }

}
