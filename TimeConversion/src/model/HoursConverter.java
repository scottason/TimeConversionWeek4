package model;

public class HoursConverter {
	public int hours;
	public int minutes;
	public int seconds;
	public HoursConverter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoursConverter(int hours) {
		super();
		this.hours = hours;
		setNewMinutes(hours);
	}

	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public void setNewMinutes(int hours) {
		final int MINUTES = 60;
		final int SECONDS = 60;
		int min;
		int sec;
		min = hours*MINUTES;
		setMinutes(min);
		
		sec = min*SECONDS;
		setSeconds(sec);
		
		
		
	
		
	}
	@Override
	public String toString() {
		return "HoursConverter [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}
	
}
