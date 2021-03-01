public class Primo1 {

    public static void main(String[] args) {

        int EhPrimo = 1, d = 2, n = 664283;
        
        if (n <= 1) {
             EhPrimo = 0;
        }
        
        while (EhPrimo == 1 && d <= n /2) {
        if (n % d  == 0)
            EhPrimo = 0;
        d = d + 1;
        }
        
        System.out.println(EhPrimo);

    }

}