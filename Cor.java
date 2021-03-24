
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Cor extends JFrame{
    
    private final String colorNames[] = { "Yellow", "Blue", "Cyan", "Orange", "Green"};
    private final Color colors[] = { Color.YELLOW, Color.BLUE, Color.CYAN, Color.ORANGE, Color.GREEN};
    
    public Cor(){
        super("Cor");
        
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);
   
        
        setLayout(new FlowLayout()); //Define um layout
        JList NamesColors = new JList(colorNames); //Cria uma lista com os nomes, definidos pelo array de strings "colorNames".
        NamesColors.setVisibleRowCount(5); //Exibe 5 linhas dentro da lista criada
        NamesColors.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //Não permite selecionar mais de uma opção
        add(new JScrollPane(NamesColors)); //Adiciona um JScrollPane que contém um JList ao Frame
        
        //Adiciona um ação ao JList
        NamesColors.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                getContentPane().setBackground(colors[NamesColors.getSelectedIndex()]); //Mudar a Cor do Pane, de acordo com a cor que for selecionada
            }
        });
        
        JLabel lbl = new JLabel("A cor escolhida foi");
        lbl.setBounds(0, 50, 20, 20);
        contentPane.add(lbl);
        
    }
    
    public static void main(String[] args) {
        Cor c1 = new Cor();
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setSize(400, 200);
        c1.setVisible(true);
    }
}
