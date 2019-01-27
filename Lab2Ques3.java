import java.util.Scanner;

public class Lab2Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		//inputs
		
		int Depth, Celsius;
		double Fahrenheit;
		
		//Processing the given data
		
		System.out.print("Depth:");
		Depth= input.nextInt();
		
		Celsius= 10*(Depth)+20;
		Fahrenheit= 1.8*(Celsius)+32;
		
		//output
		
		System.out.println("Temperature in Celsius=" + Celsius);
		System.out.println("Temperature in Fahrenheit=" + Fahrenheit);
		
		
		
		

	}

}
