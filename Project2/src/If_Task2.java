import java.util.Scanner;

public class If_Task2 {
	public static void main(String[] args) {
		System.out.println("enter your total marks");
		Scanner z=new Scanner(System.in);
		int mark=z.nextInt();
		
		if(mark>1000) {
			System.out.println("enter your cut-off marks");
			int cut=z.nextInt();
			if(cut>170) {
				System.out.println("eligible for medical");
			}
			else {
				System.out.println("eligible for engineering");
			}	
		}
		else {
			System.out.println("not eligible");
		}
	}

}
