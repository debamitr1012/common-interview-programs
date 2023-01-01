import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;
class reverse3 {
	public static void main(String[] args)
	{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string:");
            String input=sc.nextLine();
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1.reverse();
		System.out.println(input1);
	}
}
