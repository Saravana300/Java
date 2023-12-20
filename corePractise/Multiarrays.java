package practicecore;

public class Multiarrays {

	public static void main(String[] args) {
		int random;
		int num[][][]=new int[3][3][3];
//		num[0][0]=new int[(int)(Math.random()*10)];
//		num[0][1]=new int[(int)(Math.random()*10)];
//		num[0][2]=new int[(int)(Math.random()*10)];
//		num[1][0]=new int[(int)(Math.random()*10)];
//		num[1][1]=new int[(int)(Math.random()*10)];
//		num[1][2]=new int[(int)(Math.random()*10)];
//		num[2][0]=new int[(int)(Math.random()*10)];
//		num[2][1]=new int[(int)(Math.random()*10)];
//		num[2][2]=new int[(int)(Math.random()*10)];
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length;j++)
			{
				for(int k=0;k<num.length;k++)
				{
					System.out.print((random=(int)(Math.random()*10)) + " ");
				}System.out.println();
			}System.out.println();
		}

	}

}
