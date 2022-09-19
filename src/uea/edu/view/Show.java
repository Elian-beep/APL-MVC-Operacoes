package uea.edu.view;

import java.util.Scanner;

import uea.edu.controller.EnviaResultado;
import uea.edu.model.Soma;

public class Show {
	Scanner sc = new Scanner(System.in);
	EnviaResultado enviaResultado = new EnviaResultado();
	
	
	public void inserirSoma() {
		System.out.printf("Digite o primeiro valor: ");
		double a = sc.nextDouble();
		System.out.printf("Digite o segundo valor: ");
		double b = sc.nextDouble();
		
		this.mostrarSoma(enviaResultado.controllerSoma(a, b));
	}

	public void mostrarSoma(double result) {
		System.out.println("------------------------------------");
		System.out.println("RESULTADO DA SOMA: "+result);
	}
	
	public void mostrarSubtração() {
		System.out.println("------------------------------------");
		System.out.println("RESULTADO DA SUBTRAÇÃO: ");
	}
	
	public void mostrarDivisão() {
		System.out.println("------------------------------------");
		System.out.println("RESULTADO DA DIVISÃO: ");
	}
	
	public void mostrarMultiplicação() {
		System.out.println("------------------------------------");
		System.out.println("RESULTADO DA MULTIPLICAÇÃO: ");
	}

}
