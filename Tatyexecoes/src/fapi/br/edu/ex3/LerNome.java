package fapi.br.edu.ex3;

import java.util.Scanner;

public class LerNome {

	public static void main(String[] args) {

		int cont = 0;
		int contCerto = 0;
		int contErrados = 0;

		while (cont < 5) {
			String nome;
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite Nome: ");
			nome = leia.next();
			Verificar verificar = new Verificar();
			try {
				verificar.verificador(nome);
				contCerto++;

			} catch (NomeInvalidoException e) {
				System.out.println("não fio");
				contErrados++;
			}

			cont++;
		}
		System.out.println("Nomes Errados:" + contErrados);
		System.out.println("Nomes Certos:" + contCerto);
	}

}
