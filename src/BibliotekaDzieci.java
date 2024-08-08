import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.time.Year;
import java.util.Scanner;


public class BibliotekaDzieci extends JFrame{
    public static String info;
    private static JLabel label1;

    private static JLabel label3;

    private static JLabel label5;
    private static JLabel label6;

    private static JButton info1;
    private static JButton wypozycz1;

    private static JButton info3;
    private static JButton wypozycz3;

    private static JButton info5;
    private static JButton wypozycz5;
    private static JButton info6;
    private static JButton wypozycz6;

    private static JButton leave;


    JFrame frame = new JFrame();
    BibliotekaDzieci() {
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        label1 = new JLabel("Avengers");
        label1.setBounds(10, 0, 120, 25);
        frame.add(label1);

        info1 = new JButton("Info");
        info1.setBounds(10, 20, 60, 25);
        frame.add(info1);

        wypozycz1 = new JButton("Rent");
        wypozycz1.setBounds(10, 50, 60, 25);
        frame.add(wypozycz1);


        label3 = new JLabel("Shrek");
        label3.setBounds(220, 0, 120, 25);
        frame.add(label3);

        info3 = new JButton("Info");
        info3.setBounds(220, 20, 60, 25);
        frame.add(info3);

        wypozycz3 = new JButton("Rent");
        wypozycz3.setBounds(220, 50, 60, 25);
        frame.add(wypozycz3);


        label5 = new JLabel("Pinokio");
        label5.setBounds(120, 120, 120, 25);
        frame.add(label5);

        info5 = new JButton("Info");
        info5.setBounds(120, 140, 60, 25);
        frame.add(info5);

        wypozycz5 = new JButton("Rent");
        wypozycz5.setBounds(120, 170, 60, 25);
        frame.add(wypozycz5);



        label6 = new JLabel("Jumanji");
        label6.setBounds(210, 120, 80, 25);
        frame.add(label6);

        info6 = new JButton("Info");
        info6.setBounds(210, 140, 60, 25);
        frame.add(info6);

        wypozycz6 = new JButton("Rent");
        wypozycz6.setBounds(210, 170, 60, 25);
        frame.add(wypozycz6);

        leave = new JButton("Cofnij");
        leave.setBounds(85,220,120,25);
        frame.add(leave);


        frame.setVisible(true);

        ActionListener a = new BibliotekaDzieci.ClickListener1();
        info1.addActionListener(a);


        ActionListener c = new BibliotekaDzieci.ClickListener3();
        info3.addActionListener(c);

        ActionListener e = new BibliotekaDzieci.ClickListener5();
        info5.addActionListener(e);

        ActionListener f = new BibliotekaDzieci.ClickListener6();
        info6.addActionListener(f);

        ActionListener g = new BibliotekaDzieci.ClickListener7();
        wypozycz1.addActionListener(g);

        ActionListener i = new BibliotekaDzieci.ClickListener9();
        wypozycz3.addActionListener(i);

        ActionListener k = new BibliotekaDzieci.ClickListener11();
        wypozycz5.addActionListener(k);

        ActionListener l = new BibliotekaDzieci.ClickListener12();
        wypozycz6.addActionListener(l);

        ActionListener leaves = new BibliotekaDzieci.ClickListener13();
        leave.addActionListener(leaves);
    }
    public class ClickListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {frame.dispose();
            info = Main.movies.get(0).toString();
            Informator informator = new Informator();
        }
    }
    public class ClickListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {frame.dispose();
            info = Main.movies.get(1).toString();
            Informator informator = new Informator();
        }
    }
    public class ClickListener3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {frame.dispose();
            info = Main.movies.get(2).toString();
            Informator informator = new Informator();
        }
    }
    public class ClickListener4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {frame.dispose();
            info = Main.movies.get(3).toString();
            Informator informator = new Informator();
        }
    }
    public class ClickListener5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {frame.dispose();
            info = Main.movies.get(4).toString();
            Informator informator = new Informator();
        }
    }
    public class ClickListener6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {frame.dispose();
            info = Main.movies.get(5).toString();
            Informator informator = new Informator();
        }
    }
    public class ClickListener7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Film movie = Main.movies.get(0);
            if (!Wypozyczone.lista.contains(movie)) {
                Wypozyczone.lista.add(movie);
                JOptionPane.showMessageDialog(frame, "Film wypozyczono");
            }
            else{JOptionPane.showMessageDialog(frame, "Wypozyczyles juz ten film");}
        }
    }

    public class ClickListener9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Film movie = Main.movies.get(2);
            if (!Wypozyczone.lista.contains(movie)) {
                Wypozyczone.lista.add(movie);
                JOptionPane.showMessageDialog(frame, "Film wypozyczono");
            }
            else{JOptionPane.showMessageDialog(frame, "Wypozyczyles juz ten film");}
        }
    }
    public class ClickListener11 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Film movie = Main.movies.get(4);
            if (!Wypozyczone.lista.contains(movie)) {
                Wypozyczone.lista.add(movie);
                JOptionPane.showMessageDialog(frame, "Film wypozyczono");
            }
            else{JOptionPane.showMessageDialog(frame, "Wypozyczyles juz ten film");}
        }
    }
    public class ClickListener12 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Film movie = Main.movies.get(5);
            if (!Wypozyczone.lista.contains(movie)) {
                Wypozyczone.lista.add(movie);
                JOptionPane.showMessageDialog(frame, "Film wypozyczono");
            }
            else{JOptionPane.showMessageDialog(frame, "Wypozyczyles juz ten film");}
        }
    }
    public class ClickListener13 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            MainPage MainPage = new MainPage();
        }
    }
}
