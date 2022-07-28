// Given an array of ints, return true if every 2 that appears in the array is
// next to another 2.

public class TwoTwo {

  public static void main(String[] args) {
    int [] arr = {4, 2, 2, 3};

    System.out.println(twoTwo(arr));
    // output: true
  }

  public static boolean twoTwo(int[] nums) {
    if (nums.length == 0) return true;
    if (nums.length == 1) return nums[0] != 2;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 2 && nums[i + 1] != 2) {
        if (i == 0)
          return false;
        else if (i > 0 && nums[i - 1] != 2)
          return false;
      }
    }

    if (nums[nums.length - 2] != 2 && nums[nums.length - 1] == 2)
      return false;

    return true;
  }

}
