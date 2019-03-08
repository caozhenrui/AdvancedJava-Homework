package lab1;

public class Computer {
	private String Name;
	private int sumPrice;
	private CPU cpu;
	private Memory memory;
	private HardDisk hDisk;
	private MainBoard mBoard;
	
	public Computer(String str) {
		this.Name=str;
	}
	
	public void setComputer(CPU c, Memory m, HardDisk h, MainBoard b){
		this.cpu=c;
		this.memory=m;
		this.hDisk=h;
		this.mBoard=b;	
	}
	
	private void showDescription() {
		this.cpu.getDescription();
		this.memory.getDescription();
		this.hDisk.getDescription();
		this.mBoard.getDescription();
	}
	
	private int showPrice() {
		this.sumPrice=cpu.getPrice()+memory.getPrice()+hDisk.getPrice()+mBoard.getPrice();
		return this.sumPrice;
	}
	
	private void showWorkState() {
		this.cpu.work();
		this.memory.work();
		this.hDisk.work();
		this.mBoard.work();
	}
	
	public void getInfo() {
		System.out.println("************");
		System.out.println("Description of the computer: "+this.Name);
		this.showDescription();
		System.out.println("------------");
		System.out.println("Total price: "+ this.showPrice());
		System.out.println("------------");
		System.out.println("Work state: ");
		this.showWorkState();
		System.out.println("************");
	}
}
