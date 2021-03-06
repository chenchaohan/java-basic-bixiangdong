class LanPingException extends Exception
{
	LanPingException(String message) {
		super(message);
	}
}

class NoPlainException extends Exception
{
	NoPlainException(String message) {
		super(message);
	}
}

class MaoYanException extends Exception
{
	MaoYanException(String message) {
		super(message);
	}
}

class Computer {
	private int state = 3;
	public void run() throws LanPingException, MaoYanException
	{
		if(state == 2)
			throw new LanPingException("蓝屏了");
		if(state == 3)
			throw new MaoYanException("冒烟了");

		System.out.println("电脑运行");
	}
	public void reset()
	{
		state = 1;
		System.out.println("电脑重启");
	}
}

class Teacher
{
	private String name;
	private Computer cmpt;

	Teacher(String name){
		this.name = name;
		cmpt = new Computer();
	}

	public void prelect() throws NoPlainException
	{
		try
		{
			cmpt.run();
		}
		catch (LanPingException e)
		{
			cmpt.reset();
		}
		catch(MaoYanException e)
		{
			test();
			throw new NoPlainException("课时无法继续" + e.getMessage());
		}
		System.out.println("讲课");
	}

	public void test()
	{
		System.out.println("练习");
	}
}

class ExceptionDemo4
{
    public static void main(String[] args)
    {
        Teacher t = new Teacher("毕老师");
		try
		{
			t.prelect();
		}
		catch (NoPlainException e)
		{
			System.out.println(e.toString());
			System.out.println("换老师或者放假");
		}
    }
}