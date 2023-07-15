package openLabBook;
import java.util.Scanner;
public class AreaOfTriangle {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Eneter the width of the triangle:");
	double base = scanner.nextDouble();
	
	System.out.println("Enter the height of the triangle:");
	double height = scanner.nextDouble();
	
	double area = (base*height)/2;
	System.out.println("Area of Triangle is:" + area);
}
}
