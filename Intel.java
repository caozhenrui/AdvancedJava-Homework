package lab1;

public class Intel extends CPU{
	private static String cName="Intel";
	private static String Name="The Third Verison";
	private static int coreNum=4;
	private static int price=1200;
	
	public final int getPrice() {
		return price;
	}
	public final void getDescription() {
		System.out.println("CPU,"+cName+","+Name+",speed:"+coreNum);
	}
}
