import java.util.Scanner;

public class Lab2Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		//input 
		
		double BBwidth, Charwidth, Numchars, Spaceleft;
		
		//Processing the data
		
		System.out.print("BBwisth:");
		BBwidth= input.nextDouble();
		
		System.out.print("Charwidth:");
		Charwidth= input.nextDouble();
		
		Numchars = (int)(BBwidth/Charwidth);
		Spaceleft= BBwidth-(Numchars*Charwidth);
		
		//output
		
		System.out.println("Numchars=" + Numchars);
		System.out.println("Spaceleft=" + Spaceleft);
		
		
		
		
	}

}
