import java.util.Scanner;

public class Main {

    /* >>>>>> MS = (((P1 + P2) / 2) * 6 + N2 * 4) / 10 + Participação <<<<<< */

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo, Mackenzier! \nVocê possui a nota de ambas as avaliações? ");
        String quest = sc.nextLine();

        String quest1;
        if (quest.equals("sim")) {

            System.out.println("Informe o valor de P1");
            double p1 = sc.nextDouble();
            System.out.println("Informe o valor de P2");
            double p2 = sc.nextDouble();
            System.out.println("Informe o valor de N2");
            double n2 = sc.nextDouble();
            System.out.println("Informe o valor de participação");
            double part = sc.nextDouble();

            double ms = calcular(p1, p2, n2, part);

            System.out.println("MS = " + ms);

        } else if (quest.equals("nao")) {

            System.out.println("Não possui da p1 ou da p2? ");
            quest1 = sc.nextLine();

            if (quest1.equals("p1")) {

                double p1 = 0;
                System.out.println("Informe o valor de P2");
                double p2 = sc.nextDouble();
                System.out.println("Informe o valor de N2");
                double n2 = sc.nextDouble();
                System.out.println("Informe o valor de participação");
                double part = sc.nextDouble();

                double ms = calcular(p1, p2, n2, part);

                ms = calcular(p1, p2, n2, part);
                System.out.println("MS = " + ms);

            } else if (quest1.equals("p2")) {

                System.out.println("Informe o valor de P1");
                double p1 = sc.nextDouble();
                double p2 = 0;
                System.out.println("Informe o valor de N2");
                double n2 = sc.nextDouble();
                System.out.println("Informe o valor de participação");
                double part = sc.nextDouble();

                double ms = calcular(p1, p2, n2, part);

                ms = calcular(p1, p2, n2, part);
                System.out.println("MS = " + ms);
            }

            sc.close();
        }

    }

    public static double calcular(double p1, double p2, double n2, double part) {
        double ms = ((((p1 + p2) / 2) * 6 + n2 * 4) / 10 + part);
        return ms;
    }

}