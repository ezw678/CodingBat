// Given an int array, return a new array with double the length where
// its last element is the same as the original array, and all the other
// elements are 0. The original array will be length 1 or more. Note:
// by default, a new int array contains all 0's.

import java.util.Arrays;

public class MakeLast {

  public static void main(String[] args) {
    int [] arr = {4, 5, 6};
    System.out.println(Arrays.toString(makeLast(arr)));
    // output: [0, 0, 0, 0, 0, 6]
  }

  public static int[] makeLast(int[] nums) {
    int len = nums.length;
    int [] arr = new int [len * 2];
    Arrays.fill(arr, 0);

    arr[len * 2 - 1] = nums[len - 1];
    return arr;
  }

}
