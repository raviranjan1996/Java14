package helloWorld2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lexicography {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        char[] ch = s.toCharArray();
        ArrayList<String> list = new ArrayList<String>();
        for(int i =0 ; i < ch.length-(k-1) ; i++) {
           
                list.add(s.substring(i, i+k));
               
           
        }
        list.forEach(e-> System.out.println(e));
        Collections.sort(list);
        for(int i =0 ; i<list.size() ;) {
            smallest =list.get(0);
            largest =list.get(list.size()-1);
            break;
        }
        System.out.println();
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}