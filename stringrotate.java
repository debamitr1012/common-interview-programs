import java.util.Scanner;
public class stringrotate{
    public static boolean check(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String concatenatedString = s1 + s1;
        return concatenatedString.contains(s2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a s1:");
        String s1=sc.nextLine();
        System.out.println("Enter a s2:");
        String s2=sc.nextLine();
        boolean flag = check(s1, s2);
        if(flag) System.out.println(s1 + " and " + s2 + " are rotation of each other");
        else System.out.println(s1 + " and " + s2 + " are not rotation of each other");
    }
}