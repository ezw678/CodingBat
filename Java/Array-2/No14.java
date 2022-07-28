// Given an array of ints, return true if it contains no 1's or it contains no 4's.

public class No14 {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3};

    System.out.println(no14(arr));
    // output: true
  }

  public static boolean no14(int[] nums) {
    boolean f1 = false;
    boolean f4 = false;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1 && !f1) {
        f1 = true;
      }
      if (nums[i] == 4 && !f4) {
        f4 = true;
      }
    }

    return (f1 && !f4) ||  (!f1 && f4) ||  (!f1 && !f4) ;
  }

}
