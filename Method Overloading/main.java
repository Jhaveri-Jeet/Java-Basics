class add_numbers {
	void add (int n1, int n2){
		int ans = n1 + n2;
		System.out.println("This is the answer of the Addition: " + ans);
	}
	void add (int n1, int n2, int n3){
		int ans = n1 + n2 + n3;
		System.out.println("This is the answer of the Addition: " + ans);
	}
}


class main {
	public static void main (String args[]){
		add_numbers a = new add_numbers();
		a.add(1,2);
		a.add(1,2,3);
	}
}