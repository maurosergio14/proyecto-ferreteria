package Aplicacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelos.Cliente;
import modelos.Factura;
import modelos.Productos;
import modelos.Proveedor;

public class Aplicacion {
private static final int SALIR=0;
private static final int GESTION_CLIENTES=1;
private static final int GESTION_PROVEEDORES=2;
private static final int GESTION_PRODUCTO=3;
private static final int GESTION_FACTURACION=4;


public static Scanner teclado;
	
	public static void main(String[] args) {
teclado =new Scanner(System.in);
List<Cliente> clientes=new ArrayList<>();
List<Proveedor> proveedores=new ArrayList<>();
List<Productos> productos=new ArrayList<>();
List<Factura> facturas=new ArrayList<>();

int opcion;
do {
	do {
	mostrarMenuPrincipal();
	opcion=capturarNumeroEnteros("Digite la operacion a realizar: ");
	while(opcion<SALIR || opcion>4);
}while(opcion !=SALIR);



	}
	
public static void mostrarMenuPrincipal() {
		System.out.println("*** MENÚ PRINCIPAL***"); 
		System.out.println("1. Gestion Cliente");
		System.out.println("2. Gestion Proveedores");
		System.out.println("3. Gestion Productos");
		System.out.println("4. Gestion Facturacion");
		System.out.println("0. Salir");
	}

public static void mostrarSubmenu(String tipoMenu) {
	System.out.printf("*** Menú Gestion %s***\n",tipoMenu); 
	System.out.println("1. Crear");
	System.out.println("2. Buscar");
	System.out.println("3. Actualizar");
	System.out.println("4. Eliminar");
	System.out.println("0. Salir");
}


public static void mostrarSubmenuFacturacion() {
	System.out.println("*** Menú Gestion Facturacion ***"); 
	System.out.println("1. Crear");
	System.out.println("2. Buscar");
	System.out.println("0. Salir");
}


	
public static String capturarCadenaCaracteres(String mensaje) {
	String resultado;
	while(true) {
		resultado=teclado.nextLine().strip(); //remueve los espacios
		if(!resultado.isEmpty()) {
			return resultado;
		}
		System.out.println("Especifique un valor concreto");
	}
}
	
public static int capturarNumeroEnteros(String mensaje) {
	while(true) {
		try {
			System.out.printf("%s: ",mensaje);
			return Integer.parseInt(teclado.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Digite un numero entero");
		}
	}
}
public static double capturarNumeroReal(String mensaje) {
	while(true) {
		try {
			System.out.printf("%s: ",mensaje);
			return Double.parseDouble(teclado.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Digite un numero real");
		}
	}
}



}
