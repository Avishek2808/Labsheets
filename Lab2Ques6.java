import java.util.Scanner;

public class Lab2Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		//input
		
		int Diameter, Price; 
		double Costpercm2;
		
		//processing
		
		System.out.print("Diameter:");
		Diameter= input.nextInt();
		
		System.out.print("Price:");
		Price= input.nextInt();
		
		Costpercm2= Price/(3.142*(Diameter/2)*(Diameter/2));
		
		//output
		
		System.out.println("Cost per square centimeter=" + Costpercm2);
		
		

	}

}
