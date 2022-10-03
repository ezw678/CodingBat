// Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the
// 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z
// is at the end of a word if there is not an alphabetic letter immediately following it.
// (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

public class CountYZ {

  public static void main(String[] args) {
    String str = "fez day";
    System.out.println(countYZ(str));
    System.out.println(countYZ2(str));
    // output: 2
  }

  // solution 1
  public static int countYZ(String str) {
    str = str.toLowerCase();
    String[] words = str.split("[^a-z]");

    int result = 0;
    for (int i = 0; i < words.length; i++)
      if (words[i].endsWith("y") || words[i].endsWith("z"))
        result++;

    return result;
  }

  // solution 2
  public static int countYZ2(String str) {
    return str.split("((?i)z[^a-zA-Z]|z$)|((?i)y[^a-zA-Z]|y$)", - 1).length - 1;
  }

}
