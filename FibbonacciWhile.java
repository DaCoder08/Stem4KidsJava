import java.util.Scanner;
public class FibbonacciWhile{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("How Many Fibbonacci Numbers");
		int n = reader.nextInt();
		int f = 1;
		int m = 0;
		System.out.println(m+"\n"+f);
		int i = 0;
		while(i<n){
			if(i%2==0){
				m = m+f;
				System.out.println(m);
			}else{
				f = m+f;
				System.out.println(f);
			}
			i += 1;
		}

	}
}