import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;
class reverse7 {
	public static void main(String[] args)
	{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string:");
            String str=sc.nextLine();
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println(sbr);
	}
}
