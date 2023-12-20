package Advancejava;

public class Diagonalsummm {

	public static void main(String[] args) {
		int arr[][]=new int[10][10];
		int ans=0;
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print((arr[i][j]=((int)(Math.random()*10))) + " ");
			}System.out.println();
		}
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(i==j)
				{
					ans+=arr[i][j];
				}
			}
		}System.out.println("Sum of The Diagonals are : " + ans);

	}

}

/*
-------------------------using while loop --------------


int arr[][]=new int[10][10];
		int ans=0;
		int i=0;
		while(i<10)
		{
			int j=0;
			while(j<10)
			{
				System.out.print((arr[i][j]=((int)(Math.random()*10))) + " ");
				j++;
			}System.out.println();
			i++;
		}
		i=0;
		while(i<10)
		{
			int j=0;
			while(j<10)
			{
				if(i==j)
				{
					ans+=arr[i][j];
				}
			j++;
			}
			i++;
		}System.out.println("Sum of The Diagonals are : " + ans);

}


*/
