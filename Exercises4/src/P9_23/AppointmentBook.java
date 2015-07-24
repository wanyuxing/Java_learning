package P9_23;

import java.io.FileNotFoundException;

class AppointmentBook 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Appointment a = new Appointment("Sleep", "19901215");
		a.addAppointment("onetime", "Dream", "19910226");
		a.addAppointment("daily", "Study", "20150724");
		a.addAppointment("monthly", "Play", "20150101");
		//a.save();
		
		Onetime b = new Onetime("Drink", "19901212");
		Monthly c = new Monthly("Drive", "20101010");
		//b.load();
		c.load();
	}
}
