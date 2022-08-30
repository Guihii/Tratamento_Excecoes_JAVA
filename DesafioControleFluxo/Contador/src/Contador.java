import java.util.*;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //coletando as informações do usuário
        System.out.println("Informe o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int numero2 = sc.nextInt();
        

        

        try {
            contador(numero1, numero2);
            
        } catch (ParametrosInavlidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

        

        public static void contador( int numero1, int numero2) throws ParametrosInavlidosException {
            if (numero1 > numero2){
                throw new ParametrosInavlidosException();
            }
            else {          
                for(int i = numero1; i <= numero2; i++){
                    System.out.println("Imprimindo o número: " +i );
                };
            }
        }
        

        



    
    
}
