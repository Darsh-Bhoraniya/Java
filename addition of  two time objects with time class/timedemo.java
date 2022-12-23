import timedata.Time;
public class timedemo{
	public static void main(String[] args) {
		Time t1 =new Time(3600,90,15,1);
		Time t2 = new Time(3600,90,15,1);		
		t1.add(t2);
		t1.displayTime();
	}
}