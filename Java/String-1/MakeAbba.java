/* Given two strings, a and b, return the result of putting them together
in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". */

public class MakeAbba {

	public static void main(String[] args) {
		String res = makeAbba("Hi", "Bye");
		System.out.println(res);
		// output: "HiByeByeHi"
	}

	public static String makeAbba(String a, String b) {
		return a + b + b + a;
	}

}
