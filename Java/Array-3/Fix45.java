// (This is a slightly harder version of the fix34 problem.) Return an array that contains
// exactly the same numbers as the given array, but rearranged so that every 4 is immediately
// followed by a 5. Do not move the 4's, but every other number may move. The array contains
// the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this
// version, 5's may appear anywhere in the original array.

import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class Fix45 {

  public static void main(String[] args) {
    int [] arr = {5, 4, 9, 4, 9, 5};
    int [] clone = arr.clone();

    System.out.println(Arrays.toString(fix45(arr)));
    System.out.println(Arrays.toString(fix45v2(clone)));
    // output: [9, 4, 5, 4, 5, 9]
  }

  // solution 1
  public static int[] fix45(int[] nums) {
    int len = nums.length;

    for (int i = 0; i < len - 1; i++) {
      if (nums[i] == 4 && nums[i + 1] != 5) {
        findReplaceNext5(nums, i);
      }
    }

    return nums;
  }

  static void findReplaceNext5(int [] nums, int idx3) {
    int len = nums.length;

    for (int i = 0; i < len; i++) {
      if (nums[i] == 5 && (i == 0 || nums[i - 1] != 4)) {
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
  public static int[] fix45v2(int[] nums) {
    int len = nums.length;

    Queue<Integer> q4 = new LinkedList<>();
    Queue<Integer> q5 = new LinkedList<>();

    for (int i = 0; i < len - 1; i++) {
      if (nums[i] == 4 && nums[i + 1] != 5)
        q4.add(i);
    }

    for (int i = 0; i < len; i++) {
      if (nums[i] == 5 && (i == 0 || nums[i - 1] != 4))
        q5.add(i);
    }

    while (!q4.isEmpty()) {
      int idx4 = q4.poll();
      int idx5 = q5.poll();

      swap (nums, idx4 + 1, idx5);

    }

    return nums;
  }

}
