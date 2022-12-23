class Member_Main(){
	public static void main(String[] args) {
		Member mem = new Member();
		mem.display();
		mem = new Employee();
		mem.display();
		mem = new Manager();
		mem.display();
	}
}