// We want make a package of goal kilos of chocolate. We have small
// bars (1 kilo each) and big bars (5 kilos each). Return the number
// of small bars to use, assuming we always use big bars before small
// bars. Return -1 if it can't be done.

public class MakeChocolate {

  public static void main(String[] args) {
    int res = makeChocolate(4, 1, 9);
    System.out.println(res);
    // output: 4
  }

  public static int makeChocolate(int small, int big, int goal) {
    int needed = 0;

    if (big * 5 >= goal)
      needed = goal % 5;
    else
      needed = goal - big * 5;

    if (small >= needed)
      return needed;
    else
      return -1;
  }

}
