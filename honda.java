//honda.java:12: error: bike is abstract; cannot be instantiated
                                //bike b= new bike();
abstract class bike{
	bike(){
	System.out.println("bike runs");
	}
	abstract void run();
	public void changegear(){
		System.out.println("bike changes gear");
	}
	}
	public class honda extends bike{
			public static void main(String[] args){
				//bike b= new honda();
				//b.changegear();
				//b.run();
//result after running
//bike runs
//bike changes gear
//ruuning bike of honda
				
				honda h = new honda();
				h.changegear();
				h.run();
//bike runs
//bike changes gear
//ruuning bike of honda
				}
				public void run () {
					System.out.println("ruuning bike of honda");
				}
	}
	
	