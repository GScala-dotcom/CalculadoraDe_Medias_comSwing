package calculadora;

import java.awt.event.ActionEvent;

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
        Calcular();
    }

    protected void Calcular() {
        Double p1, p2, n2, part;

        p1 = Double.parseDouble(txtProva1.getText());
        p2 = Double.parseDouble(txtProva2.getText());
        n2 = Double.parseDouble(txtN2.getText());
        part = Double.parseDouble(txtParticipacao.getText());

        Double media = ((((p1 + p2) / 2) * 6 + n2 * 4) / 10 + part);

        //Esta faltando truncar o resultado.
        txtMs.setText(String.valueOf(media));
    }
}
