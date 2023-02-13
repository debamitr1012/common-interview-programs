public class StringExample2
{
public static void main(String[] args)
{
String string = "1234";
char str[] = string.toCharArray();
for(int i = string.length()-1; i>=0; i--)
{
System.out.print(str[i]);
}
}
}