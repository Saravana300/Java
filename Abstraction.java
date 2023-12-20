package abstraction;

abstract class House{
	
   abstract void hall();
   abstract void kitchen();
   abstract void bedroom();
   abstract void bedroom1();
   
   void add () {
	   
	   
   }
	
}
abstract class Update extends House{
	
	   abstract void raintank();

	
}
class Imp extends Update{

	@Override
	void raintank() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void hall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void kitchen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void bedroom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void bedroom1() {
		// TODO Auto-generated method stub
		
	}


	
	
	
}



public class Abstraction {
	
	public static void main(String[] args) {
		
		Imp a=new Imp();
		a.hall();
	}

}
