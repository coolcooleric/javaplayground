import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TestRegexGrp {
	
  static Formatter f = new Formatter(System.out);
	static void printFind(Matcher m){
		while(m.find()){
			f.format("%-10d %-10d %-15s\n", m.start(), m.end(), m.group());
		}
		System.out.println("-------------------------------------");
	}
	
	
	public static void main(String[] args) {
		f.format("%-10s %-10s %-15s\n", "start", "end", "group");
		f.format("%-10s %-10s %-15s\n", "----------", "----------", "---------------");
		String reStr = "(?:=\\d{2})(.*)";
		Pattern p = Pattern.compile(reStr);
		Matcher m = p.matcher("=88superjava");
		System.out.println("non capturing group");
		printFind(m);
		System.out.println("positive looking ahead");
		m.usePattern(Pattern.compile("(?=\\d{2}).*"));
		m.reset("x88superjava");
		printFind(m);
		System.out.println("negative looking ahead");
		m.usePattern(Pattern.compile("(?!super).*"));
		m.reset();
		printFind(m);// right after 8, no super
		System.out.println("positive looking behind");
		m.usePattern(Pattern.compile("(?<=\\d{2}).*"));
		m.reset();// comment out this line, see the difference
		printFind(m);
		System.out.println("negative looking behind");
		m.usePattern(Pattern.compile("(?<!\\d{2}).*"));
		m.reset();
		printFind(m);// surprise uh?
		
		System.out.println("reluctant find");
		m.usePattern(Pattern.compile(".*?"));
		m.reset();
		printFind(m);
		
		System.out.println("possesive find");
		m.usePattern(Pattern.compile(".*+"));
		m.reset();
		printFind(m);
		
		System.out.println("greedy find");
		m.usePattern(Pattern.compile(".*"));
		m.reset();
		printFind(m);
		
		String s1 = "&#x78;";
		m.usePattern(Pattern.compile("(?<=&#x)\\d+(?=;)"));
		m.reset(s1);
		printFind(m);
	}
}
