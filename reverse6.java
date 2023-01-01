import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;
class reverse6 {
	public static void main(String[] args)
	{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string:");
            String input=sc.nextLine();
		char[] hello = input.toCharArray();
		List<Character> trial1 = new ArrayList<>();
		for (char c : hello)
			trial1.add(c);
		Collections.reverse(trial1);
		ListIterator li = trial1.listIterator();
		while (li.hasNext())
			System.out.print(li.next());
	}
}
