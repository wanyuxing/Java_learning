package P9_23;

import java.text.DecimalFormat;

class Monthly extends Appointment
{
	Monthly(String description, String date)
	{ super(description, date); }
	
	boolean occursOn(int year, int month, int day)
	{
		DecimalFormat df = new DecimalFormat("00");
		String monthStr = df.format(month);
		String testDate = Integer.toString(year) + monthStr;
		return Integer.parseInt(testDate) >= Integer.parseInt(super.getDate());
	}
}
