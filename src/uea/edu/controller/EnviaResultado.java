package uea.edu.controller;

import uea.edu.model.Soma;
import uea.edu.model.Somar;

public class EnviaResultado {
	Soma novaSoma = new Soma();
	Somar novoSomar = new Somar();
	
	public double controllerSoma(double a, double b) {
		novaSoma.setA(a);
		novaSoma.setB(b);
		return novoSomar.somarNums(a, b);
	}
}
