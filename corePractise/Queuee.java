package practicecore;

import java.util.*;
public class Queuee {
	
	int id;String name;
	
	public Queuee(int id, String name) {
		this.id = id;
		this.name = name;
	}


	
	

	@Override
	public String toString() {
		return "Queuee [id=" + id + ", name=" + name + "]";
	}



int arr[]=new int[5]; 

	public static void main(String[] args) {

		 Deque<Queuee> d = new ArrayDeque<Queuee>();  
		
		 Queuee a=new Queuee(1, "dinesh");
		 
		 Queuee b=new Queuee(2, "saravana");
		 Queuee c=new Queuee(3, "karthic");
		 Queuee e=new Queuee(4, "mani");
		 Queuee f=new Queuee(5, "sanjay");
		 Queuee g=new Queuee(6, "aravinth");
		 
		 d.add(a); 
		 d.add(b);
		 d.add(c); 
		 d.add(e); 
		 d.add(f); 
		 d.add(g);
		 
		  Iterator s=d.iterator();
		  
		  while(s.hasNext()) {
			  
			  System.out.println(s.next());
		  }
		     
		
	} 

}
