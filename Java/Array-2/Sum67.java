// Return the sum of the numbers in the array, except ignore sections of numbers
// starting with a 6 and extending to the next 7 (every 6 will be followed by at
// least one 7). Return 0 for no numbers.

public class Sum67 {

  public static void main(String[] args) {
    int [] arr = {1, 2, 2};

    System.out.println(sum67(arr));
    // output: 5
  }

  public static int sum67(int[] nums) {
    if (nums.length == 0) return 0;

    int sum = 0;
    boolean flag = false;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 6 && !flag) {
        flag = true;
        continue;
      }
      if (flag && nums[i] == 7) {
        flag = false;
        continue;
      }
      if (!flag)
        sum += nums[i];
    }

    return sum;
  }

}
