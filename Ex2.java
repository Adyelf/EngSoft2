package exerciciosWillian;

import java.lang.reflect.Array;

public class Ex2 {
//2) Escreva um m�todo que receba por par�metro um array de inteiros e retorne todos os n�meros pares armazenados no array.
	public static void main(String[] args) {
		
		int[] x = {1,2,3,4};
		
		for (int i =0 ; i < Array.getLength(x); i++) {
			
			if ( x[i] %2==0){
	
			System.out.println("A posi��o  "+(i+1)+" da lista tem o valor de: "+x[i] + " e � par");
			}
		}
	}
}
