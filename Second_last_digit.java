//Second last digit of a given number


/*Write a function that returns the second last digit of the given number. Second last digit is being referred to the digit in the tens place in the given number.
Example: if the given number is 197, the second last digit is 9.

Note 1: The second last digit should be returned as a positive number. i.e. if the given number is -197, the second last digit is 9.
Note 2: If the given number is a single digit number, then the second last digit does not exist. In such cases, the function should return -1. i.e. if the given number is 5, the second last digit should be returned as -1.

Input Format:

First line contains a numeric value

Output format:

Numeric value

====================================

Sample test case:

Input:

197

Output

9       */
 
//SOURCE CODE
import java.util.Scanner;
class Main{
	public static void main(String[] args){
		//write your code here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	int	count=0,r=0;
	int n=0;
		while(a>0 && count<=2){
		   
		       r=a%10;
		       a=a/10;
		       count++;
		       if(count==2){
		           n=r;
		       }
		   
		}
		if(count<2){
		System.out.println(-1);
	}
	else{
	    System.out.println(n);
	}
}
}





