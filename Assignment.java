import java.util.Scanner;
public class Assignment {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Java class is awesome");
		System.out.println("Number of apples: ");
		int apples = reader.nextInt();
		System.out.println("Number of apples: "+apples);
		System.out.println("Number of marks: ");
		double marks = reader.nextDouble();
		System.out.println("Number of marks: "+marks);
		reader.close();
	}

}
