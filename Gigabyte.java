package lab1;

public class Gigabyte extends MainBoard{
	private static String cName="Gigabyte";
	private static String Name="The First Verison";
	private static int speed=12;
	private static int price=850;
	
	public final int getPrice() {
		return price;
	}
	public final void getDescription() {
		System.out.println("MainBoard,"+cName+","+Name+",speed:"+speed);
	}
}
