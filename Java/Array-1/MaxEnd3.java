// Given an array of ints length 3, figure out which is larger, the first
// or last element in the array, and set all the other elements to be that
// value. Return the changed array.import java.util.Arrays;
import java.util.Arrays;

public class MaxEnd3 {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3};
    System.out.println(Arrays.toString(maxEnd3(arr)));
    // output: [3, 3, 3]
  }

  public static int[] maxEnd3(int[] nums) {
    Arrays.fill(nums, Math.max(nums[0], nums[2]));

    return nums;
  }

}
