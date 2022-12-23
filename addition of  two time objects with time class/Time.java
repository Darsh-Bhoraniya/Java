package timedata;

public class Time{

	int hour;
	int minite;
	int secound;
	int day;
	
	

	public Time(){
		secound=0;
		minite=0;
		hour=0;
		day=0;
		
		
	}
	public Time(int secound ){
		this();
		this.secound=secound;

	}	
	public Time(int secound,int minite ){
		this(secound);
		this.minite=minite;
		
		
	}
	public Time(int secound ,int minite ,int hour){
		this(secound,minite);
		this.hour=hour;
		
		
		
	}
	public Time(int secound,int minite,int hour, int day ){
		this(secound,minite,hour);
		this.day=day;
		
		
	}

	public void add(Time ttemp){

		this.secound+= ttemp.secound;
		this.minite+=ttemp.minite;
		this.hour+=ttemp.hour;
		this.day+=ttemp.day;
		while(this.secound>=60)
		{
			this.secound=this.secound-60;
			this.minite++;
		}
		while(this.minite>=60)
		{
			this.minite=this.minite-60;
			this.hour++;
		}
		while(this.hour>=24)
		{
			this.hour=this.hour-24;
			this.day++;
		}

	}
	public void displayTime()
	{
		System.out.println("Time is "+day+" : "+hour+" : "+minite+" : "+secound);
	}

}