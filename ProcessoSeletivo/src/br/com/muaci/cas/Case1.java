package br.com.muaci.cas;

import java.util.Locale;

public class Case1 {

	public static void main(String[] args) {

		Locale.setDefault(new Locale("us"));
		System.out.println("Processo seletivo ");
		
		analisarCandidato(1900.00);
		analisarCandidato(2200.00);
		analisarCandidato(2000.00);

	}
    static void analisarCandidato(double salarioPretendido) {
    	double salarioBase = 2000.00;
    	
    	if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
			
		}else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}else {
			System.out.println("AGUARDADNO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
    	
    }
	
}
