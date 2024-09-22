/*Sum of last digits of two given numbers

Rohit wants to add the last digits of two given numbers. For example, If the given numbers are 267 and

154, the output should be 11.

Below is the explanation -

Last digit of the 267 is 7

Last digit of the 154 is 4

Sum of 7 and 4 = 11

Write a program to help Rohit achieve this for any given two numbers.

The prototype of the method should be -

int add Last Digits (int input1, int input2);

where input1 and input2 denote the two numbers whose last digits are to be added.

Note: The sign of the input numbers should be ignored.

if the input numbers are 267 and 154, the sum of last two digits should be 11

if the input numbers are 267 and -154, the sum of last two digits should be 11

if the input numbers are -267 and 154, the sum of last two digits should be 11

if the input numbers are -267 and -154, the sum of last two digits should be 11



Input Format:

First line contains two numeric values separated by space



Output format:

Numeric value

====================================

Sample test case:

Input:

267 154

Output

11  */

// SOURCE CODE 
import java.util.*;

class Main{
	public static void main(String[] args){
		//write your code here
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String n[]=a.split(" ");
		int x=Integer.parseInt(n[0]);
		int y=Integer.parseInt(n[1]);
		int r1=0,r2=0;
		
		
		    
		    r1=x%10;
		    r2=y%10;
	
		System.out.println(Math.abs(r1)+Math.abs(r2));
	}
}

