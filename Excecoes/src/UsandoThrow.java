public class UsandoThrow {

    public static void main(String[] args) {
        //criando a classe de exceção

        try{
            String cepFormatado = formatarCep("14015110");
            System.out.println(cepFormatado);
        } catch (Cepinvalido e) {
            System.out.println("O cep não corresponde as regras");
            e.printStackTrace();
        }
    }

        /*o fato de usar o formatarCep já exige que use o try cacth pq ela é uma
         exception, não é um erro, mas uma exeção*/


         //criando o método de formatação


        public static String formatarCep( String cep) throws Cepinvalido{
            if(cep.length() != 8)
            //se for diferente de 8 lança a exceção.
            throw new Cepinvalido(); //aqui a condição que ele irá lançar
            return "14.015-110"; //simulando um cep formatado
            }
    
        }
