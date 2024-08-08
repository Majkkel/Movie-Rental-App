import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.Year;
import java.util.Scanner;

import static java.lang.System.out;


public class MainPage extends JFrame{
    private static JLabel loginLabel;
    private static JTextField loginText;
    private static JLabel passwordLabel;
    private static JTextField passwordText;
    private static JButton registerButton;
    private File userData;

    JFrame frame = new JFrame();

    JButton button1 = new JButton("Biblioteka filmow");
    JButton button2 = new JButton("Wypozyczone filmy");
    JButton button3 = new JButton("Zapisz do pliku");
    JButton button4 = new JButton("Wyloguj się");

    MainPage(){
        frame.setSize(420,420);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        button1.setBounds(130,90,150,40);
        frame.add(button1);

        button2.setBounds(130,160,150,40);
        frame.add(button2);

        button3.setBounds(130,230,150,40);
        frame.add(button3);

        button4.setBounds(130,300,150,40);
        frame.add(button4);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



        ActionListener biblioteka = new MainPage.ClickListener1();
        button1.addActionListener(biblioteka);

        ActionListener wypozyczone = new MainPage.ClickListener2();
        button2.addActionListener(wypozyczone);

        ActionListener zapis = new MainPage.ClickListener3();
        button3.addActionListener(zapis);

        ActionListener logout = new MainPage.ClickListener4();
        button4.addActionListener(logout);
    }

    public class ClickListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int wiek = Year.now().getValue() - Main.users[0].age;
            if(wiek < 18){
                frame.dispose();
                BibliotekaDzieci bibliotekaDzieci = new BibliotekaDzieci();
            }
            else{frame.dispose();
            Biblioteka bibliotekaDorosli = new Biblioteka();}
        }
    }
    public class ClickListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            Wypozyczone wypozyczone = new Wypozyczone();
        }
    }
    public class ClickListener3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                PrintWriter out = new PrintWriter("DATA.txt");
                String z = "";
                for(Film film : Wypozyczone.lista){
                    z += film;
                }
                out.write(z);
                out.close();
            } catch (FileNotFoundException ex) {
                System.out.println("nie ma");
            }
            JOptionPane.showMessageDialog(frame, "Zapisano do pliku");

        }
    }
    public class ClickListener4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            LoginPage poRejestracji = new LoginPage();
        }
    }
}
