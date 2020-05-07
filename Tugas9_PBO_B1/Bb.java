class Bb{ // BeginClass B 
	void myMethod() { // BeginMethod Class B 
	class C { // BeginClass C
	int i = 10; // variable class C
	void lakukanSesuatu() { 
		System.out.println(" i = " + i); 
	} 
} // EndClass C
C c = new C();//instance dari Inner Class C
b.lakukanSesuatu();//panggil method innerClass C
} // EndMethod Class Bb } 
// EndClass Bb
