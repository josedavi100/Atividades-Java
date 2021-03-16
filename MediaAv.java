
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class MediaAv extends JFrame{
    public static void main(String[] args) {
        MediaAv Media = new MediaAv();
        Media.setVisible(true);
    }

    public MediaAv(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(900, 300, 310, 500);
        setTitle("Media do Aluno");
        
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        ImageIcon img = new ImageIcon("estacio.png");
        JLabel lblimg = new JLabel(img);
        lblimg.setBounds(0, 0, 300, 180);
        contentPane.add(lblimg);
        
        JLabel lblav1 = new JLabel("Av1");
        lblav1.setBounds(40, 200, 50, 20);
        contentPane.add(lblav1);
        JTextField txtav1 = new JTextField();
        txtav1.setBounds(40, 220, 60, 30);
        contentPane.add(txtav1);
        
        JLabel lblav2 = new JLabel("Av2");
        lblav2.setBounds(120, 200, 50, 20);
        contentPane.add(lblav2);
        JTextField txtav2 = new JTextField();
        txtav2.setBounds(120, 220, 60, 30);
        contentPane.add(txtav2);
        
        JLabel lblav3 = new JLabel("Av3");
        lblav3.setBounds(200, 200, 50, 20);
        contentPane.add(lblav3);
        JTextField txtav3 = new JTextField();
        txtav3.setBounds(200, 220, 60, 30);
        contentPane.add(txtav3);
        
        JButton btnMedia = new JButton("Calcular");
        btnMedia.setBounds(40, 265, 220, 30);
        contentPane.add(btnMedia);
        
        JLabel lblresul = new JLabel();
        lblresul.setBounds(40, 300, 220, 30);
        contentPane.add(lblresul);
        
        btnMedia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                float av1 = Float.parseFloat(txtav1.getText());
                float av2 = Float.parseFloat(txtav2.getText());
                float av3 = Float.parseFloat(txtav3.getText());
                float resultado = (av1 + av2 + av3)/3;
                
                DecimalFormat df = new DecimalFormat("0.##");
                String r = df.format(resultado);
                
                lblresul.setText("Sua nota final foi:  " + r);
            }
        });
        

    }    
}

