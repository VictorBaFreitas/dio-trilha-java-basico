package javaBasico;
import java.util.Scanner;

public class exercicioSmartTv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean tv = true;
        int volume = 10;
        int canal = 1;

        while (tv) {
            System.out.println("TV Ligada");
            System.out.println("Volume: " + volume);
            System.out.println("Canal: " + canal);

            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Aumentar Volume");
            System.out.println("4 - Diminuir Volume");
            System.out.println("5 - Trocar Canal");
            System.out.println("6 - Trocar Canal Específico");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (tv == false) {
                        tv = ligar();
                    } else {
                        System.out.println("TV já está ligada");
                    }
                    break;
                case 2:
                    tv = desligar();
                    break;
                case 3:
                    if (tv == true && volume < 100 && volume > 0) {
                        volume = aumentarVolume(volume);
                    } else {
                        System.out.println("TV desligada ou volume está máximo ou no mínimo");
                    }
                    break;
                case 4:
                    if (tv == true && volume < 100 && volume > 0) {
                        volume = diminuirVolume(volume);
                    } else {
                        System.out.println("TV desligada ou volume está máximo ou no mínimo");
                    }
                    break;
                case 5:
                    if (tv) {
                        canal = trocarCanal(canal);
                    } else {
                        System.out.println("TV desligada");
                    }
                    break;
                case 6:
                    if (tv) {
                        System.out.println("Digite o canal desejado: ");
                        int novoCanal = scanner.nextInt();
                        canal = trocarCanal(canal, novoCanal);
                    } else {
                        System.out.println("TV desligada");
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    private static boolean ligar() {
        return true;
    }

    private static boolean desligar() {
        return false;
    }

    private static int aumentarVolume(int volume) {
        return volume + 1;
    }

    private static int diminuirVolume(int volume) {
        return volume - 1;
    }

    private static int trocarCanal(int canal) {
        return canal + 1;
    }

    private static int trocarCanal(int canal, int novoCanal) {
        return novoCanal;
    }
}
