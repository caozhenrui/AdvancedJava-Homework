package lab1;

public class Samsung extends Memory{
	private static String cName="Samsung";
	private static String Name="The Second Verison";
	private static int volume=4;
	private static int price=800;
	
	public final int getPrice() {
		return price;
	}
	public final void getDescription() {
		System.out.println("Memory,"+cName+","+Name+",volume:"+volume);
	}
}
