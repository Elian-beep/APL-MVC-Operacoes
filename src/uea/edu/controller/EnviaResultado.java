package uea.edu.controller;

import uea.edu.model.entities.Soma;
import uea.edu.model.entities.Subtracao;
import uea.edu.model.Somar;
import uea.edu.model.Subtrair;

public class EnviaResultado {
	Soma novaSoma = new Soma();
	Somar novoSomar = new Somar();
	
	Subtracao novaSubtracao = new Subtracao();
	Subtrair novoSubtrair = new Subtrair();
	
	public double controllerSoma(double a, double b) {
		novaSoma.setA(a);
		novaSoma.setB(b);
		return novoSomar.somarNums(novaSoma.getA(), novaSoma.getB());
	}
	
	public double controllerSubtracao(double a, double b) {
		novaSubtracao.setA(a);
		novaSubtracao.setB(b);
		return novoSubtrair.subtrairNums(novaSubtracao.getA(), novaSubtracao.getB());
	}
}
