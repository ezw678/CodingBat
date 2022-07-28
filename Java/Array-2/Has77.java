// Given an array of ints, return true if the array contains two 7's next to each
// other, or there are two 7's separated by one element, such as with {7, 1, 7}.

public class Has77 {

  public static void main(String[] args) {
    int [] arr = {1, 7, 7};

    System.out.println(has77(arr));
    // output: true
  }

  public static boolean has77(int[] nums) {
    int len = nums.length;

    for (int i = 0; i < len - 1; i++) {
      if ((nums[i] == 7 && nums[i + 1] == 7) || (i < len - 2 && nums[i] == 7 && nums[i + 2] == 7))
        return true;
    }

    return false;
  }

}
