
/**
 * Clase CCuenta donde se gestiona la cuenta de un usuario.
 * 
 * @author Adoney Tejera Santana
 * @version 1.0
 * @since 1.0
 */

package cuentas;

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

	
    /**
     * Constructor que inicializa CCenta.
     */
    
    public CCuenta()
    {
    }

    /**
     *Constructor de la clase con parámetros
     * @param nom Nombre del usuario.
     * @param cue Nombre de la cuenta.
     * @param sal Salario en cuenta.
     * @param tipo Tipo de cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    
    /**
     * Muestra el estado de le cuenta
     * @return saldo.
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Ingresa dinero a la cuenta
     * @param cantidad Cantidad a añadir
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira dinero de la cuenta.
     * @param cantidad Cantidad a retirar.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}

//COMENTARIO PARA NO COMENTAR.