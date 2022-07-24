// The web is built with HTML strings like "<i>Yay</i>" which draws
// Yay as italic text. In this example, the "i" tag makes <i> and </i>
// which surround the word "Yay". Given tag and word strings, create
// the HTML string with tags around the word, e.g. "<i>Yay</i>".

public class MakeTags {
	public static void main(String[] args) {
		String res = makeTags("i", "Yay");
		System.out.println(res);
		// output: "<i>Yay</i>"
	}

	public static String makeTags(String tag, String word) {
		return "<" + tag + ">" + word  + "</" + tag + ">";
	}

}
