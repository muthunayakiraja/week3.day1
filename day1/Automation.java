package week3.day1;

public class Automation extends Multiplelanguage  implements Language, TestTool{

	public static void main(String[] args) {
		 Automation aa = new Automation();
		 aa.java();
		 aa.ruby();
aa.selenium();
aa.python();
	}

	public void selenium() {
System.out.println("selenium");
		
	}

	public void java() {
		System.out.println("java");
		
	}

	@Override
	public void python() {
		System.out.println("python");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}

}
