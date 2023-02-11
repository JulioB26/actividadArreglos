package Package1;

import java.util.Scanner;

public class Main {
	
	static void mostrarArreglos(int arrayEntero[], String arrayNombres[]) {
		int j=1;
		int k=1;
		for(int i=0;i<arrayEntero.length;i++) {
			
			System.out.println(j+".- "+arrayEntero[1]);
			j++;
		}
		
		for(int i=0;i<arrayNombres.length;i++) {
			System.out.println(k+".- "+arrayEntero[1]);
			
		}
		
	static void buscarValorArregloEnt(int arrayEntero[], int valor) {
		
		int j=0;
		
		for(int i=0;i<arrayEntero.length;i++) {
			
			if(arrayEntero[i]==valor) {
				j = i;
				}	
			}
		
		System.out.println("El valor que busca se encuentra en la posición: " + j + "y es " + arrayEntero[j]);
	}
	
	static void buscarValorArregloString(String arrayNombres[], String valor) {
		
		int j=0;
		
		for(int i=0;i<arrayNombres.length;i++) {
			
			if(arrayNombres[i]==valor) {
				j = i;
				}	
			}
		
		System.out.println("El valor que busca se encuentra en la posición: " + j + "y es " + arrayNombres[j]);
	}
	
	static void ReemplazarValorArregloEnt(int arrayEntero[], int valor) {
		
		int j=0;
		
		for(int i=0;i<arrayEntero.length;i++) {
			
			if(arrayEntero[i]==valor) {
				j = i;
				}	
			}
		
		for(int i=j;i<arrayEntero.length;i++) {
			int temp = i;
			if(temp==arrayEntero.length) {
				arrayEntero[i]=0;
			}else {
			arrayEntero[i]=arrayEntero[i+1];
			}
		}	
		
	}	
	
	static void ReemplazarValorArregloString(String arrayNombres[], String valor) {
		
		int j=0;
		
		for(int i=0;i<arrayNombres.length;i++) {
			
			if(arrayNombres[i]==valor) {
				j = i;
				}	
			}
		for(int i=j;i<arrayNombres.length;i++) {
			int temp = i;
			if(temp==arrayNombres.length) {
				arrayNombres[i]="Sin datos";
			}else {
				arrayNombres[i]=arrayNombres[i+1];
			}
		}
		
	}
	
	
	public static void main(String[]args) {
		
		int[] numEnteros = new int[15];
		String[] nombres = new String[20];
		
		numEnteros[9]=5;
		nombres[0]="Francisco";
		
		mostrarArreglos(numEnteros,nombres);
		
	
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Ingrese el valor a buscar y reemplazr en el arreglo de enteros:");
		int valorEnt = Integer.parseInt(entradas.nextLine());
		
		System.out.println("Ingrese el nombre a buscar y reemplazr en el arreglo de enteros:");
		String valorNombres = entradas.nextLine();
		
		buscarValorArregloEnt(numEnteros,valorEnt);
		ReemplazarValorArregloEnt(numEnteros,valorEnt);
		
		buscarValorArregloString(nombres,valorNombres);
		ReemplazarValorArregloString(nombres,valorNombres);
		
		while(true) {
			
		System.out.println("¿Qué figura desea crear: ");
		System.out.println("1.-Cuadrado");
		System.out.println("2.-Circulo");
		System.out.println("3.-Salir del menu");

		int figura = Integer.parseInt(entradas.nextLine());
		
		switch(figura) {
		
		case 1:
			
			System.out.println("¿Cuanto mide el lado de su figura?");
			String ladoC = entradas.nextLine();
			double ladoC1 = Double.parseDouble(ladoC);
			Cuadrado unoCu = new Cuadrado(ladoC1);
			
			System.out.println("¿Que desea calcular");
			System.out.println("1.-Perimetro");
			System.out.println("2.-Area");
			System.out.println("3.-Diagonal");
			
			int respuestaCu = entradas.nextInt();
			
			switch(respuestaCu) {
				
			case 1:
				System.out.println("Perímetro es = " + unoCu.calculaPerimetro());
				break;
			
			case 2:
				System.out.println("Área es = " + unoCu.calculaArea());
				break;
				
			case 3:
				System.out.println("Diagonal es = " + unoCu.calculaDiagonal());
				break;
			
			
			default:
				System.out.println("Por favor seleccione una operación :)");
				break;
			}
			
			break;
			
		case 2:
			
			System.out.println("¿Cuanto mide el radio de su figura?");
			String radioC = entradas.nextLine();
			double radioC1 = Double.parseDouble(radioC);
			Circulo[] unoCi = new Circulo[100];
			
			for(int i=0;i<1;i++) {
				
			unoCi[i] = new Circulo(radioC1);
			
			System.out.println("¿Que desea calcular");
			System.out.println("1.-Perimetro");
			System.out.println("2.-Area");
			
			int respuestaCi = entradas.nextInt();
			
			switch(respuestaCi) {
			
			case 1:	
				System.out.println("Perímetro es = " + unoCi[i].calculaPerimetroC());
				break;
				
			case 2:
				System.out.println("Área es = " + unoCi[i].calculaAreaC());
				break;
				
			default:
				System.out.println("Por favor seleccione una operación :)");
				break;
			}
		}
			
			break;
			
		case 3:
			
			System.out.println("Saliendo del menu...");
			System.exit(0);
			break;
			
			
		}
	}
}
}
