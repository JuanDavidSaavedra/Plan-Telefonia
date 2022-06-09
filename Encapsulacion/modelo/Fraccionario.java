package modelo;
public class Fraccionario
{
    //--------------------
    //Atributos
    //--------------------
    private int numerador;
    private int denominador;

    //--------------------
    //Métodos
    //--------------------

    //Constructor por defecto
    public Fraccionario()
    {
        numerador = 1;
        denominador = 1;
    }

    //Constructor común u ordinario
    public Fraccionario(int num, int den)
    {
        this.numerador = num;
        this.denominador = den;
    }

    //Constructor de copia
    public Fraccionario(Fraccionario f)
    {
        numerador = f.getNumerador();
        denominador = f.getDenominador();
    }

    //Métodos de acceso
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    
    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public String toString()
    {
        return numerador + "/" + denominador;
    }

    //Método ejecutable
    public static void main(String[] args)
    {
        Fraccionario f1 = new Fraccionario();
        System.out.println("Objeto 1: " + f1);
        Fraccionario f2 = new Fraccionario(3,7);
        System.out.println("Objeto 2: " + f2);
        Fraccionario f3 = new Fraccionario(f2);
        System.out.println("Objeto 2: " + f3);
    }
}