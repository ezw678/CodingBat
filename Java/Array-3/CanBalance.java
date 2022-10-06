// Given a non-empty array, return true if there is a place to split the array so that the sum of
// the numbers on one side is equal to the sum of the numbers on the other side.

public class CanBalance {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3, 1, 0, 2, 3};

    System.out.println(canBalance(arr));
    System.out.println(canBalance2(arr));
    // output: true
  }

  // solution 1
  public static boolean canBalance(int[] nums) {
    int len = nums.length;
    if (len == 0) return true;
    if (len == 1) return false;
    if (len == 2) return nums[0] == nums[1];

    int mid = len / 2;
    boolean left_bigger = false;
    boolean right_bigger = false;
    boolean success = false;
    while (mid >= 0 && mid < len) {
      int sum_left = getSum(nums, 0, mid);
      int sum_right = getSum(nums, mid + 1, len - 1);
      if (sum_left == sum_right) {
        success = true;
        break;
      } else if (sum_left > sum_right) {
        if (right_bigger) {
          success = false;
          break;
        }

        left_bigger = true;
        mid -= 1;
      } else {
        if (left_bigger) {
          success = false;
          break;
        }

        right_bigger = true;
        mid += 1;
      }
    }

    return success;
  }

  static int getSum(int [] nums, int l, int r) {
    int sum = 0;
    for (int i = l; i <= r; i++) {
      sum += nums[i];
    }
    return sum;
  }

  // solution 2
  public static boolean canBalance2(int[] nums) {
    int len = nums.length;
    if (len == 0) return true;
    if (len == 1) return false;

    int l_sum = 0;
    int r_sum = 0;

    for (int i = 0; i < len; i++) {
      l_sum += nums[i];
    }

    for (int i = len - 1; i >= 0; i--) {
      r_sum += nums[i];
      l_sum -= nums[i];

      if (r_sum == l_sum)
        return true;
    }

    return false;
  }

}
