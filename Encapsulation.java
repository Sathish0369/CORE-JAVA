package Encapsulation;
class Ibank
{
	private int pin=12231;
	public int getpin()
	{
		return pin;
	}
	public int setpin(int pin)
	{
		return this.pin=pin;
	}
}
public class customer {
public static void main(String[] args) {
	Ibank bin=new Ibank();
	int x=bin.getpin();
	System.out.println(x);
	bin.setpin(987987);
	System.out.println(bin.getpin());
	
}
}
