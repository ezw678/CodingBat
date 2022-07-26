// We'll say that a 1 immediately followed by a 3 in an array is an "unlucky"
// 1. Return true if the given array contains an unlucky 1 in the first 2 or
// last 2 positions in the array.

public class Unlucky1 {

  public static void main(String[] args) {
    int [] arr = {1, 3, 4, 5};
    System.out.println(unlucky1(arr));
    // output: true
  }

  public static boolean unlucky1(int[] nums) {
    int len = nums.length;
    if (len <= 1) return false;

    if ((nums[0] == 1 && nums[1] == 3) || (nums[len - 2] == 1 && nums[len - 1] == 3))
      return true;

    if (len >= 3 && nums[1] == 1 && nums[2] == 3)
      return true;

    return false;
  }

}
