//Is N an exact multiple of M

/*Write a function that accepts two parameters and finds whether the first parameter is an exact multiple of the second parameter. If the first parameter is an exact multiple of the second parameter, the function should return 2 else it should return 1.If either of the parameters are zero, the function should return 3.
Assumption: Within the scope of this question, assume that - the first parameter can be positive, negative or zero the second parameter will always be >=0

Input Format:

First line contains two numeric values separated by space

Output format:

Numeric value

====================================

Sample test case:

Input:

10 5

Output

2     */

//SOURCE CODE
import java.util.*;
class Main{
	public static void main(String[] args){
		//write your code here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=2;
		if(a%b==0){
		    x=2;
		    }
		  else if(a==0 || b==0){
		      x=3;
		  }
		else{
		    
		    x=1;
		}
		System.out.println(x);
	}
}
