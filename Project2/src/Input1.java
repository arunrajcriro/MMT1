import java.util.Scanner;

public class Input1 {
	public static void main(String[] args) {
		System.out.println("enter player name");
		
		Scanner x=new Scanner(System.in);
		
		String a=x.nextLine();
		
		System.out.println("score");
		int b=x.nextInt();
		
		System.out.println("average");
		float c=x.nextFloat();
		
		System.out.println("eco");
		
		System.out.println(b-c);
		
	}

}
