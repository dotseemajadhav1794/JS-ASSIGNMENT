abstract class animal{
	abstract void eat();
	}
	
	public class dog extends animal
	{
	void eat()
	{
	System.out.println("eating");
	}
	public static void main(String[] args){
						dog d = new dog();
						d.eat();
			}
	}
	
	
