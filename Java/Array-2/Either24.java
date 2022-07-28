// Given an array of ints, return true if the array contains a 2 next to a 2 or a
// 4 next to a 4, but not both.

public class Either24 {

  public static void main(String[] args) {
    int [] arr = {1, 2, 2};

    System.out.println(either24(arr));
    // output: true
  }

  public static boolean either24(int[] nums) {
    boolean f2 = false;
    boolean f4 = false;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 2 && nums[i + 1] == 2 && !f2)
        f2 = true;

      if (nums[i] == 4 && nums[i + 1] == 4 && !f4)
        f4 = true;
    }

    if (f2 && f4)
      return false;
    else
      return f2 || f4;
  }

}
