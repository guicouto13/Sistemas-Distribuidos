
public class Primo3{

    public static void main(String[] args){

        int num =2147483647;
        boolean ehPrimo = true;

        for(int i=2; i<num; i++){
            if(num%i==0){
                ehPrimo = false;
                break;
            }
        }

        if(ehPrimo){
            System.out.println("Eh primo");
        }else{
            System.out.println("Nao eh primo");
        }

    }
}