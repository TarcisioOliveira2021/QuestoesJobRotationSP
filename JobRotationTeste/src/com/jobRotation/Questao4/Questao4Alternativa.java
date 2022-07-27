package com.jobRotation.Questao4;

public class Questao4Alternativa {
	public static void main(String[] args) {
		//Entrada
		double spFat = 67.83643;
		double rjFat = 36.67866;
		double mgFat = 29.22988;
		double esFat = 27.16548;
		double outrosFat = 19.84953;
		double totalDouble = spFat + rjFat + mgFat + esFat + outrosFat;
		
		//Procesamento da porcentagem de cada estado.
		double pSpFat = ((spFat/totalDouble) * 100 );
		double pRjFat = ((rjFat/totalDouble) * 100 );
		double pMgFat = ((mgFat/totalDouble) * 100 );
		double pEsFat = ((esFat/totalDouble) * 100 );
		double pOutrosFat = ((outrosFat/totalDouble) * 100 );
		
		//Exibição dos porcentos.
		System.out.println("A porcentagem de SP foi: "+(int)pSpFat+"%");
		System.out.println("A porcentagem do RJ foi: "+(int)pRjFat+"%");
		System.out.println("A porcentagem de MG foi: "+(int)pMgFat+"%");
		System.out.println("A porcentagem do ES foi: "+(int)pEsFat+"%");
		System.out.println("A porcentagem de outros estados: "+(int)pOutrosFat+"%");

	}
}
