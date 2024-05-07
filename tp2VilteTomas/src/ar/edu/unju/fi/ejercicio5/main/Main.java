package ar.edu.unju.fi.ejercicio5.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.Producto;
import ar.edu.unju.fi.ejercicio1.model.Producto.categoriaProducto;
import ar.edu.unju.fi.ejercicio1.model.Producto.origenFabricacion;

public class Main {
	private static Scanner sc;
	private static List<Producto> productos;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		productos = new ArrayList<>();
		int opcion = 0;
		do {
			opcion = menu();
			switch (opcion) {
				case 1: crearProducto(); break;
				case 2: mostrar(); break;
				case 3:System.out.println("Fin del programa");
				break;
			default:System.out.println("Opcion incorreta");
			}
		} while (opcion != 3);

	}
	
	public static int menu() {
		int respuesta;
			System.out.println("\n1_ Mostrar Producto: ");
			System.out.println("\n2_ Realizar Compra: ");
			System.out.println("\n3_ Salir: ");
			respuesta = validar("Elija una opcion: ");
		return respuesta;
	}
		
	public static int validar(String mensaje) {
		int numero=0;
		while(true) {
			try {
				System.out.println("\n"+mensaje);
				numero = sc.nextInt();
				if(numero >= 0) {
					return  numero;
				}
			}catch(Exception e) {
				System.out.println("Error valor ingresado incorrecto");
				sc.nextLine();
			}
		}	

	}
	
	public static void crearProducto() {
		if(productos.isEmpty()) {
			productos.add(new Producto(1,"Heladera",100,categoriaProducto.ELECTROHOGAR,origenFabricacion.ARGENTINA),true);
			productos.add(new Producto(2,"Celular xiaomi",101,categoriaProducto.TELEFONIA,origenFabricacion.ARGENTINA),true);
			productos.add(new Producto(3,"Cocina",200,categoriaProducto.ELECTROHOGAR,origenFabricacion.BRASIL),false);
			productos.add(new Producto(4,"Taladro",121,categoriaProducto.HERRAMIENTAS,origenFabricacion.URUGUAY),true);
			productos.add(new Producto(5,"Pancla",12,categoriaProducto.ELECTROHOGAR,origenFabricacion.CHILE),true);
			productos.add(new Producto(6,"Tablet",89,categoriaProducto.INFORMATICA,origenFabricacion.BRASIL),true);
			productos.add(new Producto(7,"Maquina de Coser",349,categoriaProducto.HERRAMIENTAS,origenFabricacion.ARGENTINA),false);
			productos.add(new Producto(8,"Pava electrica",32,categoriaProducto.ELECTROHOGAR,origenFabricacion.URUGUAY),true);
			productos.add(new Producto(9,"Lavaropa",11,categoriaProducto.ELECTROHOGAR,origenFabricacion.CHILE),false);
			productos.add(new Producto(10,"Celular samsung",231,categoriaProducto.TELEFONIA,origenFabricacion.ARGENTINA),true);
			productos.add(new Producto(11,"Aspiradora",999,categoriaProducto.HERRAMIENTAS,origenFabricacion.URUGUAY),false);
			productos.add(new Producto(12,"Tostadora",786,categoriaProducto.ELECTROHOGAR,origenFabricacion.URUGUAY),false);
			productos.add(new Producto(13,"Licuadora",1105,categoriaProducto.ELECTROHOGAR,origenFabricacion.CHILE),true);
			productos.add(new Producto(14,"Exprimidor electrico",1200,categoriaProducto.ELECTROHOGAR,origenFabricacion.ARGENTINA),true);
			productos.add(new Producto(15,"Cafetera Electrica",56743,categoriaProducto.ELECTROHOGAR,origenFabricacion.BRASIL),false);
		}
		
	}
	
	public static int menuPago() {
		int respuesta;
			System.out.println("##### Categoria #####");
			System.out.println("1_ Pago Efectivo");
			System.out.println("2_ pago Tarjeta");
			respuesta = validar("Elija una opcion: ");
		return respuesta;
	}
	
	public static void mostrar() {
		System.out.println("##### Lista de Productos #####");
		productos.forEach(p->System.out.println(p));
	}
	
	
	
}
