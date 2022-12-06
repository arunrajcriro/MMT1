import java.util.Scanner;

public class If_Task1 {
	public static void main(String[] args) {
		System.out.println("enter your marks");
		Scanner m=new Scanner(System.in);
		int mark=m.nextInt();
		
		if(mark>=35) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
