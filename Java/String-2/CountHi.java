// Return the number of times that the string "hi" appears anywhere in the given string.

public class CountHi {

  public static void main(String[] args) {
    int res = countHi("abc hi ho");

    System.out.println(res);
    // output: 1
  }

  public static int countHi(String str) {
    int len = str.length();

    int count = 0;
    for (int i = 0; i < len - 1; i++) {
      String curr = str.substring(i, i + 2);
      if (curr.equals("hi"))
        count++;

    }

    return count;
  }

}
