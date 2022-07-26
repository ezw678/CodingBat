// Given an array of ints length 3, return an array with the elements
// "rotated left" so {1, 2, 3} yields {2, 3, 1}.
import java.util.Arrays;

public class RotateLeft3 {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3};
    System.out.println(Arrays.toString(rotateLeft3(arr)));
    // output: [2, 3, 1]
  }

  public static int[] rotateLeft3(int[] nums) {
    int temp = nums[0];
    nums[0] = nums[1];
    nums [1] = nums[2];
    nums[2] = temp;

    return nums;
  }

}
