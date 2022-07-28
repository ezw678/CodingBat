// Return the number of even ints in the given array. Note: the % "mod" operator
// computes the remainder, e.g. 5 % 2 is 1.

public class CountEvens {

  public static void main(String[] args) {
    int [] arr = {2, 1, 2, 3, 4};

    System.out.println(countEvens(arr));
    // output: 3
  }

  public static int countEvens(int[] nums) {
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      count += nums[i] % 2 == 0 ? 1 : 0;
    }

    return count;
  }

}
