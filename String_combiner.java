//Combine Strings

/*Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string in the inside. The strings will not be the same length, but they may be empty (length 0).If input is "hi" and "hello", then output will be "hihellohi"

Input Format:

First line contains string 1

Second line contains string 2

Output format:

String     ( of the form short+long+short )

====================================

Sample test case:

Input:
hi
hello

Output:
hihellohi   */

//SOURCE CODE
import java.util.*;
class Main{
	public static void main(String[] args){
		//write your code here
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		String y=sc.nextLine();
		int l1=x.length();
		int l2=y.length();
		if(l1>l2){
		    System.out.println(y+x+y);
		    
		}
		else{
		    System.out.println(x+y+x);
		}
	}
}
