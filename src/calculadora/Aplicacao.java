package calculadora;

import javax.swing.*;

public class Aplicacao {

    public static void main(String []args) {

        SwingUtilities.invokeLater(() -> {
            MediaFinal calcular = new MediaFinal();
            calcular.setVisible(true);
        });
    }
}