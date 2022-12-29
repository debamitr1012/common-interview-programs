import java.util.Scanner;
class ipalin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter a number : ");  
    int num = sc.nextInt();
    int reversedNum = 0, remainder;
    int originalNum = num;
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome");
    }
    else {
      System.out.println(originalNum + " is not Palindrome");
    }
  }
}