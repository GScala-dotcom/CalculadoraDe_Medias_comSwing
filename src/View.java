import javax.swing.*;

public class View extends JFrame {

    /* Componentes devem estar no contexto da instância,
      para que possam ser acessados em todos os métodos
      não-estáticos da classe
  */
    private JTextArea texto = new JTextArea();

    public View(){
        //Define o título da janela
        super("Calculo da Media - Mackenzie");
        this.montaJanela();
    }

    private void montaJanela(){
        this.getContentPane().add(texto);
    }

}
