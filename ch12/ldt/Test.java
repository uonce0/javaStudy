package ch12.ldt;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// Date vs. LoacalDate, LocalTime, LocalDateTime
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String dateStr = sdf.format(date);
		System.out.println(dateStr);
		
//		date.getYear(); //deprecated : 사용불가
		
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		String str = "2025.09.01 11:10:47";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
		System.out.println(dateTime);
		
		System.err.println(ldt.getYear());
		System.err.println(ldt.getMonth());
		System.err.println(ldt.getMonthValue());
		System.err.println(ldt.getDayOfMonth());
		System.err.println(ldt.getHour());
		System.err.println(ldt.getMinute());
		System.err.println(ldt.getSecond());
	}

}
