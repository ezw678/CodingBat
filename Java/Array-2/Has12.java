// Given an array of ints, return true if there is a 1 in the array with a 2
// somewhere later in the array.

public class Has12 {

  public static void main(String[] args) {
    int [] arr = {1, 3, 2};

    System.out.println(has12(arr));
    // output: true
  }

  public static boolean has12(int[] nums) {
    boolean f1 = false;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1 && !f1)
        f1 = true;

      if (nums[i] == 2 && f1)
        return true;
    }

    return false;
  }

}
