import java.util.Scanner;

public class Main {

    /* >>>>>> MS = (((P1 + P2) / 2) * 6 + N2 * 4) / 10 + Participação <<<<<< */

    public static void main(String []args) {

        View janela = new View();
        janela.setVisible(true);
        janela.setSize(800,620);

        Scanner sc = new Scanner(System.in);
        MediaFinal ms = new MediaFinal();

        ms.calcular();
    }
}