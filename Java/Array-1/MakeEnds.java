// Given an array of ints, return a new array length 2 containing the first
// and last elements from the original array. The original array will be
// length 1 or more.

import java.util.Arrays;

public class MakeEnds {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3};
    System.out.println(Arrays.toString(makeEnds(arr)));
    // output: [1, 3]
  }

  public static int[] makeEnds(int[] nums) {
    int [] arr = {nums[0], nums[nums.length - 1]};

    return arr;
  }

}
