package ejecutable;

import controlador.Controlador;
import modelo.PlanTelefonia;
import vista.VentanaPrincipal;

public class test
{
    public static void main (String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        PlanTelefonia miPlanTelefonia = new PlanTelefonia(0, 0, 0, "");
        Controlador miControlador = new Controlador(miVentana, miPlanTelefonia);
    }
    
}
