import java.util.*;

public class TryCatch {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner  (System.in).useLocale(Locale.US);



        try{
        //coletando informações do usuário
             System.out.println("Informe o seu nome: ");
            String nome = entrada.next();
            System.out.println("Informe o seu sobrenome: ");
            String sobrenome = entrada.next();
            System.out.println("Informe a sua idade: ");
            int idade = entrada.nextInt();
            System.out.println("Informe a sua altura: ");
            double altura = entrada.nextDouble();


        //imprimindo os dados obtidos pelo usuario
             System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é: " + altura + " cm");
            entrada.close();
        }
    
    catch (InputMismatchException e){
        //input equivocado de dados
        System.out.println("Os campos idade e altura precisam ser númericos ");

    }

    //importante saber que o erro esta sendo disparado para o devido terminal
    
    }
    
}
