// Given an array of ints length 3, return a new array with the
// elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
import java.util.Arrays;

public class Reverse3 {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3};
    System.out.println(Arrays.toString(reverse3(arr)));
    // output: [3,2,1]
  }

  public static int[] reverse3(int[] nums) {
    int [] arr = new int [3];

    int j = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
      arr[j] = nums[i];
      j++;
    }

    return arr;
  }

}
