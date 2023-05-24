package exercicios.entrega;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int tabuada;
		System.out.println("Escolha um número de 1 a 10: ");
		tabuada = leia.nextInt();	
		
	
		for(int contador = 0; contador <= 10; contador++) {
		int multiplicator = tabuada * contador;
		
		System.out.print(tabuada + " x " + contador + " = " + multiplicator);
		System.out.println(" ");
				
			}
		}
	}