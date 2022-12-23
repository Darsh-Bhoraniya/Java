class MyPoint{
	double x,y,z;
	MyPoint(){
		this(0,0,0);
	}
	MyPoint(double x,double y,double z){
		x=this.x;
		y=this.y;
		z=this.z;
	}
	double distance(double x,double y,double z){
		return (Math.sqrt(Math.pow(x-this.x,2))+Math.sqrt(Math.pow(y-this.y,2))+Math.sqrt(Math.pow(z-this.z,2)));
	}
	double distance(MyPoint pt){
		return distance(pt.x,pt.y,pt.z);
	}
}



class MyPointMain{
	public static void main(String[] args) {
		MyPoint pt = new MyPoint();
		System.out.println(pt.distance(1,1,1));
	}
}