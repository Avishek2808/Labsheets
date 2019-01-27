import java.util.Scanner;

public class Lab2Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		//inputs
		
		int Distance, MileperGallon, CostofaGallon, NumGallons, EstimateCost;
		
		//Processing
		
		System.out.print("Distance:");
		Distance= input.nextInt();
		
		System.out.print("MileperGallon:");
		MileperGallon= input.nextInt();
		
		System.out.print("CostofaGallon:");
		CostofaGallon= input.nextInt();
		
		NumGallons= Distance/MileperGallon;
		EstimateCost= NumGallons*CostofaGallon;
		
		//Output
		
		System.out.println("Number of gallons=" + NumGallons);
		System.out.println("Estimate Cost of trip=" + EstimateCost);
		

	}

}
