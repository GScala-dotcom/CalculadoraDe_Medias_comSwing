package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class MediaFinalForm extends JFrame {

    private static final int TAMANHO_TXT = 10;

    protected JPanel pnlForm;
    protected JPanel pnlRodape;

    protected JButton btnCalcular;
    protected JButton btnLimpar;
    protected JButton btnFechar;

    //Nota da prova 1
    protected JLabel lblProva1;
    protected JTextField txtProva1;
    //Nota da prova 2
    protected JLabel lblProva2;
    protected JTextField txtProva2;
    //Nota da NS
    protected JLabel lblN2;
    protected JTextField txtN2;
    //Nota de Participação
    protected JLabel lblParticipacao;
    protected JTextField txtParticipacao;
    //Media Final - MS
    protected JLabel lblMs;
    protected JTextField txtMs;

    public MediaFinalForm() {
        this.inicializar();
        this.eventos();
    }

    public void inicializar() {
        this.setTitle("MackMedia");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.setResizable(false);

        this.getContentPane().add(getPnlForm(), BorderLayout.CENTER);
        this.getContentPane().add(getPnlRodape(), BorderLayout.PAGE_END);
        this.pack();
    }

    protected abstract void btnFecharClick(ActionEvent ev);
    protected abstract void btnLimparClick(ActionEvent ev);
    protected abstract void btnCalcularClick(ActionEvent ev);

    private void eventos() {
        btnFechar.addActionListener(this::btnFecharClick);
        btnLimpar.addActionListener(this::btnLimparClick);
        btnCalcular.addActionListener(this::btnCalcularClick);
    }

    public JPanel getPnlForm() {
        if(pnlForm == null) {
            pnlForm = new JPanel(new GridLayout(5,2));

            lblProva1 = new JLabel("Nota da P1");
            txtProva1 = new JTextField(TAMANHO_TXT);

            lblProva2 = new JLabel("Nota da P2");
            txtProva2 = new JTextField(TAMANHO_TXT);

            lblN2 = new JLabel("Pontos da N2");
            txtN2 = new JTextField(TAMANHO_TXT);

            lblParticipacao = new JLabel("Nota de participação");
            txtParticipacao = new JTextField(TAMANHO_TXT);

            lblMs = new JLabel("Media Final");
            txtMs = new JTextField(TAMANHO_TXT);
            txtMs.setEditable(false);

            pnlForm.add(lblProva1);
            pnlForm.add(txtProva1);

            pnlForm.add(lblProva2);
            pnlForm.add(txtProva2);

            pnlForm.add(lblN2);
            pnlForm.add(txtN2);

            pnlForm.add(lblParticipacao);
            pnlForm.add(txtParticipacao);

            pnlForm.add(lblMs);
            pnlForm.add(txtMs);
        }
        return pnlForm;
    }

    public JPanel getPnlRodape() {
        if(pnlRodape == null) {
            pnlRodape = new JPanel(new FlowLayout(FlowLayout.CENTER));

            btnCalcular = new JButton("Calcular");
            btnLimpar = new JButton("Limpar");
            btnFechar = new JButton("Fechar");

            pnlRodape.add(btnCalcular);
            pnlRodape.add(btnLimpar);
            pnlRodape.add(btnFechar);
        }
        return pnlRodape;
    }
}
