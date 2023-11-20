import java.util.Scanner;

public class yildiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int height;
		
		System.out.println("Enter height of pyramid in unit.");
		height = input.nextInt();
		
		int n = 1;
		while(n<=height) {
			int space = height - n;
			while(space > 0) {
				System.out.print(" ");
				space--;
			}
			
			int star = 2*n -1;
			while(star > 0) {
				System.out.print("*");
				star--;
			}
			
			space = height - n;
			while(space > 0) {
				System.out.print(" ");
				space--;
			}
			
			n++;
			System.out.println();
		}

	}
}
