package lab1;

public class AMD extends CPU{
	private static String cName="AMD";
	private static String Name="The Third Verison";
	private static int coreNum=4;
	private static int price=1000;
	
	public final int getPrice() {
		return price;
	}
	public final void getDescription() {
		System.out.println("CPU,"+cName+","+Name+",coreNum:"+coreNum);
	}
}
