import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Wypozyczone {

    JFrame frame = new JFrame();
    private static JLabel cartLabel;
    private static JButton leave;
    static List<Film> lista = new ArrayList<>();

    Wypozyczone() {
        frame.setSize(600,200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        cartLabel = new JLabel();
        cartLabel.setBounds(0, 0, 800, 100);

        String s = "<html>";

        for(Film film : lista){
            s += film + "<br/> <hr> <br/>";
        }
        cartLabel.setText(s + "</html>");

        frame.add(cartLabel);

        leave = new JButton("Cofnij");
        leave.setBounds(240,130,120,25);
        frame.add(leave);

        ActionListener cofnij = new Wypozyczone.ClickListener1();
        leave.addActionListener(cofnij);

    }
    public class ClickListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            MainPage main = new MainPage();
        }
    }

}