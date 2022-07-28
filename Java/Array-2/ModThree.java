// Given an array of ints, return true if the array contains either 3 even or 3
// odd values all next to each other.

public class ModThree {

  public static void main(String[] args) {
    int [] arr = {2, 1, 3, 5};

    System.out.println(modThree(arr));
    // output: true
  }

  public static boolean modThree(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
      int r1 = nums[i] % 2;
      int r2 = nums[i + 1] % 2;
      int r3 = nums[i + 2] % 2;

      if (r1 == 0 && r2 == 0 && r3 == 0)
        return true;

      if (r1 != 0 && r2 != 0 && r3 != 0)
        return true;
    }

    return false;
  }

}
