package lab1;

public class WestDigitals extends HardDisk{
	private static String cName="WestDigitals";
	private static String Name="The First Verison";
	private static int volume=256;
	private static int price=900;
	
	public final int getPrice() {
		return price;
	}
	public final void getDescription() {
		System.out.println("HardDisk,"+cName+","+Name+",volume:"+volume);
	}
}
