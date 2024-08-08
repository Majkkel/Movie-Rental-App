import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class RegisterPage extends JFrame{

    private static JLabel loginLabel;
    private static JTextField loginText;
    private static JLabel passwordLabel;
    private static JTextField passwordText;
    private static JButton registerButton;
    private static JLabel ageLabel;
    private static JTextField ageText;
    private File userData;

    JFrame frame = new JFrame();
    RegisterPage(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);

        loginLabel = new JLabel("Login:");
        loginLabel.setBounds(10, 20, 80, 25);
        frame.add(loginLabel);

        loginText = new JTextField(20);
        loginText.setBounds(100, 20, 165, 25);
        frame.add(loginText);

        passwordLabel = new JLabel("Haslo:");
        passwordLabel.setBounds(10, 50, 80, 25);
        frame.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        frame.add(passwordText);

        ageLabel = new JLabel("Rok urodzenia:");
        ageLabel.setBounds(10, 80, 120, 25);
        frame.add(ageLabel);

        ageText = new JTextField();
        ageText.setBounds(100, 80, 165, 25);
        frame.add(ageText);

        registerButton = new JButton("Zarejestruj się");
        registerButton.setBounds(100, 120, 120, 25);
        frame.add(registerButton);

        ActionListener registerListener = new RegisterPage.ClickListener1();
        registerButton.addActionListener(registerListener);
    }

    public class ClickListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String login = loginText.getText();
            String password = passwordText.getText();
            String ageString = ageText.getText();
            int age = Integer.parseInt(ageString);

            Main.users[0] =new User(login, password,age);
            JOptionPane.showMessageDialog(frame, "Zarejestrowano konto");
            frame.dispose();
            LoginPage poRejestracji = new LoginPage();

        }
    }
}

