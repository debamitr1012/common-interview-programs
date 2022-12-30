import java.io.*;
import java.util.Scanner;
class reverse1 {
	public static void main (String[] args) {
	      Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string:");
            String str=sc.nextLine();
		String nstr="";
		char ch;
	System.out.print("Original word: ");
	System.out.println(str); 
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		nstr= ch+nstr; 
	}
	System.out.println("Reversed word: "+ nstr);
	}
}
