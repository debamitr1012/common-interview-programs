import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
public class llsort2{
public static void main(String args[]) {

LinkedList<String> singlyLinkedList = new LinkedList<>();
singlyLinkedList.add("Eclipse");
singlyLinkedList.add("NetBeans");
singlyLinkedList.add("IntelliJ");
singlyLinkedList.add("Resharper");
singlyLinkedList.add("Visual Studio");
singlyLinkedList.add("notepad");

System.out.println("LinkedList (before sorting): " 
 + singlyLinkedList);

Collections.sort(singlyLinkedList);
System.out.println("LinkedList (after sorting in natural): " 
 + singlyLinkedList);

Collections.sort(singlyLinkedList, new Comparator<String>() {
public int compare(String s1, String s2) {
return s1.length() - s2.length();
} } );

System.out.println("LinkedList (after sorting using Comparator): " 
   + singlyLinkedList);
}}