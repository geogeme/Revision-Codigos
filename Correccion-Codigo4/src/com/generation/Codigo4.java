package com.generation;

import java.util.Scanner; //Se importó Scanner

public class Codigo4 {

	//Faltaba poner método
    public static void main(String[] args) {
 
		Scanner s = new Scanner(System.in); // se agrega System.in para recibir la entrada
        
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();
        
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //Decía jugador 1 en vez de 2
        //Se elimina linea ya que no es necesario crear una segunda instancia de Scanner para la entrada del jugador 2
        String j2 = s.nextLine();
        
        if (j1.equals(j2)) { //Se corrige operador de igualdad == por equals()
            System.out.println("Empate");
        } else {
            int g = 2;
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break;// se agrega break para salir del switch
                    
                case "papel":
                    if (j2.equals("piedra")) { //Se  cambia ooperador por equals()
                        g = 1;
                    }
                    break; //se agrega break
                    
                case "tijeras": //cadena tijera a tijeras
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break; 
                default:
                    break; //Se agrega break
            }
            System.out.println("Gana el jugador " + g);
        }
    }
}
