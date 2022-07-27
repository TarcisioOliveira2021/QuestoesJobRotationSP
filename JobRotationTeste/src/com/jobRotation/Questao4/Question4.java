package com.jobRotation.Questao4;

import java.text.DecimalFormat;

public class Question4 {
	public static void main(String[] args) {
		System.out.println("=========== F A T U R A M E N T O ==========");
		iniciar();	
	}
	public static void iniciar() {
		double spFat = 67.83643;
		double rjFat = 36.67866;
		double mgFat = 29.22988;
		double esFat = 27.16548;
		double outrosFat = 19.84953;
		double totalDouble = spFat + rjFat + mgFat + esFat + outrosFat;
		
		System.out.println("O Faturamento de SP foi: "+spFat);
		System.out.println("O Faturamento do RJ foi: "+rjFat);
		System.out.println("O Faturamento de MG foi: "+mgFat);
		System.out.println("O Faturamento do ES foi: "+esFat);
		System.out.println("O Faturamento de outros estados: "+outrosFat);
		
		String formatado = format(totalDouble);
		System.out.println("O Faturamento total é de: "+totalDouble +"\nFormatado: "+formatado);
		System.out.println("============================================");
	
		System.out.println("\n=========== Porcentagem por estado ==========");
		imprimir(1, processamento(spFat, totalDouble));
		imprimir(2, processamento(rjFat, totalDouble));
		imprimir(3, processamento(mgFat, totalDouble));
		imprimir(4, processamento(esFat, totalDouble));
		imprimir(5, processamento(outrosFat, totalDouble));
	}
	
	public static String format(double numero) {
		DecimalFormat dFormat = new DecimalFormat("#,000.00");
		return dFormat.format(numero);
	}
	
	public static Double processamento(double fatEstado, double total) {
		return((fatEstado/total) * 100 );
	}
	
	public static void imprimir(int i , double porcentagem) {
		switch (i) {
		case 1:
			System.out.println("A porcentagem de SP foi: "+(int)porcentagem+"%");
			break;
		case 2:
			System.out.println("A porcentagem do RJ foi: "+(int)porcentagem+"%");
			break;
		case 3:
			System.out.println("A porcentagem de MG foi: "+(int)porcentagem+"%");
			break;
		case 4:
			System.out.println("A porcentagem do ES foi: "+(int)porcentagem+"%");
			break;
		case 5:
			System.out.println("A porcentagem de outros estados: "+(int)porcentagem+"%");
			break;
		default:
			break;
		}
	}
}
