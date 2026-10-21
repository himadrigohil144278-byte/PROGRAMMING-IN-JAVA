class MyRunnable implements Runnable 
{
    public void run() 
	{
        	System.out.println("My name is shinchan nohara...");
    	}

    public static void main(String[] args) 
	{
        	MyRunnable obj = new MyRunnable();
        	Thread t = new Thread(obj);
        	t.start();
    	}
}