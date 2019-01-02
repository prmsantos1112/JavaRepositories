package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class programManipulaDateCalendar {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Date dat = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		
		Calendar calen = Calendar.getInstance();
		cal.setTime(dat);
		int minutes = calen.get(Calendar.MINUTE);
		
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutos: " + minutes);
		System.out.println("Mes: " + month);

	}

}
