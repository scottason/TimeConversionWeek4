package model;

public class MinutesConvert {
	public int hours;
	public int minutes;
	public int seconds;
	public int newMinutes;
	public MinutesConvert() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MinutesConvert( int minutes) {
		super();
		this.minutes = minutes;
		setTime(minutes);
		
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
	public int getNewMinutes() {
		return newMinutes;
	}
	public void setNewMinutes(int newMinutes) {
		this.newMinutes = newMinutes;
	}
	private void setTime(int minutes2) {
		// TODO Auto-generated method stub
		final int HOURS = 60;
		final int SECONDS = 60;
		int timeLeft;
		setHours(minutes2/HOURS);
		timeLeft = minutes%HOURS;
		
		setNewMinutes(timeLeft);
		
		setSeconds(timeLeft*SECONDS);
		
	}

	@Override
	public String toString() {
		return "MinutesConvert [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}
	
}
