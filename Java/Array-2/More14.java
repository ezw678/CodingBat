// Given an array of ints, return true if the number of 1's is greater than
// the number of 4's

public class More14 {

  public static void main(String[] args) {
    int [] arr = {1, 4, 1};

    System.out.println(more14(arr));
    // output: true
  }

  public static boolean more14(int[] nums) {
    int c1 = 0;
    int c4 = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1)
        c1++;

      if (nums[i] == 4)
        c4++;
    }

    return c1 > c4;
  }

}
