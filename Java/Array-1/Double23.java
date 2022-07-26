// Given an int array, return true if the array contains 2 twice,
// or 3 twice. The array will be length 0, 1, or 2.

public class Double23 {

  public static void main(String[] args) {
    int [] arr = {2, 2};
    System.out.println(double23(arr));
    // output: true
  }

  public static boolean double23(int[] nums) {
    int len = nums.length;

    if (len <= 1) return false;

    return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
  }

}
