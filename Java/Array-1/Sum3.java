// Given an array of ints length 3, return the sum of all the elements.

public class Sum3 {

  public static void main(String[] args) {
    int [] arr = {1, 2, 3};
    int res = sum3(arr);
    System.out.println(res);
    // output: 4
  }

  public static int sum3(int[] nums) {
    int sum = 0;

    for (int i : nums) {
      sum += i;
    }

    return sum;
  }

}
