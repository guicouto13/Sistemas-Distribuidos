
public class Primo2 {
    public static void main(String[] args) {

        int numPrimo = 2147483647;
        int numDivisores = 0;

        for(int i = 1; i <= numPrimo; i++){
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