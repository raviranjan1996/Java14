package helloWorld2;
import java.util.*;

//Write your Checker class here

class Checker implements Comparator<Player>{

	
	public int compare(Player o1, Player o2) {
		int comparision  = o1.name.compareTo(o2.name);
	
		
		if(o2.score == o1.score) {
			return comparision;
		}
		
			return o2.score-o1.score;
	}

	

}

class Player{
 String name;
 int score;
 
 Player(String name, int score){
     this.name = name;
     this.score = score;
 }

 public String toString() {
	 return name + " " + score;
 }
}

class ComparatorExample {

 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();

     Player[] player = new Player[n];
     Checker checker = new Checker();
     
     for(int i = 0; i < n; i++){
         player[i] = new Player(scan.next(), scan.nextInt());
     }
     scan.close();

     Arrays.sort(player, checker);
     
     for(var elements : player) {
    	 System.out.println(elements);
     }
   
 }
}