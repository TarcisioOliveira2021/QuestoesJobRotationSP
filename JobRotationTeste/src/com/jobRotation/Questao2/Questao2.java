package com.jobRotation.Questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		iniciar();
	}
	
	//Inicia o programa
	public static void iniciar() {
		System.out.println("Informe um numero que deseja verificar: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		// int numero = 2;
		// verifyPertence(numero)
		sc.close();
		verifiqPertence(numero);
	}
	
	//50 numeros da sequencia de fibonnaci.
	//Método que construi um vetor com a sequência fibonnaci.
	public static ArrayList<Integer> fiboList(){
		ArrayList<Integer> fibonnaciSequence = new ArrayList<>();
		int atual = 0;
		int anterior = 0;
		for (int i = 0; i < 50;  i++) {
			 if (i==1) {
				atual = 1;
				anterior = 0;
			}else {
				atual += anterior;
				anterior = atual - anterior;
			}
			fibonnaciSequence.add(atual);
		}
		return(fibonnaciSequence);
	}
	
	//Método que compara.
	//verificar se esse numero pertence a sequencia de fibonnaci.
	public static void verifiqPertence(int pertence) {
		if (fiboList().contains(pertence)) {
			System.out.println("O número informado: "+pertence+ " está presente na sequência fibonnaci.");
		}else {
			System.out.println("O número informado: "+pertence+ " NÃO está presente na sequência fibonnaci.");
		}
	}
}
