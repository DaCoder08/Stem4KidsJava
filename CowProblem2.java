import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
public class CowProblem2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Cows In A Format Like This: Position Speed Position Speed");
		String cows = sc.nextLine();
		System.out.println("Enter The Time");
		int time = sc.nextInt();
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
		ArrayList<Integer> cowPos = new ArrayList<>(cowshm.keySet());
		//System.out.println(cowSpeeds+"\n"+cowPos+"\n"+cowshm);
		int j;
		int groups = cowSpeeds.size();
		boolean ifGreater;
		for(int i = 0;i<cowSpeeds.size();i++){
			j = i+1;
			ifGreater = false;
			while (ifGreater == false && j<cowSpeeds.size()) {
				int distance = cowPos.get(j)-cowPos.get(i);
				if(cowSpeeds.get(i)>cowSpeeds.get(j) && distance<=cowSpeeds.get(i)*time){
					groups -= 1;
					ifGreater = true;
				}
				j++;
			}
		}
		System.out.println(groups);
	}
}