// Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
// Return the number of clumps in the given array.

public class CountClumps {

  public static void main(String[] args) {
    int [] arr = {1, 2, 2, 3, 4, 4};

    System.out.println(countClumps(arr));
    // output: 2
  }

  public static int countClumps(int[] nums) {
    int len = nums.length;

    int count = 0;
    boolean flag = false;
    for (int i = 0; i < len - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        if (!flag) {
          count++;
          flag = true;
        }
      } else {
        if (flag) {
          flag = false;
        }
      }
    }

    return count;
  }

}
