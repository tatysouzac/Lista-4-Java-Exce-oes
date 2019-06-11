package fapi.br.edu.ex2;

import java.util.Scanner;

public class MainLerNome {

	public static void main(String[] args) {

		VerificarImplement verificar;
		
		try {
			String nome;
			Scanner leia= new Scanner(System.in);
			System.out.println("Digite Nome: ");
			nome= leia.next();
			verificar = new Verificar();
			verificar.verificador(nome);
			System.out.println("Nome sem erros: "+ nome);
		
		}catch(NomeInvalidoException e) {
			System.out.println("Nome com UnderLine");
		}

	}

}
