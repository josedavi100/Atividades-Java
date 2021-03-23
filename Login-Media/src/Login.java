
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Login extends JFrame{
    public static void main(String[] args){
        Login L1 = new Login();
        L1.setVisible(true);
    }
    public Login(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(830, 360, 250, 250);
        setTitle("Autenticar");
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        
        JLabel lblUser = new JLabel("Login");
        lblUser.setBounds(60, 25, 104, 16);
        contentPane.add(lblUser);
        
        JTextField txtUser = new JTextField();
        txtUser.setBounds(60, 50, 116, 22);
        contentPane.add(txtUser);
        
        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setBounds(60, 75, 104, 16);
        contentPane.add(lblSenha);
        
        JTextField txtSenha = new JTextField();
        txtSenha.setBounds(60, 100, 116, 22);
        contentPane.add(txtSenha);
        
        JButton btnLogin = new JButton("Entrar");
        btnLogin.setBounds(60, 135, 116, 25);
        contentPane.add(btnLogin);
        
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               String User = txtUser.getText();
               String Senha = txtSenha.getText();

               if(User.equals("jose") && Senha.equals("12345")){
                   JOptionPane.showMessageDialog(null, "Usuário Autenticado com Sucesso: " + User);
                   int sair = JOptionPane.YES_NO_OPTION;
                   int resposta = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Autenticar", sair);
                  
                   if(resposta == 0){
                       System.exit(0);
                   }
               }else{
                   JOptionPane.showMessageDialog(null, "Senha ou Usuário Invalido!!!");
               }
            }
        });
        
    }

}
