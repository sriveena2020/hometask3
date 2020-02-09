package epam.hometask3;

import java.util.*;
public class Calculator extends Calci
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	Calci c = new Calci();
	boolean n = true;
	while(n)
	{
		System.out.print("Enter value:");
		int first = sc.nextInt();
		System.out.print("Enter operation(+,-,*,/):");
		char op = sc.next().charAt(0);
		System.out.print("Enter value:");
		int second = sc.nextInt();
		switch(op)
		{
			case '+':
				c.add(first,second);
				break;
			case '-':
				c.sub(first,second);
				break;
			case '*':
				c.mul(first,second);
				break;
			case '/':
				c.div(first,second);
				break;
			default:
				System.out.println("Enter only +,*,/,-");
		}
		System.out.print("Do you want to continue(Y/N):");
		char n1=sc.next().charAt(0);
		if(n1 == 'y' || n1 == 'Y')
			n = true;
		else 	
			n = false;
	}
}
}
class Calci 
{
	
	void add(int first,int second)
	{
		int result = first + second;
		System.out.println("Sum = "+result);
	}
	void sub(int first,int second)
	{
		int result = first - second;
		System.out.println("Subtraction = "+result);
	}	
	void mul(int first,int second)
	{
		int result = first * second;
		System.out.println("Multiplication = "+result);
	}
	void div(int first,int second)
	{
		int result = first / second;
		System.out.println("Division = "+result);
	}

}