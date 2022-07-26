// Given 2 arrays of ints, a and b, return true if they have the same first
// element or they have the same last element. Both arrays will be length
// 1 or more.

public class CommonEnd {

  public static void main(String[] args) {
    int [] a = {1, 2, 3}  ;
    int [] b = {7, 3};

    boolean res = commonEnd(a, b);
    System.out.println(res);
    // output: true;
  }

  public static boolean commonEnd(int[] a, int[] b) {
    int len_a = a.length;
    int len_b = b.length;

    return a[0] == b[0] || a[len_a - 1] == b[len_b - 1];
  }

}
