package javaproject;

import java.util.Scanner;

public class Primerproject {
	
	public static void main(String[] args) {
		
		//CREAR MENU DE BUFET
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("---Bienvenidos a la fonda de Fabian");
		System.out.println("¿Que desea orden?");
		System.out.println(" tenemos: \n1.- zopes $45 \n2.- tacos Fritos $50 \n3.- quesadillas $35 \n4.- empanadas 5x $40"); //IMPRIMIMOS LAS OPCIONES DEL MENU
		int opcionComida = teclado.nextInt(); //INTRODUCIMOS POR TECLADO QUE OPCION QUEREMOS
		
		switch(opcionComida) {
		
		case 1 : System.out.println("Disfrute sus zopes"); //PONEMOS CADA UNO DE LOS PASOS ELEGIDOS
        System.out.println();
		break;
		case 2 : System.out.println("Disfrute sus tacos fritos");
        System.out.println();
		break;
		case 3 : System.out.println("Disfrute sus quesadillas");
        System.out.println();
		break;
		case 4 : System.out.println("Disfrute sus empanadas");
        System.out.println();
		break;
		
		
		
		
		}
		
		System.out.println();
		System.out.println("¿Que deseas como Bebida?");
        System.out.println();
		System.out.println("tenemos: \n1.- agua de jamaica $15 \n2.- horchata $15 \n3.- Limonada $15 \n4.- limonada con chia $18"); //IMPRIMIMOS LAS OPCIONES DEL MENU
		int opcionBebida = teclado.nextInt(); //INTRODUCIMOS POR TECLADO QUE OPCION QUEREMOS
		
        switch(opcionBebida) {
		
		case 1 : System.out.println("Disfrute su Jamaica"); //PONEMOS CADA UNO DE LOS PASOS ELEGIDOS
        System.out.println();
		break;
		case 2 : System.out.println("Disfrute su Horchata");
        System.out.println();
		break;
		case 3 : System.out.println("Disfrute su Limonada");
        System.out.println();
		break;
		case 4 : System.out.println("Disfrute su Limonada con chia");
        System.out.println();
		break;
		
		
		
		}
		
        
        
        System.out.println("Enseguida le entramos su orden");
        
  
	}

	/*CRUZ GUILLEN EDGAR FABIAN
	 */
}
