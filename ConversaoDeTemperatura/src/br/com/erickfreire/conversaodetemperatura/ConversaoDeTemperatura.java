package br.com.erickfreire.conversaodetemperatura;

import java.util.Scanner;

/**
 * Programa em java que converte temperaturas
 * @author Erick Freire
 * @version 1 - Criado em 02-05-2021 as 15:46
 */

public class ConversaoDeTemperatura {
	public static void main(String[] args) {
		
		int opcao;
		double valor;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que converte temperaturas");
		
		System.out.print("Ecolha uma opção 1 - Celsius para Fahrenheit ou 2 - Fahrenheit para Celsius: ");
		opcao = entrada.nextInt();
		
		while(opcao < 1 || opcao > 2) {
			System.out.print("Opção errada: Ecolha uma opção 1 - Celsius para Fahrenheit ou 2 - Fahrenheit para Celsius: ");
			opcao = entrada.nextInt();
		}
		
		switch(opcao){
		case 1 :
			System.out.print("Informe um valor: ");
			valor = entrada.nextDouble();
			fahrenheit(valor);
			break;
		case 2:
			System.out.print("Informe um valor: ");
			valor = entrada.nextDouble();
			celsius(valor);
			break;
		default:
			System.out.println("Erro do sistema!");
			break;
			
		}
		
	}
	
	public static void fahrenheit(double v) {
		double fah = (9 * v + 160) / 5;
		System.out.printf("%n%nO valor convertido é de: %f%n", fah);
	}
	
    public static void celsius(double v) {
		double cel = (v - 32) * (5.0 / 9.0);
		System.out.printf("%n%nO valor convertido é de: %f%n", cel);
	}

}
