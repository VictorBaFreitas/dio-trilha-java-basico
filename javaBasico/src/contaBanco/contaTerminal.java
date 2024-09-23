package contaBanco;

import java.util.Scanner;

public class contaTerminal {
    int numeroConta;
    String nomeTitular;
    double saldo;
    String agencia;

    public contaTerminal(int numeroConta, String nomeTitular, double saldo, String agencia) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void transferir(double valor, contaTerminal contaDestino) {
        saldo -= valor;
        contaDestino.saldo += valor;
    }

    public void exibirSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void exibirConta() {
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Agência: " + agencia);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite a agência: ");
        String agencia = scanner.nextLine();

        contaTerminal conta = new contaTerminal(numeroConta, nomeTitular, saldo, agencia);

        conta.exibirConta();

        System.out.println("Digite o valor a ser depositado: ");
        double valor = scanner.nextDouble();
        conta.depositar(valor);

        conta.exibirSaldo();

        System.out.println("Digite o valor a ser sacado: ");
        valor = scanner.nextDouble();

        if (valor > conta.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            conta.sacar(valor);
        }

        conta.exibirSaldo();

        System.out.println("Digite o número da conta destino: ");
        int numeroContaDestino = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do titular da conta destino: ");
        String nomeTitularDestino = scanner.nextLine();

        System.out.println("Digite o saldo da conta destino: ");
        double saldoDestino = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite a agência da conta destino: ");
        String agenciaDestino = scanner.nextLine();
        
        contaTerminal contaDestino = new contaTerminal(numeroContaDestino, nomeTitularDestino, saldoDestino, agenciaDestino);

        System.out.println("Digite o valor a ser transferido: ");
        valor = scanner.nextDouble();

        if (valor > conta.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            conta.transferir(valor, contaDestino);
        }

        conta.exibirSaldo();

        scanner.close();
    }
}
