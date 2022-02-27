/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercados;

import java.util.Scanner;

/**
 *
 * @author lizz-
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        CuentaBancaria cuban = new CuentaBancaria("", 0);
        Proveedor pro = new Proveedor("", "", "");
        int opc;
        do {
            System.out.println("Bienvenido al menu de supermercados");
            System.out.println("1. Cuentas bacnarias");
            System.out.println("2. Proveedores");
            System.out.println("3. Sucursales");
            System.out.println("4. Salir");
            System.out.println("porfavor elija una opcion");
            opc = (int) entrada.nextInt();
            switch (opc) {
                case 1:
                    do {
                        System.out.println("Bienbenido al menu de cuenta bancaria");
                        System.out.println("1. Mostrar los valores");
                        System.out.println("2. Modificar los valores");
                        System.out.println("3. Salir");
                        opc = (int) entrada.nextInt();
                        switch (opc) {
                            case 1:
                                System.out.println("Mostrando datos bancarios");
                                System.out.println("1. Clave : "+ cuban.getClave());
                                System.out.println("2. Monto : "+ cuban.getMonto());
                                break;
                            case 2:
                                System.out.println("Porfavor inserte los nuevos datos");
                                System.out.println("1. Clave: ");
                                cuban.setClave(entrada.next());
                                System.out.println("2. Monto: ");
                                cuban.setMonto(entrada.nextInt());
                                break;
                            case 3:
                                System.out.println("Regresando a menu");
                                break;
                            default:
                                System.out.println("opcion invalida");
                        }
                    } while (opc != 3);
                    break;
                case 2:
                    do {
                        System.out.println("Bienbenido al menu de Proveedor");
                        System.out.println("1. Mostrar los valores");
                        System.out.println("2. Modificar los valores");
                        System.out.println("3. Salir");
                        opc = (int) entrada.nextInt();
                        switch (opc) {
                            case 1:
                                System.out.println("Mostrando valores de Proveedor");
                                System.out.println("1. Razon Social : "+pro.getRazonSocial());
                                System.out.println("2. Direccion Fiscal: "+pro.getDireccionFiscal());
                                System.out.println("3. RFC: "+pro.getRfc());
                                break;
                            case 2:
                                System.out.println("Porfavor inserte los nuevos datos");
                                System.out.println("1. Razon Social: ");
                                pro.setRazonSocial(entrada.next());
                                System.out.println("2. Direccion Fiscal: ");
                                pro.setDireccionFiscal(entrada.next());
                                System.out.println("3. RFC: ");
                                pro.setRfc(entrada.next());
                                break;
                            case 3:
                                System.out.println("Regresando a menu");
                                break;
                            default:
                                System.out.println("opcion invalida");
                        }
                    } while (opc != 3);
                    break;
                case 3:
                    do {
                        Sucursal sucu = new Sucursal("", "", 0, cuban, pro);
                        System.out.println("Bienbenido al menu de Sucursal");
                        System.out.println("1. Mostrar los valores");
                        System.out.println("2. Modificar los valores");
                        System.out.println("3. Salir");
                        opc = (int) entrada.nextInt();
                        switch (opc) {
                            case 1:
                                System.out.println("Mostrando datos de SUcursales");
                                System.out.println("1. Nombre de la Sucursal: "+sucu.getNombreSucursal());
                                System.out.println("2. Direccion de la Sucursal: "+sucu.getDireccionSucursal());
                                System.out.println("3. Numero de Empleados: "+sucu.getNumEmpleados());
                                System.out.println("4. Cuenta Bancaria: "+sucu.getCuentaBancaria());
                                System.out.println("5. Proveedor: "+sucu.getProveedor());
                                break;
                            case 2:
                                System.out.println("Profavor inserte los datos");
                                System.out.println("1. Nombre de la Sucursal: ");
                                sucu.setNombreSucursal(entrada.next());
                                System.out.println("2. Direccion de la Sucursal: ");
                                sucu.setDireccionSucursal(entrada.next());
                                System.out.println("3. Numero de Empleados: ");
                                sucu.setNumEmpleados(entrada.nextInt());
                                System.out.println("4. Cuenta Bancaria solo puede modificar en su apartado");
                                System.out.println("5. Proveedor solo puede modificar en su apartado");
                                break;
                            case 3:
                                System.out.println("Regresando a menu");
                                break;
                            default:
                                System.out.println("opcion invalida");
                        }
                    } while (opc != 3);
                    break;
                default:
                    System.out.println("hasta luego");
            }
        } while (opc != 4);
        entrada.close();

    }

}
