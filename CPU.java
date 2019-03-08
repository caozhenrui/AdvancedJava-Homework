package lab1;

public abstract class CPU {
	public void work() {
		System.out.println("CPU is working");
	}
	public abstract int getPrice();
	public abstract void getDescription();
}