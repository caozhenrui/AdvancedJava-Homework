package lab1;

public class Seagate extends HardDisk{
	private static String cName="Seagate";
	private static String Name="The Fourth Verison";
	private static int volume=512;
	private static int price=600;
	
	public final int getPrice() {
		return price;
	}
	public final void getDescription() {
		System.out.println("HardDisk,"+cName+","+Name+",volume:"+volume);
	}
}
