package Sessao_5_OO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Exemplo_Date {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();//Data com o horario atual
		Date x2 = new Date(System.currentTimeMillis());//Assim tambem funciona
		
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L* 60L*5L );
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:45:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		
		
		System.out.println(y1);
		System.out.println(y2);
		
		System.out.println(sdf2.format(x1));
		
		
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		
		System.out.println(sdf2.format(x4));
		
		
	}

}
