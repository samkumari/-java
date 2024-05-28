/*Chef and Happy String
Chef has a string 
𝑆
S with him. Chef is happy if the string contains a contiguous substring of length strictly greater than 
2
2 in which all its characters are vowels.

Determine whether Chef is happy or not.

Note that, in english alphabet, vowels are a, e, i, o, and u.

Input Format
First line will contain 
𝑇
T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, a string 
𝑆
S.
Output Format
For each test case, if Chef is happy, print HAPPY else print SAD.

You may print each character of the string in uppercase or lowercase (for example, the strings hAppY, Happy, haPpY, and HAPPY will all be treated as identical).

Constraints
1≤𝑇≤1000
1≤T≤1000
3≤∣𝑆∣≤1000
3≤∣S∣≤1000, where 
∣𝑆∣ is the length of 𝑆
S will only contain lowercase English letters.
Sample 1:
Input:4
     aeiou
     abxy
     aebcdefghij
     abcdeeafg

Output:
      Happy
      Sad
      Sad
      Happy
Explanation:
Test case 1
1: Since the string aeiou is a contiguous substring and consists of all vowels and has a length >2, Chef is happy.

Test case 2
2: Since none of the contiguous substrings of the string consist of all vowels and have a length >2, Chef is sad.

Test case 3
3: Since none of the contiguous substrings of the string consist of all vowels and have a length >2, Chef is sad.

Test case 4
4: Since the string eea is a contiguous substring and consists of all vowels and has a length >2, Chef is happy.*/


Sol:  import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            int count=0;
              for(int i=0;i<s.length();i++){
                  
                  if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='u'){
                      count++;
                  
                  if(count==3){
                      break;
                  } }
                  else{
                    count=0;  
                  }
                  
              }
              if(count>2){
                  System.out.println("happy");
              }
              else{
                  System.out.println("sad");
                  
              }
            
        }
    }
}
