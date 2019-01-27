import java.util.Scanner;

public class Lab2Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		double r, r1, r2, h, h1, h2, volume;
		
		System.out.print("r:");
		r= input.nextDouble();
		
		System.out.print("r1:");
		r1= input.nextDouble();
		
		System.out.print("r2:");
		r2= input.nextDouble();
		
		System.out.print("h:");
		h= input.nextDouble();
		
		System.out.print("h1:");
		h1= input.nextDouble();
		
		System.out.print("h2:");
		h2= input.nextDouble();

		volume= (3.142*r*r*h)-((3.142*r1*r1*h1)+(3.142*r2*r2*h2));
		
		System.out.println("Volume of concrete require=" + volume);
		
	}

}
