import java.util.Scanner;
public class Prime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number For Me To Check If It Is Prime");
		int n = sc.nextInt();
		int i=2;
		boolean isPrime = true;
		while(i<n && isPrime){
			if(n%i == 0){
				isPrime = false;
				System.out.println(n+" Is Not Prime");
			}
			i += 1;
		}
		if(isPrime){
			isPrime = false;
			System.out.println(n+" Is Prime");
		}
	}
}