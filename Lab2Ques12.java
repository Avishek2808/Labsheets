import java.util.Scanner;

public class Lab2Ques12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		//Declaring inputs
		
		int x1, y1, x2, y2, m;
		
		System.out.print("x1:");
		x1= input.nextInt();
		
		System.out.print("y1:");
		y1= input.nextInt();
		
		System.out.print("x2:");
		x2= input.nextInt();
		
		System.out.print("y2:");
		y2= input.nextInt();
		
		m= (y2-y1)/(x2-x1);
		
		System.out.println("Slope of the line=" + m);
		
		
		
		
		

	}

}
