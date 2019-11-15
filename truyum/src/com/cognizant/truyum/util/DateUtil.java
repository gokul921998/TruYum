/**
 * 
 */
package com.cognizant.truyum.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Gokul
 *
 */
public class DateUtil {
	public static Date convertToDate(String date) throws ParseException {
		Date convertedDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		return convertedDate;
	}

}
