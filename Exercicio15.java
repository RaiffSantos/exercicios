package exercicios;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String [] args){
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora trabalhada: ");
		double valorHora = ler.nextDouble();
		
		System.out.println("Informe quantas horas trabalhadas no mês");
		double horasTrab = ler.nextDouble();
		
		
		double salarioBruto = valorHora * horasTrab;
		double impostoRenda = 11;
		double inss         = 8;
		double sindicato    = 5;
		
		double valorIR        = (salarioBruto * impostoRenda) / 100;
		double valorINSS      = (salarioBruto * inss) / 100;
		double valorSindicato = (salarioBruto * sindicato) / 100;
		double salarioLiquido = salarioBruto - (valorIR + valorINSS + valorSindicato);
		
		System.out.println("Salario bruto = "             + salarioBruto + "\n"
				         + "Quanto pagou ao INSS = "      + valorINSS + "\n"
				         + "Quanto pagou ao sindicato = " + valorSindicato + "\n"
				         + "Salário liquido = "           + salarioLiquido);
		
	}

}
