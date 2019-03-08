package lab1;

public class Asus extends MainBoard{
	private static String cName="Asus";
	private static String Name="The Second Verison";
	private static int speed=10;
	private static int price=800;
	
	public final int getPrice() {
		return price;
	}
	public final void getDescription() {
		System.out.println("MainBoard,"+cName+","+Name+",speed:"+speed);
	}
}
