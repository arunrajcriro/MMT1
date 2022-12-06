import java.util.Scanner;

public class Arm_Strong1 { 
	static int temp,x,ans;
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner z = new Scanner(System.in);
		int a = z.nextInt();
		 
		temp=a;
		
		while(a>0) {
			x=a%10;
			ans=ans+(x*x*x);
			a=a/10;
		}
		if(temp==ans) {
			System.out.println(temp+ "armstrong number");
		}
		else {
			System.out.println(temp+ "not an armstrong number");
		}
	}

}
