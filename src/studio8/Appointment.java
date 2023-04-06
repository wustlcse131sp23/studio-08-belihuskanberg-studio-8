package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Appointment {

	private Date d;
	private Time t;
	
	public Appointment (Date initdate, Time inittime) {
		this.t=inittime;
		this.d=initdate;
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(d, t);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(d, other.d) && Objects.equals(t, other.t);
	}




	@Override
	public String toString() {
		return "Appointment [d=" + d + ", t=" + t + "]";
	}




	public static void main(String[] args) {
		Date d1=new Date(4,06,2023, false);
		Date d2=new Date(7,28,2004,true);
		Date d3=new Date (2,17,2004, true);
		Date d4=new Date (4,06,2023,false);
		Date d5=new Date (10,11,1999,false);
		
		Time t1=new Time (3,23,false);
		Time t2= new Time(2,30,false);
		Time t3=new Time(1,30,false);
		Time t4=new Time(2,53,false);
		Time t5=new Time(15,10, true);
		
		Appointment a1=new Appointment (d1, t1);
		Appointment a2=new Appointment (d2,t2);
		Appointment a3=new Appointment (d3,t3);
		Appointment a4=new Appointment (d4,t4);
		Appointment a5=new Appointment (d5,t5);
		
		
		
		
		
		LinkedList<Appointment> list =new LinkedList<Appointment>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		System.out.println(list);
	}

}
