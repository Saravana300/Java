package practicecore;
import java.util.*;
import java.util.stream.Stream;
 
public class Pteq{
	public static void main(String args[]) {
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        int f=1;
		        int k=0;
		        int temp=0;
		        int count=0;
		        for(int i=0;i<=n;i++)
		        {
		            temp=f;
		            f=k+f;
		            k=temp;
		            if(f==n)
		            {
		                count++;
		            }
		        }
		        if(n%2==0)
		        {
		            if(count==1)
		            {
		                System.out.println("Fibonacci & Even");
		            }
		            else{
		                System.out.println("Non-Fibonacci & Even");
		            }

		        }
		        else if(n%2 != 0)
		        {
		            if(count==1)
		            {
		                System.out.println("Fibonacci & odd");
		            }
		            else{
		                System.out.println("Non-Fibonacci & odd");
		            }
		        }
	}	
}
