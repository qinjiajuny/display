package display;

public class Display {
	private int value = 0;
	private int limit = 0;
	public Display(int limit)
	{
		this.limit=limit;
	}
	void increase()//不断增长到限制值回0
	{
		value++;
		if(value == limit)
			value =0;
	}
	int getValue()
	{
		return value;
	}

	public static void main(String[] args) {
		Display d = new Display(60);
		while(true)
		{
			d.increase();
			System.out.println(d.getValue());
		}

	}

}
