class factorial {
	public static void main (String args[]){
		int fac = 1;
		for(int i = 5; i >= 1; i--){
			fac = fac * i;
		}
		System.out.println("This is the answer of the Factorial : " + fac);
	}
}