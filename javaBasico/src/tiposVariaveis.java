import java.sql.Date;

public class tiposVariaveis {
    public static void main(String[] args) {

        //Variáveis
        int idade = 20;
        boolean casado = true;
        double salario = 4560.0;
        float salario2 = 4560.0f;
        byte idade2 = 20;
        short idade3 = 20;
        long numeroGrande = 1000000000000000000L;
        char letra = 'A';
        String nome = "Maria";
        Date data = new Date(0);

        //Constantes
        final int IDADE = 20;
        System.out.println(IDADE);
        //Não é permitido IDADE = 30;
    }
}
