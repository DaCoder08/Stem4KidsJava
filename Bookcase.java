import java.util.*;
public class Bookcase{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Books In A Format Like This: Book1 Book2 Book3");
		String books = sc.nextLine();
		sc.close();
		ArrayList<Integer> booksA = new ArrayList<>();
		int ind = 0;
		for(int i = 0;i<books.length();i++){
			if(books.charAt(i) == ' '){
				int num = Integer.parseInt(books.substring(ind, i));
				booksA.add(num);
				ind = i+1;
			}
		}
		Collections.sort(booksA);
		ArrayList<Integer> shelvesUsed = new ArrayList<>();
		int ind2 = -1;
		for(int i = booksA.size();i > 0;i-=4){
			ind2 = booksA.get(i-1);
			while(shelvesUsed.indexOf(ind2)!=-1){
				ind2++;
			}
			shelvesUsed.add(ind2);
		}
		int sumCost = 0;
		for(int i = 0;i<shelvesUsed.size();i++){
			sumCost += shelvesUsed.get(i);
		}
		System.out.println(sumCost);
	}
}