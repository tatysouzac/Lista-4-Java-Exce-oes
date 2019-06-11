package fapi.br.edu.ex4;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		Verificador verificar= new Verificador();
		
		try{
		int n1;
		int n2;
		int n3;
		Scanner leia= new Scanner(System.in);
		System.out.println("Digite 3 comprimentos");
		n1=leia.nextInt();
		n2= leia.nextInt();
		n3=leia.nextInt();
		verificar.verificarAresta(n1, n2, n3);
		
	}catch(ArestasInvalidasException e){
		System.out.println("Valores informados não formam um triângulo"+e);
		
}
}
}
