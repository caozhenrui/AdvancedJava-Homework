package lab1;

public class Kingston extends Memory{
	private static String cName="Kingston";
	private static String Name="The Fourth Verison";
	private static int volume=4;
	private static int price=850;
	
	public final int getPrice() {
		return price;
	}
	public final void getDescription() {
		System.out.println("Memory,"+cName+","+Name+",volume:"+volume);
	}
}
