public class Klien {
public static void main(String[] args) {
//Orang<String> orangGen = new Orang<String>("Ali");
Orang<String> orangGen = new Orang<>("Ali");
orangGen.setNama("Susi");
System.out.println(orangGen.getNama());
}
}