// Given an array of ints, return true if the array is length 1 or more,
// and the first element and the last element are equal.

public class SameFirstLast {

  public static void main(String[] args) {
    boolean res = sameFirstLast(new int [] {1, 2, 3});
    System.out.println(res);
    // output: false
  }

  public static boolean sameFirstLast(int[] nums) {
    return (nums.length > 0 && nums[0] == nums[nums.length - 1]);
  }

}
