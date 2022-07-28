// Given an array of ints, return true if the value 3 appears in the array exactly
// 3 times, and no 3's are next to each other.

public class HaveThree {

  public static void main(String[] args) {
    int [] arr = {3, 1, 3, 1, 3};

    System.out.println(haveThree(arr));
    // output: true
  }

  public static boolean haveThree(int[] nums) {
    int len = nums.length;

    int count = 0;
    for (int i = 0; i < len; i++) {
      if (nums[i] == 3)
        count++;

      if (i > 0 && nums[i - 1] == 3 && nums[i] == 3)
        return false;
    }

    if (count == 3)
      return true;
    else
      return false;
  }

}
