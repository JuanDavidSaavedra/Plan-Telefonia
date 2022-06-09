package modelo;
public class PlanTelefonia 
{
    //--------------
    //Atributos
    //--------------
    private long numeroCelular;
    private int cantidadMinutos;
    private int costoMinutos;
    private String operador;
    private double costoPlan;

    //--------------
    //Metodos
    //--------------

    //Constructor por defecto
    public PlanTelefonia()
    {
        numeroCelular = 1;
        cantidadMinutos = 1;
        costoMinutos =1;
        operador = "";
    }

    //Contructor Común u Ordinario 
    public PlanTelefonia(long num, int min, int costo, String op)
    {
        this.numeroCelular = num;
        this.cantidadMinutos = min;
        this.costoMinutos= costo;
        this.operador= op;
    }

    //Constructor de copia
    public PlanTelefonia(PlanTelefonia pt)
    {
        numeroCelular = pt.numeroCelular;
        cantidadMinutos = pt.cantidadMinutos;
        costoMinutos = pt.costoMinutos;
        operador = pt.operador;
    }

    // Metodos de acceso
    public long getNumeroCelular()
    {
        return numeroCelular;
    }
    public void setNumeroCelular(long numeroCelular)
    {
        this.numeroCelular= numeroCelular;
    }
    public int getCantidadMinutos()
    {
        return cantidadMinutos;
    }
    public void setCantidadMinutos(int cantidadMinutos)
    {
        this.cantidadMinutos= cantidadMinutos;
    }
    public int getCostoMinutos()
    {
        return costoMinutos;
    }
    public void setCostoMinutos(int costoMinutos)
    {
        this.costoMinutos= costoMinutos;
    }
    public String getOperador()
    {
        return operador;
    }
    public void setOperador(String operador)
    {
        this.operador= operador;
    }
    public String toString()
    {
        return "Número de celular: " + numeroCelular + "\nCantidad de minutos: " + cantidadMinutos + "\nCosto del minuto: " + costoMinutos + "\nOperador: " + operador + "\nCosto del plan: " +  calcularCostoPlan(); 
    }

    //saber el costo del plan
    public Double calcularCostoPlan()
    {
        
        double x= costoMinutos*cantidadMinutos;
        if (operador.equals("Movilujo"))
        {
          x = x - x*0.5;
        }
        return x;

    }
}
