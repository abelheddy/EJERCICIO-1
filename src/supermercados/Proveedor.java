/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercados;

/**
 *
 * @author lizz-
 */
public class Proveedor {
    private String razonSocial;
    private String direccionFiscal;
    private String rfc;

    public Proveedor(String razonSocial, String direccionFiscal, String rfc) {
        this.razonSocial = razonSocial;
        this.direccionFiscal = direccionFiscal;
        this.rfc = rfc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccionFiscal() {
        return direccionFiscal;
    }

    public void setDireccionFiscal(String direccionFiscal) {
        this.direccionFiscal = direccionFiscal;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
}
