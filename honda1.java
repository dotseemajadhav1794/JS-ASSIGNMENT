abstract class Bike{

	public void run(){}
	public void changegear(){
		System.out.println("bike changes gear");
	}
	}
	public class honda1 extends Bike{
			public static void main(String[] args){
				Bike b= new honda1();
				b.changegear();
				b.run();

				}
				public void run () {
					System.out.println("ruuning bike of honda");
				}
	}