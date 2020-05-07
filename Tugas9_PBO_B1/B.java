class B{ //1 
	private int i = 10; // variable class B	
	void lakukanSesuatu() { //2 	
	class C { //3 
	void aksesMemberOuterClass() { //4 
		System.out.println("i = " + i); 
	} //4 
} //3
C c = new C(); c.aksesMemberOuterClass(); 
} //2 
} //1