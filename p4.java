public class program4 {
    public static void main(String[] args) {
        // judul output rentang bilangan prima
        System.out.println("rentang bilangan prima dari angka 1-500:");
        
        //metode bilangan prima yang dihasilkan
        for (int bilangan = 1; bilangan <= 200; bilangan++) {
            if (isPrime(bilangan)) {
                System.out.print(bilangan + " ");
            }                                           
        }
    }
    // metode isprime untuk mengidentifikasi bilangan prima 
    public static boolean isPrime(int Angka) {
        if (Angka <= 1) {
            return false;
        }
        // metode mengecek apakah angka tersebut bilangan prima atau tidak
        for (int bilangan = 2; bilangan <= Math.sqrt(Angka); bilangan++) {
            if (Angka % bilangan == 0) {
                return false;
            }else{
                return true;
            }
        }
        return true;
}
}
