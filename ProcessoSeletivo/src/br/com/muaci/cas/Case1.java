package br.com.muaci.cas;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Case1 {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// Locale.setDefault(new Locale("us"));
		// System.out.println("Processo seletivo ");

		/*
		 * analisarCandidato(1900.00); analisarCandidato(2200.00);
		 * analisarCandidato(2000.00);
		 */
        // selecaoCandidatos();
		imprimirSelecionados();
	}
	static void imprimirSelecionados() {
		String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
		System.out.println("Imprimindo a lista de candidatos infomando o indece do elemento");
	    for(int indice=0; indice < candidatos.length;indice++) {
	    	System.out.println("O candidato de n° " + (indice+1)+ " é "+ candidatos[indice] );
	    	
	    }
	    System.out.println("");
	}

	static void selecaoCandidatos() {
		String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
				"Daniela", "Jorge" };

		int candidatoSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.00;

		while (candidatoSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretentido();

			System.out.println("O candidato " + candidato + " Solicitou este valor de salário  - " + salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " Foi selecionado para a vaga");
				candidatoSelecionados++;
			}
			candidatoAtual++;
		}
	}

	static double valorPretentido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.00;

		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");

		} else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDADNO O RESULTADO DOS DEMAIS CANDIDATOS");
		}

	}

}
