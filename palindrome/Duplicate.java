package palindrome;
import java.util.*;
public class Duplicate {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		int[] ans=new int[100];
		int z=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();				 
		}//1 4 5 1 7 4 
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				ans[z]=arr[i];
				z++;
			}
		}
		for(int i=0;i<z;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}		
}