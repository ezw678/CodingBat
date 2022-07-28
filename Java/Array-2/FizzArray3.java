// Given start and end numbers, return a new array containing the sequence of integers
// from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}.
// The end number will be greater or equal to the start number. Note that a length-0
// array is valid.

import java.util.Arrays;

public class FizzArray3 {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(fizzArray3(5, 10)));
    // output: [5, 6, 7, 8, 9]
  }

  public static int[] fizzArray3(int start, int end) {
    int [] arr = new int [end - start];

    for (int i = start; i < end; i++) {
      arr[i - start] = i;
    }

    return arr;
  }

}
