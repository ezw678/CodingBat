// Given an array of ints, return the sum of the first 2 elements
// in the array. If the array length is less than 2, just sum up
// the elements that exist, returning 0 if the array is length 0.

public class Sum2 {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3};
    System.out.println(sum2(arr));
    // output: 3
  }

  public static int sum2(int[] nums) {
    int len = nums.length;

    if (len == 0) return 0;
    if (len == 1) return nums[0];

    return nums[0] + nums[1];
  }

}
