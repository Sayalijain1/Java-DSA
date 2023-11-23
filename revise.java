/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int A = sc.nextInt();
		    int B =sc.nextInt();
		    int sum = A+B;
		    int count =0;
		    while(sum-->0){
		        int lastdig = sum/10;
		        switch(lastdig){
		            case 0:
		                count=6;
		                break;
		            case 1:
		                count=2;
		                break;
		            case 2:
		                count+=5;
		                break;
		            case 3:
		                 count=5;
		                 break;
		            case 4:
		                count=4;
		                break;
		            case 5:
		                count=5;
		                break;
		                
		            case 6:
		                count=6;
		                break;
		            case 7:
		                count=3;
		                break;
		          case 8:
		                count=8;
		                break;
		          case 9:
		                count=7;
		                break;
		  
		        }
		        System.out.print(sum);
		    }
		    
		            
		    }
		}
	}

