package practicecore;
import java.util.*;
public class Tcsnqtpr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of vehicles");
		int v=sc.nextInt();
		System.out.print("Enter the number of wheels");
		int w=sc.nextInt();
		int val=((4*v)-w)/2;
		if(2<=w && w%2==0 && v<w)
		{
			System.out.print("The no. of  two wheelers are " + val +" and the four wheelers are "+(v-val));
		}
			}

		}
