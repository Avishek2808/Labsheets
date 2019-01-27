import java.util.Scanner;

public class Lab2Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		//input
		
		double Radius, Height, Area;
		
		//Processing Area
		
		System.out.print("Radius:");
		Radius= input.nextDouble();
		
		System.out.print("Height:");
		Height= input.nextDouble();
		
		Area=((2*3.142)*Radius*Height)+((2*3.142)*Radius*Radius);
		
		//Output
		
		System.out.println("Area of Cylinder=" + Area);
		

	}

}
