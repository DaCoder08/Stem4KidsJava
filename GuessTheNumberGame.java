import java.util.*;
public class GuessTheNumberGame{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = (int)(10*Math.random()+1);
		int x = 100;
		while(x!=n){
			System.out.println("Try to Guess My Number!");
			x = sc.nextInt();
			if(x<n){
				System.out.println("You Were Less Than My Number, Please Try Again!");
			}else if(x>n){
				System.out.println("You Were Greater Than My Number, Please Try Again!");
			}else{
				System.out.println("You Were Right!");
			}
			
		}
	}
}