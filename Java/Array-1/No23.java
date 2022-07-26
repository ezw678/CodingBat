// Given an int array length 2, return true if it does not contain a 2 or 3.

public class No23 {

  public static void main(String[] args) {
    int [] arr = {4, 5};
    System.out.println(no23(arr));
    // output: true
  }

  public static boolean no23(int[] nums) {
    return nums[0] != 2 && nums[1] != 2 && nums[0] != 3 && nums[1] != 3;
  }

}
