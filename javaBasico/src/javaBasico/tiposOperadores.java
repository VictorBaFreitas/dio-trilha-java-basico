package javaBasico;
public class tiposOperadores {
    public static void main(String[] args) {
        //Operador de Atribuição
        int a = 10;

        //Operador de Aritméticos
        int b = 10 + 5;
        int c = 10 - 5;
        int d = 10 * 5;
        int e = 10 / 5;
        int f = 10 % 5;

        //Operador de Incremento e Decremento
        int g = 10;
        g++;
        int h = 10;
        h--;

        //Operador de Igualdade
        int i = 10;
        int j = 5;
        boolean k = i == j;
        boolean l = i != j;

        //Operador de Relacionais
        int m = 10;
        int n = 5;
        boolean o = m > n;
        boolean p = m < n;
        boolean q = m >= n;
        boolean r = m <= n;

        //Operador Lógicos
        boolean s = true;
        boolean t = false;
        boolean u = s && t;
        boolean v = s || t;
        boolean w = !s;

        //Operador Ternário
        int x = 10;
        int y = 5;
        String z = ((x + y) / 2) > 6 ? "Aprovado" : "Reprovado";
        System.out.println("Resultado do Operador Ternário: " + z);

        System.out.println("Operador de Atribuição: " + a);
    }
}
