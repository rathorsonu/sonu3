package count1_java;

import java.util.Scanner;

public class JAVA {
	public static void main(String[]args) {
	
	char operator;
	do {
	Scanner hs=new Scanner (System.in);
	System.out.println("Choose an operator");
	System.out.println("P = Prime \nA = Area of circle \nR = Reverse Digit\nM = Maximum Of Three Numbers");
	operator=hs.next().charAt(0);

	
	switch(operator) {
	case 'P':
					int i=2,n=0;
					boolean flag=false;
					while(i<=n/2)
					{
						if(n%i==0)
						{
							flag=true;
							break;
						}
							i++;
					}
					if(!flag)
					{
						System.out.println(n+" is a prime number. ");
					}
					else
					{
		
						System.out.println(n+" is not a prime number. ");
					}
					break;
	case 'A':
		double area,r;
		System.out.println("enter the radius");
		r=hs.nextDouble();
		area=3.14*r*r;
		System.out.println("Area of circle "+area);
		break;
	case'R':
		 int a,p,s=0;
		 System.out.println("enter the value of n");
		 a=hs.nextInt();
		 while(a>0)
		 {
			 p=a%10;
			 s=(s*10)+p;
			a=a/10;
		 }
		 
		 System.out.println(" Reverse number is "+s);
		 break;
	case'M':
		int aa,b,c;
		
		System.out.println("Enter value of a");
		aa=hs.nextInt();
		System.out.println("Enter value of b");
		b=hs.nextInt();
		System.out.println("Enter value of c");
		c=hs.nextInt();
		if(aa>b&aa>c) {
			System.out.println("largest number is "+aa);
		}
		else if(b>aa&b>c)
		{
			System.out.println("Largest number is "+b);
		}
		else
		{
			System.out.println("Largest number is "+c);
		}
		break;
		default:
			System.out.println("Invalid operator!");
			break;
	}
			System.out.println("Do you want to continue(Y/N)");
			 operator =hs.next().charAt(0);
	}
	while(operator=='y'||operator=='Y');
	}
		

	}
	
	
	

