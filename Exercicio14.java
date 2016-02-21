package exercicios;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String [] args){
		
		Scanner ler = new Scanner(System.in);
		NumberFormat valor = NumberFormat.getCurrencyInstance();
		
		double valorMulta = 4;
		double excesso = 0;
		double limite = 50;
		double multa = 0;
		
		System.out.println("Informe quantos quilos de peixe foram pescados: ");
		double peso = ler.nextDouble();
		
		if(peso > limite){
			excesso = peso - limite;
		    multa = valorMulta * excesso;
		}
		
		System.out.println("Voce pescou: " + peso + " kilos de peixe \n"
				         + "Seu excesso foi de: " + excesso + " kilos \n"
				         + "O valor da multa é de: " + valor.format(multa));		
		
	}
	
}
