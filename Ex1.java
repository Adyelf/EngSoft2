package exerciciosWillian;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
///1) Escreva um m�todo que receba por par�metro um array de inteiros e retorne o n�mero armazenado na primeira posi��o do array. 
	public static void main(String[] args) {
		
	int opcao=7;
	
	int[] x = {1,2,3,4};
	
	do {
		System.out.println("Bem vindo ao programa de mostrar elemento de uma lista");
		System.out.println("1-Ver n�mero da lista");
		System.out.println("0-Sair");
		System.out.println("");
		System.out.println("Digite sua op��o: ");
		Scanner opcaoDigitada = new Scanner(System.in);
		opcao= opcaoDigitada.nextInt();
	
	if (opcao==1) {
		

		
	System.out.println("A lista � : "+ Arrays.toString(x));
	//
	// ou ent�o
	//
	for (int i =0 ; i < Array.getLength(x); i++) {
		System.out.println("A posi��o "+(i+1)+" � igual a: "+x[i]);
	}
		
	
	
	System.out.println("Digite a posi��o que quer ver: ");
	Scanner digitaAi = new Scanner(System.in);
	 
	int y = digitaAi.nextInt();
	
	
	
	if (y==1) {
		System.out.println(x[0]);
	} else {
		if(y==2){
			System.out.println(x[1]);
		} else {
			if (y==3) {
				System.out.println(x[2]);
			} else {
				if (y==4) {
					System.out.println(x[3]);
				}
			}
		}
	}	
	}
	
	if (opcao==0) {
		System.out.println("Obrigado por usar nosso programa");
		break;
	}
	
	}while(opcao!=0);
	
	
	}
}
