package _01_algorithms._2_fibonacci;

public class Fibonacci {
public static void main(String[] args) {
	
	int num1 = 0;
	int num2 = 1;
	int sum = 0;
	
	System.out.print(num1+ " ");
	System.out.print(num2+ " ");
	for (int i=0; i<10; i++) {
	sum= num1+num2;
	
System.out.print((num1 + num2)+ " " );	

num1 = num2;
num2 = sum; 
	}
}
}
