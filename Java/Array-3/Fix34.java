// Return an array that contains exactly the same numbers as the given array, but rearranged
// so that every 3 is immediately followed by a 4. Do not move the 3's, but every other
// number may move. The array contains the same number of 3's and 4's, every 3 has a number
// after it that is not a 3, and a 3 appears in the array before any 4.

import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class Fix34 {

  public static void main(String[] args) {
    int [] arr = {1, 3, 1, 4, 4, 3, 1};
    int [] clone = arr.clone();

    System.out.println(Arrays.toString(fix34(arr)));
    System.out.println(Arrays.toString(fix34v2(clone)));
    // output: [1, 3, 4, 1, 1, 3, 4]
  }

  // solution 1
  public static int[] fix34(int[] nums) {
    int len = nums.length;

    for (int i = 0; i < len - 1; i++) {
      if (nums[i] == 3 && nums[i + 1] != 4) {
        findReplaceNext4(nums, i);
      }
    }

    return nums;
  }

  static void  findReplaceNext4(int [] nums, int idx3) {
    int len = nums.length;

    for (int i = 0; i < len; i++) {
      if (nums[i] == 4 && (i == 0 || nums[i - 1] != 3)) {
        swap(nums, i, idx3 + 1);
        break;
      }
    }
  }

  static void swap (int [] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  // solution 2
  public static int[] fix34v2(int[] nums) {
    int len = nums.length;

    Queue<Integer> q3 = new LinkedList<>();
    Queue<Integer> q4 = new LinkedList<>();

    for (int i = 0; i < len; i++) {
      if (nums[i] == 3)
        q3.add(i);

      if (nums[i] == 4)
        q4.add(i);
    }

    while (!q3.isEmpty()) {
      int indx3 = q3.poll();
      int indx4 = q4.poll();

      swap(nums, indx3 + 1, indx4);
    }

    return nums;
  }

}
