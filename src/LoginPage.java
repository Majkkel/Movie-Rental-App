import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class LoginPage extends JFrame {

    private static JLabel loginLabel;
    private static JTextField loginText;
    private static JLabel passwordLabel;
    private static JTextField passwordText;
    private static JButton loginButton;
    private static JButton registerButton;


    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    LoginPage() {
        try {
            new FileWriter("DATA.TXT", false).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);

        loginLabel = new JLabel("Login:");
        loginLabel.setBounds(30, 20, 80, 25);
        frame.add(loginLabel);

        loginText = new JTextField(20);
        loginText.setBounds(80, 20, 165, 25);
        frame.add(loginText);

        passwordLabel = new JLabel("Hasło:");
        passwordLabel.setBounds(30, 50, 80, 25);
        frame.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(80, 50, 165, 25);
        frame.add(passwordText);

        loginButton = new JButton("Zaloguj się");
        loginButton.setBounds(90, 100, 120, 30);
        frame.add(loginButton);

        registerButton = new JButton("Zarejestruj się");
        registerButton.setBounds(90, 150, 120, 30);
        frame.add(registerButton);

        ActionListener loginListener = new LoginPage.Loging();
        ActionListener registerListener = new LoginPage.Registering();

        loginButton.addActionListener(loginListener);
        registerButton.addActionListener(registerListener);
    }


    public class Loging implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = loginText.getText();
            String password = passwordText.getText();

            boolean logowanko = false;
            for (User user : Main.users) {
                if(user == null) continue;
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    logowanko = true;
                    break;
                }
            }

            if (logowanko) {
                JOptionPane.showMessageDialog(frame, "Logowanie powiodło się!");
                frame.dispose();
                MainPage MainPage = new MainPage();

            } else {
                JOptionPane.showMessageDialog(frame, "Logowanie nie powiodło się!");
            }
        }
    }


        public class Registering implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                RegisterPage registerPage = new RegisterPage();
            }
    }
}

