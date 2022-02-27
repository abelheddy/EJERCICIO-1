/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercados;

/**
 *
 * @author lizz-
 */
public class CuentaBancaria {
    private String clave;
    private int monto;

    public CuentaBancaria(String clave, int monto) {
        this.clave = clave;
        this.monto = monto;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
}
