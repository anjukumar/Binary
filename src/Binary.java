import java.util.Scanner;

public class Binary 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the binary number");
		double num = keyboard.nextDouble();	
		double temp = 0;
		double x[]=new double[100];
		double p;
		for (int i=0;i<100;i++)
		{
			
			 x[i] = num%10;
			if (x[i]==0)
				break;
			else if(x[i]==1)
			{
				double a =2;
				double b = 0;
				double dec = x[i]* Math.pow(a, b);
				b++;
				temp = temp +dec;
			}
			else System.out.println("Input not a Binary Number");
		}
		System.out.println("Decimal Number " +temp);
	}
}

