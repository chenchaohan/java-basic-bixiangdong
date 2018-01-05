class Ticket implements Runnable // extends Thread
{
	// private int tick = 100;
	private static int tick = 100;
	boolean flag = true;
	// Object obj = new Object();
	public void run()
	{
		if(flag)
		{
			while(true)
			{
				synchronized(Ticket.class)
				{
					if(tick > 0)
					{
						try
						{
							Thread.sleep(1);
						}
						catch (Exception e)
						{
						}
						System.out.println(Thread.currentThread().getName() + "...code: " + tick--);
					}
				}
			}
		}
		else
		{
			while(true)
				show();
		}
		
	}

	public static synchronized void show()
	{
		if(tick > 0)
		{
			try
			{
				Thread.sleep(1);
			}
			catch (Exception e)
			{
			}
			System.out.println(Thread.currentThread().getName() + "...show.............: " + tick--);
		}
	}
}

class ThisLockDemo
{
	public static void main(String[] args)
	{
		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);

		t1.start();
		try
		{
			Thread.sleep(10);
		}
		catch (Exception e)
		{
		}
		t.flag = false;
		t2.start();
	}
}