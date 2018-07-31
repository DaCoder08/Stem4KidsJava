import java.util.Scanner;
public class Factorial{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		int x = sc.nextInt();
		int y = 1;
		for(int i = 0;i<x;i++){
			y *= 1+i;
		}
		System.out.println(y);
	}
}
