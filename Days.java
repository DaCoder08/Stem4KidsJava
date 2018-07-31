import java.util.Scanner;
public class Days{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Day Of The Week");
		String g = sc.nextLine();
		g = g.toLowerCase();
		switch(g){
			case "monday":
				System.out.println("It Is The 1st Day Of The Week");
				break;
			case "tuesday":
				System.out.println("It Is The 2nd Day Of The Week");
				break;
			case "wednesday":
				System.out.println("It Is The 3rd Day Of The Week");
				break;
			case "thursday":
				System.out.println("It Is The 4th Day Of The Week");
				break;
			case "friday":
				System.out.println("It Is The 5th Day Of The Week");
				break;
			case "saturday":
				System.out.println("It Is The 6th Day Of The Week");
				break;
			case "sunday":
				System.out.println("It Is The 7th Day Of The Week");
				break;
			default:
			
		}
	}
}