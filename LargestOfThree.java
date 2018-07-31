import java.util.*;
public class LargestOfThree{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = reader.nextInt();
		System.out.println("Enter a Number");
		int b = reader.nextInt();
		System.out.println("Enter a Number");
		int c = reader.nextInt();
		if(a>b){
			if(a>c){
				System.out.println("A is the greatest");
			}else{
				System.out.println("C is the greatest");
			}
		}
		if(b>a){
			if(b>c){
				System.out.println("B is the greatest");
			}else{
				System.out.println("C is the greatest");
			}
		}

	}
}