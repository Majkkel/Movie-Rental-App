import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.time.Year;
import java.util.Scanner;

class Informator extends JFrame {


    private static JLabel text;
    private static JButton leave;

    JFrame frame = new JFrame();

    Informator(){
        frame.setSize(800,120);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        int wiek = Year.now().getValue() - Main.users[0].age;
        if(wiek < 18){
            text = new JLabel(BibliotekaDzieci.info);
            text.setBounds(50, 0, 800, 50);
            frame.add(text);
        }
        else{text = new JLabel(Biblioteka.info);
            text.setBounds(50, 0, 800, 50);
            frame.add(text);}


        leave = new JButton("Cofnij");
        leave.setBounds(350,50,120,25);
        frame.add(leave);

        ActionListener l = new Informator.ClickListener1();
        leave.addActionListener(l);

    }
    public class ClickListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            int wiek = Year.now().getValue() - Main.users[0].age;
            if(wiek < 18){
                frame.dispose();
                BibliotekaDzieci bibliotekaDzieci = new BibliotekaDzieci();
            }
            else{
                frame.dispose();
                Biblioteka bibliotekaDorosli = new Biblioteka();}
        }
    }
}