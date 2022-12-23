class TimeIni{
	int h,m,s;
	TimeIni(){
		this(0,0,0);
	}
	TimeIni(int h){
		this(h,0,0);
	}
	TimeIni(int h,int m){
		this(h,m,0);
	}
	TimeIni(int h,int m,int s){
		this.h=h;
		this.m=m;
		this.s=s;
	}
	void addition(TimeIni obj1,TimeIni obj2){

		obj1.h+=obj2.h;
		obj1.m+=obj2.m;
		obj1.s+=obj2.s;
		if (s>=60) {
			m+=(int)s/60;
			s%=60;
		}
		if (m>=60) {
			h+=(int)s/60;
			m%=60;
		}
		System.out.print(obj1.h+obj1.m+obj1.s);
	}
}