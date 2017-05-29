package fr.razvan.smallcodes;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class JourDeLAnnee {
	
	public static void main(String[] args) {
		for(int i = 2008;i<=2121;i++){
			Calendar cal = new GregorianCalendar(i, Calendar.DECEMBER,
					8);
			if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
				System.out.println(cal.getTime());
			}
		}
	}

}
