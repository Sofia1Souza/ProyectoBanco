package service;

import entity.Cliente;

import java.util.Scanner;

public class ClienteService {

 public  Cliente CrearCliente(){

     Scanner leer= new Scanner(System.in);
     Cliente cliente= new Cliente();
     CuentaService objCuentaService= new CuentaService();

     System.out.println("Ingrese su nombre");
     cliente.setNombre(leer.nextLine());
     System.out.println("Ingrese su apellido");
     cliente.setApellido(leer.nextLine());
     System.out.println("Ingrese su dni");
     cliente.setDni(leer.nextLine());

     System.out.println("Ha generado su cuenta correctamente");

     cliente.getCuentas().add(objCuentaService.crearCuenta(cliente));
     System.out.println(cliente.getCuentas());

     return cliente;
 }

}
