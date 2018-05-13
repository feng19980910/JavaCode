public class class_ {
	public static int height() {
		int height = 6;
		return height;
	}
	public static String out() {
		String str = "This is a string";
		return str;
	}
	
	public static Test test() {
		int i = 5;
		String mm = "test";
		Test te = new Test(i, mm);
		return te;
	}
	
	public static void main(String [] args) {
		System.out.println(test());
		System.out.println(test().i);
		System.out.println(test().m);
	}
	
}

class Test {
	public int i;
	public String m;
	Test(int i, String m) {
		this.i = i;
		this.m = m;
	}
}