// Given an int array of any length, return a new array of its first 2
// elements. If the array is smaller than length 2, use whatever elements
// are present.

import java.util.Arrays;

public class FrontPiece {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3};
    System.out.println(Arrays.toString(frontPiece(arr)));
    // output: [1, 2]
  }

  public static int[] frontPiece(int[] nums) {
    int len = nums.length;
    if (len <= 1) return nums;

    int [] arr = {nums[0], nums[1]};

    return arr;
  }

}
