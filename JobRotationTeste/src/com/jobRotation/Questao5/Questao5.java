package com.jobRotation.Questao5;

public class Questao5 {
	public static void main(String[] args) {
		iniciar();
	}

	private static void iniciar() {
		String palavra = "Escola";
		String reverso = "";
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			reverso = reverso + palavra.charAt(i);
		}
		
		System.err.println(palavra);
		System.out.println(reverso);
		

	}
}
