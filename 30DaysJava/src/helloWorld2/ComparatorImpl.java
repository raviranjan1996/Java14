package helloWorld2;
import java.util.*;

class Players {
	String name;
	int score;

	Players(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Checkers implements Comparator<Players> {

	@Override
	public int compare(Players o1, Players o2) {
		Integer  scores1 = o1.score;
		Integer scores2 = o2.score;
		
		int comparisionScore = scores2.compareTo(scores1);
		if(comparisionScore==0) {
			return o1.name.compareTo(o2.name);
		}
		return comparisionScore;
	}
  	
    

        
    
    }



public class ComparatorImpl {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Players[] player = new Players[n];
        Checkers checker = new Checkers();
        
        for(int i = 0; i < n; i++){
            player[i] = new Players(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}