import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Mensagem vital");
        System.out.println();

        int nivel = 0;

        while (nivel < 4 || nivel > 10){
            System.out.println("Qual o nível de dificuldade (4 - 10)? ");
            nivel = leitor.nextInt();
        }
        Random sorteador = new Random();
        String mensagemSecreta = "";

        int min = 65;
        int max = 90;

        int i = 0;
        while (i < nivel){

            int numeroSorteado = sorteador.nextInt(max - min + 1) + min;
            System.out.println(numeroSorteado);
            char letra = (char) numeroSorteado;
            mensagemSecreta = mensagemSecreta + letra;
            i++;
        }

        System.out.println("A MENSAGEM SECRETA É: ");
        System.out.println(mensagemSecreta);

        try {
            Thread.sleep(nivel * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        i = 0;
        while (i < 1000){
            System.out.println();
            i++;
        }
        System.out.println("DIGITE A MENSAGEM AGORA!");
        Scanner leitor2 = new Scanner(System.in);
        String mensagemUsuario = leitor2.nextLine();

        if (mensagemUsuario.equalsIgnoreCase(mensagemSecreta)){
            System.out.println("VOCÊ ACERTOU!!");
            System.out.println("A GUERRA ACABOU!!");
        } else {
            System.out.println("VOCÊ ERROU!!");
            System.out.println("A MENSAGEM SECRETA ERA: " + mensagemSecreta);
        }
    }
}
