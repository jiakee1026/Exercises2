import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		printQues1();
		System.out.println();
		printQues2();
		System.out.println();
		printQues3();
		System.out.println();
		printQues4();
		System.out.println();
		printQues5();
		System.out.println();
		printQues6();
		System.out.println();
		printQues7();
		System.out.println();
		printQues8();
		System.out.println();
		printQues9();
		System.out.println();
		printQues10();
	}
	
	public static void printQues1() {
		System.out.println("Hello\nTan Jia Kee");
	}

	public static void printQues2() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Input the first number : ");
		int num1 = input.nextInt();
		System.out.print("Input the second number : ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		System.out.println("Sum : " + sum + "\n"); 
		
		System.out.println(num1 + " + " + num2);
		System.out.println(sum);
	}
	
	public static void printQues3() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Input 1st number : ");
		int a = input.nextInt();
		System.out.print("Input 2nd number : ");
		int b = input.nextInt();
		int c = a/b;
		System.out.println(a + " / " + b + " = " + c);
		System.out.println("The division of a and b is " + c);
	}
	
	public static void printQues4() {
		int a = -5 + 8 * 6;
		int b = (55 + 9) % 9;
		int c = 20 + -3*5 /8;
		int d = 5 + 15 / 3 * 2 - 8 % 3;
				
		System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
	}
	
	public static void printQues5() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Input first number : ");
		int num1 = input.nextInt();
		System.out.print("Input second number : ");
		int num2 = input.nextInt();
		int num3 = num1 * num2;
		
		System.out.println(num1 + " x " + num2 + " = " + num3);
	}
	
	public static void printQues6() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Input first number : ");
		int num1 = input.nextInt();
		System.out.print("Input second number : ");
		int num2 = input.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
	}
	
	public static void printQues7() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Input a number : ");
		int num = input.nextInt();
		
		for(int i = 0; i < 10; i ++)
			System.out.println(num + " x " + (i + 1) + " = " + (num * (i + 1)));
	}
	
	public static void printQues8() {
		double num1 = (25.5 * 3.5 - 3.5 * 3.5);
		double num2 = (40.5 - 4.5);
		System.out.println(num1 / num2);
	}
	
	public static void printQues9() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Input radius : ");
		double radius = input.nextDouble();
		
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);
	}
	
	public static void printQues10() {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter first number : ");
		int num1 = input.nextInt();
		System.out.print("Enter second number : ");
		int num2 = input.nextInt();
		System.out.print("Enter third number : ");
		int num3 = input.nextInt();
		System.out.print("Enter fourth number : ");
		int num4 = input.nextInt();
		System.out.print("Enter fifth number : ");
		int num5 = input.nextInt();
		
		System.out.println("Average of the five number is " + ((num1 + num2 + num3 + num4 + num5)/5));
	}
	
}