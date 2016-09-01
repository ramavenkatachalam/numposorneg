package guvi;

import java.util.Scanner;

public class PosOrNeg 
{
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	if(n>0)
	{
		System.out.println("The no is positive");
	}
	else if(n<0)
	{
		System.out.println("The no is negative");
	}
	else if(n==0)
	{
		System.out.println("The no is equal to zero");
	}
}
}
