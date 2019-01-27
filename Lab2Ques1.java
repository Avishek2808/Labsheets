import java.util.Scanner;

public class Lab2Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in); 
		
		double Numhours, Payrate, Salary;
		
		System.out.print("Numhours:");
		Numhours= input.nextDouble();
		
		System.out.print("Payrate:");
		Payrate= input.nextDouble();
		
		Salary= Numhours*Payrate;
		
		System.out.println("Salary of an Employee=" + Salary);
		
		

	}

}
