// We'll say that a "mirror" section in an array is a group of contiguous elements such that
// somewhere in the array, the same group appears in reverse order. For example, the largest
// mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the
// size of the largest mirror section found in the given array.

public class MaxMirror {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3, 8, 9, 3, 2, 1};

    System.out.println(maxMirror(arr));
    System.out.println(maxMirror2(arr));
    // output: 3
  }

  // solution 1
  public static int maxMirror(int[] nums) {
    int len = nums.length;
    if (len <= 1) return len;

    int max = Integer.MIN_VALUE;
    int l = 0, r = 0;
    for (int i = 0; i < len; i++) {
      for (int j = len - 1; j > i; j--) {
        if (nums[j] == nums[i]) {
          l = i + 1;
          r = j - 1;
          while (l < len && r >= 0) {
            if (nums[l] != nums[r]) {
              break;
            }
            l++;
            r--;
          }

          max = Math.max(max, (int) Math.abs(l - i));
        }
      }
    }

    return max;
  }

  // solution 2
  public static int maxMirror2(int[] nums) {
    int len = nums.length;
    if (len <= 1) return len;

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < len; i++) {
      int count = 0;
      for (int j = len - 1; j >= i && i + count < len; j--) {
        if (nums[j] == nums[i + count]) {
          count++;
          max = Math.max(max, count);
        } else {
          count = 0;
        }
      }
    }

    return max;
  }

}
