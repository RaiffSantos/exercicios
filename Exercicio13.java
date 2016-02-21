package exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String [] args){
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o sexo, 'm' para MASCULINO ou 'f' para FEMININO: ");
		String sexo = ler.nextLine();
		System.out.println("Informe sua altura");
		double altura = ler.nextDouble();
		System.out.println("Informe seu peso:");
		double peso = ler.nextDouble();
		
		
		//O switch trata a variavel 'sexo' em dois casos, se for masculino e se for feminino
		switch(sexo){
		    
		    case "m":
			    double pesoIdealM = (72.7 * altura) - 58;
			    System.out.println("Masculino \n O peso ideal é: " + pesoIdealM); //o \n serve pra quebrar a linha
		    
			    //testando o peso ideal
				if(peso <= (pesoIdealM - 2)){
					System.out.println("Voce esta abaixo do peso ideal");
				}else if(peso >= (pesoIdealM - 1.99) && peso <= (pesoIdealM + 1.99)){
					System.out.println("Voce esta em seu peso ideal");
				}else if(peso >= pesoIdealM + 2){
					System.out.println("Voce esta acima do peso ideal");
				}
			    
			    break; //Quando a condição é acertada ele para de procurar nos outros 'case' abaixo.
		
		    case "f":
			    double pesoIdealF = (62.1 * altura) - 44.7;
			    System.out.println("Feminino \n O peso ideal é: " + pesoIdealF);
			    
			    if(peso <= (pesoIdealF - 2)){
					System.out.println("Voce esta abaixo do peso ideal");
				}else if(peso >= (pesoIdealF - 1.99) && peso <= (pesoIdealF + 1.99)){
					System.out.println("Voce esta em seu peso ideal");
				}else if(peso >= pesoIdealF + 2){
					System.out.println("Voce esta acima do peso ideal");
				}
			    
			    break;
			
		}
		
		
	}
	
}
