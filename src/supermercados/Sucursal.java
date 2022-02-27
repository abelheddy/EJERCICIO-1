/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercados;

/**
 *
 * @author lizz-
 */
public class Sucursal {
    private String nombreSucursal;
    private String direccionSucursal;
    private int numEmpleados;
    private CuentaBancaria cuentaBancaria;
    private Proveedor proveedor;

    public Sucursal(String nombreSucursal, String direccionSucursal, int numEmpleados, CuentaBancaria cuentaBancaria, Proveedor proveedor) {
        this.nombreSucursal = nombreSucursal;
        this.direccionSucursal = direccionSucursal;
        this.numEmpleados = numEmpleados;
        this.cuentaBancaria = cuentaBancaria;
        this.proveedor = proveedor;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDireccionSucursal() {
        return direccionSucursal;
    }

    public void setDireccionSucursal(String direccionSucursal) {
        this.direccionSucursal = direccionSucursal;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
}
