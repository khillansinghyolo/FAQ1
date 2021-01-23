package org.testing;

public class ReverseTheString {

//	intput  =Hello World
	// output = olleH dlroW
	public static void main(String[] args) {
	
		
		String input ="Hello World";
		int l= input.length();
		  String rev="";
		  for(int i=l-1;i>=0;i--)
		  {
			  rev=rev+input.charAt(i);
		  }
		  System.out.println(rev);	
		  String rev1="";
		  String ch[]=rev.split(" ");
		  
		  int l1=ch.length;
		  for(int j=l1-1;j>=0;j-- ) {
			  rev1=rev1+ch[j]+" ";
		  }
		  System.out.print(rev1);
		  
		  String rev2="";
		  String rev3[]=rev1.split(" ");
		  
		  int l2=rev2.length();
		  for(int k=0;k<=l2-1;k++) 
		  {
			  rev2=rev2+rev3[k]+"";
		  }
		  System.out.println(rev2);
	}
	
	
}
