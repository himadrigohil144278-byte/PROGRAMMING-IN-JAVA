class Thread1 extends Thread 
{
    public void run() 
	{
        	for (int i = 1; i <= 5; i++) 
		{
            		System.out.println("Thread 1: " + i);
            	try 
		{
                	Thread.sleep(500);
            	} 
		catch (InterruptedException e) 
		{
                	System.out.println(e);
            	}
        }
    }
}

class Thread2 extends Thread 
{
   	 public void run() 
	{
    	    for (int i = 1; i <= 5; i++) 
		{
            		System.out.println("Thread 2: " + i);
            		try 
			{
                		Thread.sleep(500);
            		} 
			catch (InterruptedException e) 
			{
                		System.out.println(e);
            		}
        	}
    	}
}

class JoinDemo 
{
    public static void main(String[] args) 
	{
        	Thread1 t1 = new Thread1();
        	Thread2 t2 = new Thread2();

        	t1.start();

        	try 
		{
            		t1.join();
        	} 
		catch (InterruptedException e) 
		{
            		System.out.println(e);
        	}

        	t2.start();

        	try 
		{
            	t2.join();
        	} 
		catch (InterruptedException e) 
		{
            	System.out.println(e);
        	}

        	System.out.println("Both threads completed.");
    	}
}