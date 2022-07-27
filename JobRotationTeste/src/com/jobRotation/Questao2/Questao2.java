package com.jobRotation.Questao2;

import java.util.ArrayList;

public class Questao2 {
	
	//TODO Refatorar.
	public static void main(String[] args) {
		//Faz a sequencia de fibonnaci.
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
		//informar um numero.
		int pertenceFibo = 34;
		//verificar se esse numero pertence a sequencia de fibonnaci.
		if (fibonnaciSequence.contains(pertenceFibo)) {
			System.out.println("O número informado: "+pertenceFibo+ " está presente na sequência fibonnaci.");
		}else {
			System.out.println("O número informado: "+pertenceFibo+ " NÃO está presente na sequência fibonnaci.");
		}
		
	}
	
}
