// Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
import java.util.Arrays;

public class MakePi {

  public static void main(String[] args) {
    int [] arr = makePi();
    System.out.println(Arrays.toString(arr));
    // output: [3, 1, 4]
  }

  public static int[] makePi() {
    int [] arr = {3, 1, 4};
    return arr;
  }

}
