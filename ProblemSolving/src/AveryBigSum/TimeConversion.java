package AveryBigSum;


import java.text.ParseException;
import java.util.Scanner;



public class TimeConversion {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		String[] t= time.split(":");
		String AMPm = t[2].substring(2, 4);
		int hh, mm ,ss;
		hh =Integer.parseInt(t[0]);
		mm = Integer.parseInt(t[1]);
		ss = Integer.parseInt(t[2].substring(0,2));
		
		
		String checkAm = "AM"  , checkPM = "PM";
		int h= hh;
		if(AMPm.equals(checkAm) && h == 12) {
			h=0;
		}
		else if(AMPm.equals(checkPM) && h<12) {
			h +=12;
		}
		
		System.out.printf("%02d:%02d:%02d" , h , mm ,ss);

	}

}
