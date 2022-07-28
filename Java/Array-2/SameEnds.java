// Return true if the group of N numbers at the start and end of the array are the same.
// For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2,
// and false for n=1 and n=3. You may assume that n is in the range 0..nums.length
// inclusive.

import java.util.Arrays;

public class SameEnds {

  public static void main(String[] args) {
    int [] arr = {5, 6, 45, 99, 13, 5, 6};

    System.out.println(sameEnds(arr, 2));
    // output: false
  }

  public static boolean sameEnds(int[] nums, int len) {
    if (len == 0) return true;
    if (nums.length <= 1) return true;

    int [] a1 = Arrays.copyOfRange(nums, 0, len);
    int [] a2 = Arrays.copyOfRange(nums, nums.length - len, nums.length);

    return Arrays.equals(a1, a2);
  }

}
