public class Testing25 {
    public static void main(String[] args) {
        int suhu = 37;

        if (suhu > 35) {
        System.out.println("Kebelet Ngising");
            if (suhu % 2 == 1) {
                System.out.println("ganjil coeg");
            }
        } else if (suhu == 35) { 
            System.out.println("Normal inimah");
        } else {
            System.out.println("Tolong mas");
        }
    }
}