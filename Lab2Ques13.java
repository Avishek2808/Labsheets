import java.util.Scanner;

public class Lab2Ques13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		int x1, x2, y1, y2;
		double d;
		
		//declaring values
		
		System.out.print("x1:");
		x1= input.nextInt();
		
		System.out.print("y1:");
		y1= input.nextInt();
		
		System.out.print("x2:");
		x2= input.nextInt();
		
		System.out.print("y2:");
		y2= input.nextInt();
		
		d= (((x2-x1)^2)+((y2-y1)^2))^1/2;
		
		System.out.println("Distance between 2 points=" + d);
		
		
		
		
		

	}

}
