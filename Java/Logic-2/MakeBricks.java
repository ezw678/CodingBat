// We want to make a row of bricks that is goal inches long. We have
// a number of small bricks (1 inch each) and big bricks (5 inches
// each). Return true if it is possible to make the goal by choosing
// from the given bricks. This is a little harder than it looks and
// can be done without any loops.

public class MakeBricks {

  public static void main(String[] args) {
    boolean res = makeBricks(3, 1, 8);
    System.out.println(res);
    // output: true
  }

  public static boolean makeBricks(int small, int big, int goal) {
    int needed = 0;

    if (big * 5 == goal) return true;
    if (small >= goal) return true;

    if (big * 5 > goal) {
      needed = goal % 5;
    } else {
      needed = goal - big * 5;
    }

    if (small >= needed)
      return true;
    else
      return false;
  }

}
