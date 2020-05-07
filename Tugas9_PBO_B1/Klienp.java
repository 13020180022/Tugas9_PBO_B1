public class Klienp {
public static void main(String[] args) { 
//parameter<String> parameterGen = new parameter<String>("Ali"); 
parameter<String,Integer> parameterGen = new parameter<>("Ali",130); 
	parameterGen.setNama("Susi"); 
	parameterGen.setKtp(123); 
	System.out.println(parameterGen.getNama()); 
	System.out.println(parameterGen.getKtp()); 
	}
}