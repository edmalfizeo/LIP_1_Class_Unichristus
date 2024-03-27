package LearningGUI.Layouts;
import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid layout");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        JLabel idade = new JLabel("Ano de nascimento: ");
        JTextField idadeText = new JTextField(20);

        JButton btn = new JButton("Mandar!");
        JLabel resultado = new JLabel("");

        panel1.setLayout(new GridLayout(1,3));
        panel1.setSize(400,100);
        panel1.add(idade);
        panel1.add(idadeText);

        panel2.setLayout(new GridLayout(2,1));
        panel2.setSize(400,400);
        panel2.add(btn);
        panel2.add(resultado);

        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));
        frame.setSize(400,400);
        frame.add(panel1);
        frame.add(panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn.addActionListener(e -> resultado.setText("Sua idade é: " + (Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(idadeText.getText()))));
    }
}
