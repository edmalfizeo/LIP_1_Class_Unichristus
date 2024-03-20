package LearningGUI.FirstClassGUI;
import javax.swing.*;
public class FirstLessonGui {
    public static void main(String[] args) {
        //Definindo o frame
        JFrame frame = new JFrame("Minha primeira GUI");

        //Definindo as informações(Label)
        JLabel greeting = new JLabel("Hello From GUI");
        JLabel subtitle = new JLabel("This is my first GUI");

        //Setando o frame
        frame.setLayout(null);

        //Posicionando as labels na tela
        greeting.setBounds(20, 20, 200, 20);
        subtitle.setBounds(20, 50,200, 20);

        //Adicionando as labels no frame
        frame.add(greeting);
        frame.add(subtitle);

        //Definindo o tamanho do frame
        frame.setSize(400,200);

        //Definindo a visibilidade do frame
        frame.setVisible(true);

        //Ação de fechar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
