public class addition{
	public void add(int x ,int y ,int a)
	{
		System.out.println(x+y+a);
		
	}
	
	public void add(int x ,int y ,int a ,int z)
	{
		System.out.println(x+y+z+a);
		
	}
	public void add(int x ,int y, int a ,double z, String operation)
	{
		System.out.println(operation +(x+y+a+z) + "done with overloading");
		
	}
  
		public static void main(String[] args)
		{
			addition ad = new addition();
			
				ad.add(10,20,12);
				ad.add(10,20,12,30);
				ad.add(10,20,12,30,  "addition");
			}
		}