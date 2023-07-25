package closedLabBook;
import java.util.Scanner;
public class ToCheckThePrimeNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to check:");
	int a = sc.nextInt();
	int counter = 0;
	for(int i=1;i<=a;i++) {
	if(a%i==0) {
	counter+=1;
}
	}
	if(counter==2) {
		System.out.println("The given number is a prime number");
	}
	else {
		System.out.println("The given number is not a prime number");
	}
}
}
