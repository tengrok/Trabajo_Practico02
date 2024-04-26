package ar.edu.unju.fi.ejercicio1.main;

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
				case 3: modificar(); break;
				case 4:System.out.println("Fin del programa");
				break;
			default:System.out.println("Opcion incorreta");
			}
		} while (opcion != 4);

	}
	
	public static int menu() {
		int respuesta;
			System.out.println("\n1_ Crear Producto: ");
			System.out.println("2_ Motrar Producto: ");
			System.out.println("3_ Modificar Producto: ");
			System.out.println("4_ Salir: ");
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
		
	public static double validarDouble(String mensaje) {
		float numero=0;
		while(true) {
			try {
				System.out.println("\n"+mensaje);
				numero = sc.nextFloat();
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
		sc.nextLine();
		categoriaProducto cat = null;
		origenFabricacion org = null;
		int codigo = validar("Ingrese el codigo del producto: ");
		System.out.println("Ingrese la descripcion del producto: ");
		String descripcion = sc.next();
		double precio = validar("Ingrese el precio unitario: ");
		int numero = menuCategoria();
		switch (numero) {
			case 1: cat = categoriaProducto.TELEFONIA; break;
			case 2: cat = categoriaProducto.INFORMATICA; break;
			case 3: cat = categoriaProducto.ELECTROHOGAR; break;
			case 4: cat = categoriaProducto.HERRAMIENTAS; break;
			default: System.out.println("Opcion incorrecta"); break;
		}
		int numero2 = menuOrigen();
		switch (numero2) {
		case 1: org = origenFabricacion.ARGENTINA; break;
		case 2: org = origenFabricacion.CHILE; break;
		case 3: org = origenFabricacion.BRASIL; break;
		case 4: org = origenFabricacion.URUGUAY; break;
		default: System.out.println("Opcion incorrecta"); break;
	}
		productos.add(new Producto(codigo,descripcion,precio,cat,org));
	}
	
	public static int menuCategoria() {
		int respuesta;
			System.out.println("##### Categoria #####");
			System.out.println("1_ Telefonia");
			System.out.println("2_ Informatica");
			System.out.println("3_ Electro hogar");
			System.out.println("4_ Herramientas");
			respuesta = validar("Elija una opcion: ");
		return respuesta;
	}
	
	public static int menuOrigen() {
		int respuesta;
			System.out.println("##### Origen de Fabricacion #####");
			System.out.println("1_ Argentina");
			System.out.println("2_ Chile");
			System.out.println("3_ Brasil");
			System.out.println("4_ Uruguay");
			respuesta = validar("Elija una opcion: ");
		return respuesta;
	}
	
	public static void mostrar() {
		System.out.println("##### Lista de Productos #####");
		productos.forEach(p->System.out.println(p));
	}
	
	public static void modificar() {
		sc.nextLine();
		categoriaProducto cat = null;
		origenFabricacion org = null;
		System.out.println("##### Modificar producto #####");
		int codigo = validar("Ingrese el codigo del producto a modificar: ");
		int encontrado = buscarProducto(codigo);
		if(encontrado != -1) {
			System.out.println("Ingrese nueva descricion: ");
			String descripcion = sc.next();
			double precio = validarDouble("Ingrese su nuevo precio unitario: ");
			int numero = menuCategoria();
			switch (numero) {
				case 1: cat = categoriaProducto.TELEFONIA; break;
				case 2: cat = categoriaProducto.INFORMATICA; break;
				case 3: cat = categoriaProducto.ELECTROHOGAR; break;
				case 4: cat = categoriaProducto.HERRAMIENTAS; break;
				default: System.out.println("Opcion incorrecta"); break;
			}
			int numero2 = menuOrigen();
			switch (numero2) {
			case 1: org = origenFabricacion.ARGENTINA; break;
			case 2: org = origenFabricacion.CHILE; break;
			case 3: org = origenFabricacion.BRASIL; break;
			case 4: org = origenFabricacion.URUGUAY; break;
			default: System.out.println("Opcion incorrecta"); break;
			}
			productos.get(encontrado).setDescripcion(descripcion);
			productos.get(encontrado).setPrecioUnitario(precio);
			productos.get(encontrado).setCategoria(cat);
			productos.get(encontrado).setOrigen(org);
		}else {
			System.out.println("El codigo ingresado no existe");
		}
	}
	
	public static int buscarProducto(int numero) {
		int i = 0;
		while(i < productos.size()) {
			if(productos.get(i).getCodigo() == numero) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
}
