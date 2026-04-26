package practice2;

public class Time implements Comparable<Time>{
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}

	public void setTime(int hour, int minute, int second) {
		if(hour>= 0 && hour<24) {
			this.hour = hour;
		}
		else {
			throw new IllegalArgumentException("Hour must be 0-23");
		}
		if(minute >= 0 && minute < 60) {
			this.minute = minute;
		}
		else {
			throw new IllegalArgumentException("Minute must be 0-59");
		}
		if(second >= 0 && second < 60) {
			this.second = second;
		}
		else {
			throw new IllegalArgumentException("Second must be 0-59");
		}
	}

	public String toUniversal() {
		return String.format("%02d", this.hour) + ":" +
		String.format("%02d", this.minute) + ":" +
		String.format("%02d", this.second);
	}

	public String toStandard() {
		int h;
		String period;

		if(this.hour == 12) {
			h = 12;
			period = "PM";
		}
		else if(this.hour > 12) {
			h = this.hour - 12;
			period = "PM";
		}
		else if(this.hour == 0) {
			h = 12;
			period = "AM";
		}
		else {
			h = this.hour;
			period = "AM";
		}

		return String.format("%02d", h) + ":" +
		String.format("%02d", this.minute) + ":" +
		String.format("%02d", this.second) + " " + period;
	}

	public void add(Time other) {
		int extra;

		this.second += other.second;
		extra = this.second / 60;
		this.second = this.second % 60;

		this.minute += other.minute + extra;
		extra = this.minute / 60;
		this.minute = this.minute % 60;

		this.hour += other.hour + extra;
		this.hour = this.hour % 24;
	}

	@Override
	public int compareTo(Time other) {
		int totalSecondsThis = this.hour * 3600 + this.minute * 60 + this.second;
		int totalSecondsOther = other.hour * 3600 + other.minute * 60 + other.second;
		return Integer.compare(totalSecondsThis, totalSecondsOther);
	}
}
