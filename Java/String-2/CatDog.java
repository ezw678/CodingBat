
// Return true if the string "cat" and "dog" appear the same number of times in the given string.

public class CatDog {

  public static void main(String[] args) {
    boolean res = catDog("catdog");

    System.out.println(res);
    // output: true
  }

  public static boolean catDog(String str) {
    int len = str.length();

    int count_dog = 0;
    int count_cat = 0;
    for (int i = 0; i < len - 2; i++) {
      String curr = str.substring(i, i + 3);
      if (curr.equals("cat"))
        count_cat++;

      if (curr.equals("dog"))
        count_dog++;
    }

    return count_dog == count_cat;
  }

}
