
public class Primo2 {
    public static void main(String[] args) {

        int numPrimo = 2147483647;
        long numDivisores = 0;

        for(long i = 1; i <= numPrimo; i++){
            if(numPrimo % i == 0){
                numDivisores++;
            }
        }
        if(numDivisores == 2){
            System.out.println("Eh primo");
        }else{
            System.out.println("Nao eh primo");
        }
    }
}