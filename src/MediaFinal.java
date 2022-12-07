import javax.swing.text.DefaultEditorKit;
import java.util.Scanner;

public class MediaFinal {

    double p1;
    double p2;
    double n2;
    double part;
    double ms;

    public MediaFinal() {
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getPart() {
        return part;
    }

    public void setPart(double part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return "Media Final = " + ms;
    }

    public void calcularTodasAsNotas() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de P1");
        p1 = sc.nextDouble();
        System.out.println("Informe o valor de P2");
        p2 = sc.nextDouble();
        System.out.println("Informe o valor de N2");
        n2 = sc.nextDouble();
        System.out.println("Informe o valor de participação");
        part = sc.nextDouble();

        ms = ((((p1 + p2) / 2) * 6 + n2 * 4) / 10 + part);
        System.out.println("Sua media final é = " + ms);
    }

    public void calcularSemP1() {

        Scanner sc = new Scanner(System.in);

        p1 = 0;
        System.out.println("Informe o valor de P2");
        p2 = sc.nextDouble();
        System.out.println("Informe o valor de N2");
        n2 = sc.nextDouble();
        System.out.println("Informe o valor de participação");
        part = sc.nextDouble();

        ms = ((((p1 + p2) / 2) * 6 + n2 * 4) / 10 + part);
        System.out.println("Sua media final é = " + ms);
    }

    public void calcularSemP2() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de P1");
        p1 = sc.nextDouble();
        p2 = 0;
        System.out.println("Informe o valor de N2");
        n2 = sc.nextDouble();
        System.out.println("Informe o valor de participação");
        part = sc.nextDouble();

        ms = ((((p1 + p2) / 2) * 6 + n2 * 4) / 10 + part);
        System.out.println("Sua media final é = " + ms);
    }

    public void calcular() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Voce possui a nota de ambas as intermediarias?");

        String quest = sc.nextLine();
        if (quest.equals("sim")) {

            calcularTodasAsNotas();

        } else if (quest.equals("nao")) {

            System.out.println("Não possui da p1 ou da p2? ");
            String quest1 = sc.nextLine();

            if (quest1.equals("p1")) {
                calcularSemP1();
            } else if (quest1.equals("p2")) {
                calcularSemP2();
            }
        }
        System.exit(0);
    }
}
