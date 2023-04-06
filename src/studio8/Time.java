package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean is12Hour;

	/**
	 * 
	 * @param initHour hour provided
	 * @param initMinute minute provided
	 * @param initIs12Hour whether or not it 12 hour or 24 hour format
	 */
	public Time(int initHour, int initMinute, boolean initIs12Hour) {
		this.hour=initHour;
		this.minute=initMinute;
		this.is12Hour=initIs12Hour;
	}



	@Override
	public String toString() {
		//return "Time [hour=" + hour + ", minute=" + minute + ", is12Hour=" + is12Hour + "]";
		if(is12Hour==true && hour>12) {
			return (hour-12) + ":" + minute+ " PM";
		}else if(is12Hour==true && hour<12) {
			return hour+":"+minute+" AM";
		}
		else{
			return hour + ":" + minute;
		}
	}



	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}



	public static void main(String[] args) {
		Time t1= new Time(1,30,true);
		Time t2= new Time(2,30,false);
		Time t3=new Time(1,30,false);
		Time t4=new Time(2,53,false);
		Time t5=new Time(15,10, true);

		HashSet<Time> set =new HashSet<Time>();
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		System.out.println(set);
	}

}