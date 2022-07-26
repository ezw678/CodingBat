// Given an int array length 2, return true if it contains a 2 or a 3.

public class Has23 {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3};
    System.out.println(has23(arr));
    // output: true
  }

  public static boolean has23(int[] nums) {
    return nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3;
  }

}
