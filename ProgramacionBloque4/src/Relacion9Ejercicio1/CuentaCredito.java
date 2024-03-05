package Relacion9Ejercicio1;

public class CuentaCredito extends Cuenta {
    private double credito;

    public CuentaCredito(String titular) {
        super(titular);
        this.credito = 100; // Crédito inicial por defecto
    }

    public CuentaCredito(double saldo, String titular, double creditoInicial) throws CuentaException {
        super(saldo, titular);
        if (creditoInicial < 0 || creditoInicial > 300) {
            throw new CuentaException("El crédito debe estar entre 0 y 300€.");
        }
        this.credito = creditoInicial;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double nuevoCredito) {
        if (nuevoCredito >= 0 && nuevoCredito <= 300) {
            this.credito = nuevoCredito;
        } else {
            System.out.println("El crédito debe estar entre 0 y 300€.");
        }
    }
    
    public void sacarDinero(double cantidad) throws CuentaException {
        if (getSaldo() + credito >= cantidad) {
            super.realizarReintegro(cantidad);
        } else {
            System.out.println("Saldo insuficiente. Utilizando crédito.");
        }
    }

}
