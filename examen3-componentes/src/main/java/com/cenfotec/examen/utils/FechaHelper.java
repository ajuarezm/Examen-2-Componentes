package com.cenfotec.examen.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FechaHelper {
	public static String getFechaVuelo(Date fecha) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(fecha);
		calendar.add(Calendar.DATE, 1);

		return dateFormat.format(calendar.getTime());
	}
}