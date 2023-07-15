package openLabBook;
import java.util.Scanner;
public class FindAreaOfSquare {
public static void main(String[] args) {
	System.out.println("Enter side of Square:");
	//Capture the user's input
	Scanner scanner = new Scanner(System.in);
	//Storing the captured value in a variable
	double side = scanner.nextDouble();
	double area = side*side;
	System.out.println("Area of square is: "+area);
	
}
}
