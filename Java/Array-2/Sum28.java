// Given an array of ints, return true if the sum of all the 2's in the array is
// exactly 8.
import java.util.Arrays;

public class Sum28 {

  public static void main(String[] args) {
    int [] arr = {2, 3, 2, 2, 4, 2};

    System.out.println(sum28(arr));
    // output: true
  }

  public static boolean sum28(int[] nums) {
    int sum = Arrays.stream(nums).boxed().filter(i->i == 2).mapToInt(Integer::intValue).sum();

    if (sum == 8)
      return true;
    else
      return false;
  }

}
