// Given an array of ints of odd length, return a new array length 3
// containing the elements from the middle of the array. The array
// length will be at least 3.

import java.util.Arrays;

public class MidThree {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(midThree(arr)));
    // output: [2, 3, 4]
  }

  public static int[] midThree(int[] nums) {
    int mid = nums.length / 2;
    int [] arr = {nums[mid - 1], nums[mid], nums[mid + 1]};

    return arr;
  }

}
