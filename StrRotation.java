import java.util.Scanner;
class StrRotation {
    static boolean checkRotation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        String temp = s1 + s1; 
        if (temp.indexOf(s2) != -1) {
            return true; 
        } else {
            return false;
        }

    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a s1:");
        String s1=sc.nextLine();
        System.out.println("Enter a s2:");
        String s2=sc.nextLine();
        if (checkRotation(s1, s2))
            System.out.println("Given Strings are rotations of each other.");
        else
            System.out.println("Given Strings are not rotations of each other.");
    }
}