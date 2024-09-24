package javaBasico;

public class estruturas {
    //Estruturas de controle

    public static void main(String[] args) {
        //Estruturas de controle
        //if
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        //switch
        int opcao = 2;
        switch (opcao) {
            case 1:
                System.out.println("Opção 1");
                break;
            case 2:
                System.out.println("Opção 2");
                break;
            default:
                System.out.println("Opção inválida");
        }

        //for
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        //while
        int j = 0;
        while (j < 10) {
            System.out.println("j = " + j);
            j++;
        }

        //do while
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 10);

        //break
        for (int l = 0; l < 10; l++) {
            if (l == 5) {
                break;
            }
            System.out.println("l = " + l);
        }

        //continue
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                continue;
            }
            System.out.println("m = " + m);
        }

        //return
        for (int n = 0; n < 10; n++) {
            if (n == 5) {
                return;
            }
            System.out.println("n = " + n);
        }

        //ternario
        int idade2 = 18;
        String status = (idade2 >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(status);

        //foreach
        String[] nomes = {"João", "Maria", "José"};
        for (String nome : nomes) {
            System.out.println(nome);
        }

        //label
        externo:
        for (int o = 0; o < 3; o++) {
            interno:for (int p = 0; p < 3; p++) {
                if (p == 1) {
                    break externo;
                }
                System.out.println("o = " + o + " p = " + p);
            }
        }

        //assert
        int x = 10;
        assert (x == 10) : "Erro x não é 10";
        System.out.println("x = " + x);

        //try catch finally
        try {
            int[] numeros = new int[5];
            System.out.println(numeros[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro ao acessar posição do array");
        } finally {
            System.out.println("Sempre será executado");
        }

        //throw
        try {
            throw new Exception("Erro");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //throws
        try {
            metodo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //try with resources
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("teste.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (java.io.IOException e) {
            System.out.println("Erro ao ler arquivo");
        }

        //synchronized
        synchronized (estruturas.class) {
            System.out.println("Bloco sincronizado");
        }

        /*
         * //volatile
         *   volatile int y = 10;
         *   System.out.println("y = " + y);
         */

        /*
         * //strictfp
         *   strictfp double z = 10.0;
         *   System.out.println("z = " + z);
         */

        //native
        //native void metodo(); 
    }

    private static void metodo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'metodo'");
    }
}
