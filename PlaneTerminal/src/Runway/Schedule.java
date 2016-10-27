package Runway;

public class Schedule {
	
	private int hour;
	private int minute;
	
	public Schedule() { //Constructeur par défaut
		this.hour = 12;
		this.minute = 0;		
		//this(12,0);
	}
    
	public Schedule(int hour, int minute) { //Constructeur valué
		this.hour = hour%24+minute/60;
		this.minute = minute%60;
	}

	public String toString() {
		String s="";
		if(this.hour<10) s+="0";
		s+=this.hour;
		s+=":";
		if(this.minute<10) s+="0";
		s+=this.minute;
		return s;
	}
}
