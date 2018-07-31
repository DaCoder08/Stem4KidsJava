import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
public class CowProblem{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Cows In A Format Like This: Position Speed Position Speed");
		String cows = sc.nextLine();
		sc.close();
		Map<Integer, Integer> cowshm = new TreeMap();
		int ind = 0;
		boolean p = true;
		int pos = -1;
		int speed = -1;
		for(int i = 0;i<cows.length();i++){
			if(cows.charAt(i) == ' '){
				int num = Integer.parseInt(cows.substring(ind, i));
				if(p){
					pos = num;
					p = false;
				} else{
					speed = num;
					p = true;
				}
				ind = i+1;
				cowshm.put(pos, speed);
			}
		}
		ArrayList<Integer> cowSpeeds = new ArrayList<>(cowshm.values());
		int j;
		int groups = cowSpeeds.size();
		boolean ifGreater;
		for(int i = 0;i<cowSpeeds.size();i++){
			j = i+1;
			ifGreater = false;
			while (ifGreater == false && j<cowSpeeds.size()) {
				if(cowSpeeds.get(i)>cowSpeeds.get(j)){
					groups -= 1;
					ifGreater = true;
				}
				j++;
			}
		}
		System.out.println(groups);
	}
}
