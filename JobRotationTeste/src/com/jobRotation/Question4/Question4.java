package com.jobRotation.Question4;

import java.text.DecimalFormat;

public class Question4 {
	public static void main(String[] args) {
		
		//Guardando os valores.
		Double spFat = 67.83643;
		Double rjFat = 36.67866;
		Double mgFat = 29.22988;
		Double esFat = 27.16548;
		Double outrosFat = 19.84953;
		//Total.
		Double totalDouble = spFat + rjFat + mgFat + esFat + outrosFat;
		
		//Formatando o valor total.
		DecimalFormat dFormat = new DecimalFormat("#,000.00");
		String formatado = dFormat.format(totalDouble);
		//Exibição
		System.out.println("O Faturamento total é de: "+totalDouble +"\nFormatado: "+formatado);
		
		
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
