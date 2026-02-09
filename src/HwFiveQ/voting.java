package HwFiveQ;
import java.util.Scanner;
public class voting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = voting.inputvotes(sc);	
		voting.totalvotes(a);
		voting.winner(a);
	}
	public static int[] inputvotes(Scanner sc) {
		int[] a = new int[5];
		for(int i =0;i<a.length;i++ ) {
			System.out.print("Enter the no of votes for person "+(i+1)+" :");
			a[i] = sc.nextInt();
		}
		return a;
	}
	public static void totalvotes(int[] a) {
		int sum =0;
		for(int i =0;i<a.length;i++) {
			sum += a[i];
		}
		System.out.println("The total no of votes are "+sum);
	}
	public static void winner(int[] a) {
		int win = a[0];
		for(int i =0;i<a.length;i++) {
			if(a[i] > win) {
				win = a[i];
			}
		}
		System.out.println("The winner with the most no of votes  "+win);
	}
	

}


