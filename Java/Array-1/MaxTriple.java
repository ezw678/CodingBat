// Given an array of ints of odd length, look at the first, last, and
// middle values in the array and return the largest. The array length
// will be a least 1.

public class MaxTriple {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3};
    System.out.println(maxTriple(arr));
    // output: 3
  }

  public static int maxTriple(int[] nums) {
    int len = nums.length;

    if (len == 1) return nums[0];

    return Math.max(nums[0], Math.max(nums[len / 2], nums[len - 1]));
  }

}
