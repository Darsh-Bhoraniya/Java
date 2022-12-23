class ComplexNo{
	int real_no,img_no;
	ComplexNo(){
	}
	ComplexNo(int real_no,int img_no){
		this.real_no=real_no;
		this.img_no=img_no;
	}
	ComplexNo addNo(ComplexNo obj1,ComplexNo obj2){
		ComplexNo sum;
		sum=obj1;
		sum.real_no+=obj2.real_no;
		sum.img_no+=obj2.img_no;
		return sum;
	}
}