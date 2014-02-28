package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("ab?是(c)");
		Matcher m = p.matcher("ab是cab");
		while (m.find()) {
			/*group是针对（）来说的，group（0）就是指的整个串，
			 * group（1） 指的是第一个括号里的东西，
			 * group（2）指的第二个括号里的东西。*/
			String link0 = m.group(0);
			String link1 = m.group(1);
			System.out.println(link0+"..."+link1);
		}
	}
}
