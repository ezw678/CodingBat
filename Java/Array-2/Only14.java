// Given an array of ints, return true if every element is a 1 or a 4.

public class Only14 {

  public static void main(String[] args) {
    int [] arr = {1, 4, 1, 4};

    System.out.println(only14(arr));
    // output: true
  }

  public static boolean only14(int[] nums) {
    for (int i : nums)
      if (i != 1 && i != 4)
        return false;

    return true;
  }

}
