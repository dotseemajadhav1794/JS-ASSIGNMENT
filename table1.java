 //thread example
 
 public class table1 extends Thread
{
    public void run()
	{
        for(int i=0;i<100;i++)
        {
            System.out.println(i);
        }
	}
	public void start()
		{
			System.out.println("we are in start.");
		}
    public static void main(String[] args)
	{
        table1 t= new table1();
        t.start();
    }
}