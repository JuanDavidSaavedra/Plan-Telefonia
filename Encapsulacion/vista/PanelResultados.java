package vista;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import modelo.PlanTelefonia;


public class PanelResultados extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    private JTextArea taResultado;
    private JScrollPane spResultado;

    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelResultados()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion del area de texto
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20, 560, 210);
        add(spResultado);
       
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Mostrar resultado
    public void mostrarResultado(PlanTelefonia p)
    {
        taResultado.setText(p.toString());
    }

    //Borrar los resultados
    public void borrar()
    {
        taResultado.setText("");
    }
}