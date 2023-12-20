package practicecore;

public class Diagpr {

	public static void main(String[] args) {
		int s[][]= {{1,1,1},{2,2,2},{3,3,3}};
		for(int i=0;i<s.length;i++)
		{
			int sumcolumn=0;
			for(int j=0;j<s.length;j++)
			{
					sumcolumn+=s[j][i];
				
			}System.out.println("Sum of Column " + (i+1) +" is "+sumcolumn);
		}
		for(int i=0;i<s.length;i++)
		{
			int sumrow=0;
			for(int j=0;j<s.length;j++)
			{
					sumrow+=s[i][j];
				
			}System.out.println("Sum of row " + (i+1) +" is "+sumrow);
		}
	}

}
