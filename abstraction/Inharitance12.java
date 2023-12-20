package abstraction;





interface Bike{
	
	   void yemaha();
	   abstract void duke();
	   abstract void tvs();
	   abstract void bajaj();
}
interface Platina extends Bike{
	
	   abstract void platina();

	
}

abstract class Bike1 {
	
	   abstract void bike();

	
}
class A implements Bike,Platina{

	@Override
	public void yemaha() {
   System.out.println("R15");		
	}

	@Override
	public void duke() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tvs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bajaj() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void platina() {
		// TODO Auto-generated method stub
		
	}
	
	
}




public class Inharitance12 {

	public static void main(String[] args) {
		
		A o=new A();
		o.yemaha();

	}

}
