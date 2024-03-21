package LearningGUI.Layouts;
import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class FlowLayoutExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        JFrame frame = new JFrame("My GUI FlowLayout");
        JPanel panel = new JPanel();
        JPanel panelIdade = new JPanel();
        JPanel panelBotao = new JPanel();

        JLabel labelNome = new JLabel("Nome: ");
        JTextField fieldNome = new JTextField(20);

        JLabel labelIdade = new JLabel("Idade: ");
        JTextField fieldIdade = new JTextField(20);

        JButton confirmar = new JButton("Confirmar Cadastro");
        JLabel resultado = new JLabel("");


        panel.setLayout(new BorderLayout());
        panel.setSize(400,100);
        panel.add(labelNome, BorderLayout.WEST);
        panel.add(fieldNome , BorderLayout.EAST);

        panelIdade.setLayout(new BorderLayout());
        panelIdade.setSize(400,100);
        panelIdade.add(labelIdade, BorderLayout.WEST);
        panelIdade.add(fieldIdade, BorderLayout.EAST);

        panelBotao.setLayout(new BorderLayout());
        panelBotao.setSize(400,100);
        panelBotao.add(confirmar, BorderLayout.CENTER);
        panelBotao.add(resultado, BorderLayout.SOUTH);

        confirmar.addActionListener(e -> resultado.setText(fieldNome.getText() + "Sua idade é: " + (calendar.get(Calendar.YEAR) - Integer.parseInt(fieldIdade.getText()))));

        frame.setLayout(new FlowLayout());
        frame.add(panel);
        frame.add(panelIdade);
        frame.add(panelBotao);
        frame.setVisible(true);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
