package Sessao_5_OO;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Exxemplo_Calender {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		
		Date d =  Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		//cal.add(Calendar.HOUR_OF_DAY, 4);
		//d = cal.getTime(); 
		//System.out.println(sdf.format(d));
		
		int mes = 1 + cal.get(Calendar.MONTH);
		
		int minutes = cal.get(Calendar.MINUTE);
		 System.out.println("Minutes: " + minutes);
		 System.out.println("Mes: " + mes);
	}
	
	
	
}
