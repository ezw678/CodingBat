// Return an array that contains the exact same numbers as the given array, but rearranged
// so that all the even numbers come before all the odd numbers. Other than that, the
// numbers can be in any order. You may modify and return the given array, or make a new array.

import java.util.Arrays;

public class EvenOdd {

  public static void main(String[] args) {
    int [] arr = {1, 0, 1, 0, 0, 1, 1};

    System.out.println(Arrays.toString(evenOdd(arr)));
    // output: [0, 0, 0, 1, 1, 1, 1]
  }

  public static int[] evenOdd(int[] nums) {
    int len = nums.length;

    int [] arr = new int [len];
    int l = 0, r = len - 1;

    for (int i = 0; i < len; i++) {
      if (nums[i] % 2 == 0) {
        arr[l] = nums[i];
        l++;
      } else {
        arr[r] = nums[i];
        r--;
      }
    }

    return arr;
  }

}
