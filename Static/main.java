class staticClass {
	static int num = 10;
	static void increase (){
		num++;
	}
	static {
		System.out.println("This is the STATIC Block");
		System.out.println("This is the STATIC Number : " + num);
	}
}


public class main {
	public static void main (String args[]){
		staticClass s = new staticClass();
		s.increase();
	}	
}