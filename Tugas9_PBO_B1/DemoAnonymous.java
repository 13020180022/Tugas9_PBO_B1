public class DemoAnonymous{
    public static void main(String[] args){
        DemoAnonymous demo = new DemoAnonymous() {
            
            public void Lakukan(String data1, int data2, boolean data3) {
                System.out.println("Nama Saya: "+data1);
                System.out.println("Usia Saya: "+data2);
                System.out.println("Kondisi Saya: "+data3);
            }
        };
        //Menjalankan Method serta Memberikan Nilai Pada Parameter
        demo.Lakukan("Widya", 20, true);
    }
}