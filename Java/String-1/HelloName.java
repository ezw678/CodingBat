/* Given a string name, e.g. "Bob", return a greeting of the
form "Hello Bob!". */

public class HelloName {

	public static void main(String[] args) {
		String res = helloName("Bob");
		System.out.println(res);
		// output "Hello Bob!"
	}

	public static String helloName(String name) {
		return "Hello "  + name + "!";
	}

}
