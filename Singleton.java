package homework;

class Single {
	int num=0; 
	private static Single s=new Single();
	private Single() {
	}
	public static Single getSingleton() {
		return s;
	}
}

public class Singleton {
	public static void main(String[] args) {
		Single s1=Single.getSingleton();
		System.out.println(s1.num++);
		Single s2=Single.getSingleton();
		System.out.println(s2.num);
	}
}
