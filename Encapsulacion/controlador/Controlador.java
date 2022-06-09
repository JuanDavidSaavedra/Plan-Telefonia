package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.PlanTelefonia;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private PlanTelefonia model;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal venPrin, PlanTelefonia model)
    {
        this.venPrin = venPrin;
        this.model = model;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("CalcularPlan"))
        {
            model.setOperador((venPrin.miPanelEntradaDatos.getOperador()));
            model.setNumeroCelular(Long.parseLong(venPrin.miPanelEntradaDatos.getNumero()));
            model.setCantidadMinutos(Integer.parseInt(venPrin.miPanelEntradaDatos.getMinutos()));
            model.setCostoMinutos(Integer.parseInt(venPrin.miPanelEntradaDatos.getCosto()));
            model.calcularCostoPlan();
            venPrin.miPanelResultados.mostrarResultado(model);
        }

        if(comando.equals("borrar"))
        {
            this.venPrin.miPanelEntradaDatos.borrar();
            this.venPrin.miPanelResultados.borrar();
        }


        if(comando.equals("salir"))
        {
            System.exit(0);
        }
        
    }
}