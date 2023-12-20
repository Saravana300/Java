package practicecore;

    
	interface Mname{  //interface class
		void nokia(); //if we can't mention abstract it can declare automatically 
		abstract void iphone();
		abstract void snmsung();
	
	}
	interface Mname1 extends Mname{ // Interface can extend another interface
    	abstract void oppo();
		abstract void vivo();
		abstract void oneplus();
		
	}
	abstract class Price implements Mname1 {//Interface class with abstract class(implements)
    	abstract void  price();//abstract class cannot conatain body
    }
	class A extends Price{//class extend with abstract class
		@Override
		public void oppo() {
			System.out.println("oppo : 2000");
		}

		@Override
		public void vivo() {
			System.out.println("vivo : 2000");		
			}

		@Override
		public void oneplus() {
			System.out.println("oneplus : 50000");
		}

		@Override
		public void nokia() {
			System.out.println("nokia : 100");
		}

		@Override
		public void iphone() {
			System.out.println("iphone : 100000");
		}

		@Override
		public void snmsung() {
			System.out.println("snmsung : 90000");
		}

		@Override
		void price() {
			System.out.println("Phone and its price");
			
		}
		
		
		
	}		
public class Homeabs {

	public static void main(String[] args) {
		A obj=new A();
		obj.price(); //call the methods
		obj.iphone();
		obj.nokia();
		obj.oneplus();
		obj.oppo();
		obj.snmsung();
		obj.vivo();

	}
}



