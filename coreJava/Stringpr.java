package corejava;

public class Stringpr {

	public static void main(String[] args) {
		int a=(int) 'A';
		System.out.print(a);
	}
}






/*
----------------- unknown output ---------

public static void main(String[] args) {
	StringBuffer s=new StringBuffer("Hello, World! How's it going?");
	char val=' ';
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {
			val+=s.charAt(i);
		}System.out.print(val);
	}
	
}

*/