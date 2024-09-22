
/*Padovan Sequence


The Padovan sequence is a sequence of numbers named after Richard Padovan, who attributed its discovery to Dutch architect Hans van der Laan. The sequence was described by Ian Stewart in his Scientific American column Mathematical Recreations in June 1996. The Padovan sequence is defined by the following recurrence relation:
P(n) = P(n-2) + P(n-3) with the initial conditions P(0) = P(1) = P(2) = 1.
In this sequence, each term is the sum of the two preceding terms, similar to the Fibonacci sequence. However, the Padovan sequence has different initial conditions and exhibits different growth patterns.
The first few terms of the Padovan sequence are: 1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, ...

Input Format:

First line contains a numeric value

Output format:

Series of Numeric values separated by space

====================================

Sample test case:

Input:

10

Output

1 1 1 2 2 3 4 5 7 9 12   */


//SOURCE CODE
import java.util.*;
class Main{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
		//write your code here
		int a=sc.nextInt();
		int x[]=new int[a+1];
		for(int i=0;i<a+1;i++){
		   if(i<3){
		      x[i]=1; 
		   } 
		   else{
		     x[i]=x[i-2]+x[i-3];  
		   }
		   
		   
		   }
		  for(int i=0;i<x.length;i++){
		      System.out.print(x[i]+" ");
		      
		      
		  }
		}
		
	}
