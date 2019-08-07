package display;

public class Clock  {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	void start()
	{
		minute.increase();
		if(minute.getValue()==0)//分钟为0则时+1
		{
			hour.increase();
		}
		//按以下格式输出：数字占两位字符位置，只有一位用0补，两个值之间有： 并换行
		System.out.printf("%02d:%02d\n",hour.getValue(),minute.getValue());
	}
	

	public static void main(String[] args) {
		Clock clock = new Clock();
		
		while(true)
		{
			clock.start();
		}

	}

}
