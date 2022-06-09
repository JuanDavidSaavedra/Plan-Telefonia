package vista;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    
    //Identificacion, Nombre, Horastrabajadas.
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JLabel lbNum;
    private JLabel lbMin;
    private JLabel lbCosto;
    private JLabel lbOp;
    private JTextField tfNum;
    private JTextField tfMin;
    private JTextField tfCosto;
    private JComboBox cbOperador;
    private String[] operadores = {"Movilujo", "Movistar", "Tigo", "Claro"};
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("Telefono.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,220,176);
        add(lbImagen);
        
        //Creación y adición de etiquetas nombre, horas trabajadas, fecha de nacimiento y fecha de ingreso
        lbNum = new JLabel("Número de celular = ");
        lbNum.setBounds(230,40,200,30);
        add(lbNum);
        
        lbMin = new JLabel("Cantidad de minutos = ");
        lbMin.setBounds(230,70,200,30);
        add(lbMin);
        
        lbCosto = new JLabel("Costo del minuto = ");
        lbCosto.setBounds(230,100,200,30);
        add(lbCosto);

        lbOp = new JLabel("Operador = ");
        lbOp.setBounds(230,130,200,30);
        add(lbOp);
        
        
        //Creación y adición de campos de texto
        tfNum = new JTextField();
        tfNum.setBounds(400, 40, 120, 30);
        add(tfNum);
        
        tfMin = new JTextField();
        tfMin.setBounds(400, 70, 120, 30);
        add(tfMin);
        
        tfCosto = new JTextField();
        tfCosto.setBounds(400, 100, 120, 30);
        add(tfCosto);

        cbOperador = new JComboBox();
        for(int i=0; i<operadores.length;i++)
        {
            cbOperador.addItem(operadores[i]);
        }
        cbOperador.setBounds(400,130,120,30);
        this.add(cbOperador);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNumero()
    {
        return tfNum.getText();
    }
    
    public String getMinutos()
    {
        return tfMin.getText();
    }
    
    public String getCosto()
    {
        return tfCosto.getText();
    }

    public String getOperador()
    {
        return (String) cbOperador.getSelectedItem();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfNum.setText("");
        tfMin.setText("");
        tfCosto.setText("");
        cbOperador.setSelectedItem("");
    }
}
