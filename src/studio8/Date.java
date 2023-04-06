package studio8;

import java.util.Objects;

public class Date {
	
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	public Date(int initMonth, int initDay, int initYear, boolean initIsHoliday) {
		this.month=initMonth;
		this.day=initDay;
		this.year=initYear;
		this.isHoliday=initIsHoliday;
	}
	

    @Override
	public String toString() {
		return month+" / " +day+" / "+year;
	}




	@Override
	public int hashCode() {
		return Objects.hash(day, isHoliday, month, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && isHoliday == other.isHoliday && month == other.month && year == other.year;
	}


	public static void main(String[] args) {
		Date d1= new Date(12,22,2023,false);
		Date d2=new Date(7,28,2004,true);
		Date d3=new Date (2,17,2004, true);
		Date d4=new Date (4,06,2023,false);
		Date d5=new Date (10,11,1999,false);
		
		System.out.println(d1);
		
		
		
    }

}
