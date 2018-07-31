import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
public class CowProblem3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Cows In A Format Like This: Position Speed Position Speed");
		String cows = sc.nextLine();
		if (!cows.get().equals(" ")){
			cows += " ";
		}
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
        int numberOfLanes = 0;
        int maxValue;
        while(cowSpeeds.size()!=0){
            maxValue = cowSpeeds.get(0);
            //System.out.println("maxvalue: " + maxValue);
            cowSpeeds.remove(cowSpeeds.indexOf(maxValue));
            for(int i = 0;i<cowSpeeds.size();i++){
                //System.out.println("maxvalue: " + maxValue);
                //System.out.println("Speeds: "+cowSpeeds);
                if(maxValue<=cowSpeeds.get(i)){
                    maxValue = cowSpeeds.get(i);
                    cowSpeeds.remove(cowSpeeds.get(i));
                    i -= 1;
                }
            }
            numberOfLanes++;
        }
        System.out.println(numberOfLanes);
    }
}
