package stringworkout;
import java.util.*;
public class Stringsbsb {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Hello, World! How's it going?");
		char val=' ';
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				val+=i;
	    }System.out.print(val);
		}
		
	}

}
