package calculadora;

import java.awt.event.ActionEvent;
import java.util.Scanner;

/* >>>>>> MS = (((P1 + P2) / 2) * 6 + N2 * 4) / 10 + Participação <<<<<< */

public class MediaFinal extends MediaFinalForm{

    @Override
    protected void btnFecharClick(ActionEvent ev) {
        this.setVisible(false);
        this.dispose();
    }

    @Override
    protected void btnLimparClick(ActionEvent ev) {
        txtProva1.setText("");
        txtProva2.setText("");
        txtN2.setText("");
        txtParticipacao.setText("");
        txtMs.setText("");
    }

    @Override
    protected void btnCalcularClick(ActionEvent ev) {
        
    }
}
