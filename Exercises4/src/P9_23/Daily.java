package P9_23;

import java.text.DecimalFormat;

class Daily extends Appointment
{
	Daily(String description, String date)
	{ super(description, date); }
	
	boolean occursOn(int year, int month, int day)
	{
		DecimalFormat df = new DecimalFormat("00");
		String monthStr = df.format(month);
		String dayStr = df.format(day);
		String testDate = Integer.toString(year) + monthStr + dayStr;
		return Integer.parseInt(testDate) >= Integer.parseInt(super.getDate());
	}
}
