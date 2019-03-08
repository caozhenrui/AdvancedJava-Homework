package lab1;

public class ComputerStore {
	public static void main(String[] args) {
		Computer c1=new Computer("Lenovo");
		Computer c2=new Computer("Dell");
		Computer c3=new Computer("Apple");
		
		c1.setComputer(new Intel(),new Samsung(),new WestDigitals(),new Gigabyte());
		c2.setComputer(new AMD(),new Kingston(),new Seagate(),new Asus());
		c3.setComputer(new AMD(),new Samsung(),new Seagate(),new Gigabyte());
		
		c1.getInfo();
		c2.getInfo();
		c3.getInfo();
	}
}
