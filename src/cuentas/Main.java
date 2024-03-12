package cuentas;

/**
 * Pagina principal de Cuentas.
 * @author Adoney Tejera Santana
 * @version 1.0
 * @since 1.0
 */

import cuentas.CCuenta;

public class Main {

    public static void main(String[] args) {
        operativa_cuenta("miCuenta", 100);
    }
    
    private static void operativa_cuenta(String nombre, float cantidad) {
        CCuenta cuenta;
        cuenta = new CCuenta(nombre,"1000-2365-85-1230456789",cantidad,0);
        double saldoActual;

        saldoActual = cuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}

//COMENTARIO PARA COMENTAR
