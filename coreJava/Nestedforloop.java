package corejava;

public class Nestedforloop {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1) {
				System.out.print(" $ ");
				}
				else if(i==2) {
					System.out.print(" & ");	
				}
				else {
					System.out.print(" * ");
				}
			}
			System.out.println(" ");
		}
	}

}




/*
         * * *        * *          *
for(int i=0;i<3;i++) {
	for(int j=i;j<3;j++) {
		System.out.print(" * ");
	}
	System.out.println(" ");
}

-----------1         3 5          7 9 11   --------
 
int num=1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" " + num);
				num=num+2;
			}
			System.out.println(" ");
	
		--------- $  &&  *** ----------
		
for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1) {
				System.out.print(" $ ");
				}
				else if(i==2) {
					System.out.print(" & ");	
				}
				else {
					System.out.print(" * ");
				}
			}
			System.out.println(" ");
				
		
*/