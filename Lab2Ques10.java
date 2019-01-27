import java.util.Scanner;

public class Lab2Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		double n1, n2, d1, d2, Product, Sum;
		
		System.out.print("n1:");
		n1= input.nextDouble();
		
		System.out.print("n2:");
		n2= input.nextDouble();
		
		System.out.print("d1:");
		d1= input.nextDouble();
		
		System.out.print("d2:");
		d2= input.nextDouble();
		
		Product= (n1*n2)/(d1*d2);
		Sum= ((n1*d2)+(n2*d1))/(d1*d2);
		
		System.out.println("Product of the two fractions=" + Product);
		System.out.println("Sum of the two fractions=" + Sum);
		
		
		
		
		

	}

}
