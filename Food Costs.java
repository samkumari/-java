/*Food Costs
You're a bit all over the place as a college student. You used to eat out at expensive restaurants almost every day until your parents gave you a talking-to about being irresponsible. Now, you've got to control your eating and spending habits.

So, here's the plan: you'll stick to the college mess for your meals every day, except Sundays. On Sundays, you're treating yourself to those fancy restaurant meals.
The cost is Rs. 𝑋 for the mess food each day, and Rs. 𝑌 for the restaurant splurges.

Now, what's the cost of food per week? Note that you don't have to pay for the mess on Sundays.
A week has seven days, as usual.

Input Format
The first and only line of input contains 2 space-separated integers, X and Y.
Output Format
Output a single integer: the weekly cost of food.

Constraints
1≤𝑋<𝑌≤1000

Sample 1:
Input : 100 500
Output: 1100  */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
	 int x=sc.nextInt();
	 int y=sc.nextInt();
	 int mess=6*x;
	 int res=1*y;
	 int total=mess+res;
	 System.out.println(total);// your code goes here

	}
}