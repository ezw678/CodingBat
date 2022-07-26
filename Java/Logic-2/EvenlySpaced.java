// Given three ints, a b c, one of them is small, one is medium
// and one is large. Return true if the three values are evenly
// spaced, so the difference between small and medium is the
// same as the difference between medium and large.

import java.util.Arrays;

public class EvenlySpaced {

  public static void main(String[] args) {
    boolean res = evenlySpaced(2, 4, 6);
    System.out.println(res);
    // output: true
  }

  public static boolean evenlySpaced(int a, int b, int c) {
    int [] arr = {a, b, c};
    Arrays.sort(arr);

    return arr[2] - arr[1] == arr[1] - arr[0];
  }

}
