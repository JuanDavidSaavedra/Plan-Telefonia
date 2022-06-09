package vista;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton btCalcularPlan;
    public JButton btBorrar;
    public JButton btSalir;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        
        btCalcularPlan = new JButton("Calcular Plan");
        btCalcularPlan.setFont(new Font("Arial", BOLD, 12));
        btCalcularPlan.setBounds(100, 20, 120, 30);
        add(btCalcularPlan);
        btCalcularPlan.setActionCommand("CalcularPlan");

        //Crear y agrear boton Borrar
        btBorrar = new JButton("Borrar");
        btBorrar.setFont(new Font("Arial", BOLD, 12));
        btBorrar.setBounds(240, 20, 120, 30);
        this.add(btBorrar);
        btBorrar.setActionCommand("borrar");

        //Crear y agrear boton Salir
        btSalir = new JButton("Salir");
        btSalir.setFont(new Font("Arial", BOLD, 12));
        btSalir.setBounds(380, 20, 120, 30);
        this.add(btSalir);
        btSalir.setActionCommand("salir");
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btCalcularPlan.addActionListener(pAL);
        btBorrar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }
    
    public void activarBotones()
    {
        btCalcularPlan.setEnabled(true);
        btBorrar.setEnabled(true);
        btSalir.setEnabled(true);
    }
}
