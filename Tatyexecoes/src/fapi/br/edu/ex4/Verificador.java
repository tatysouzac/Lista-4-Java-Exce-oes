package fapi.br.edu.ex4;

public class Verificador implements VerificarTrian {

	@Override
	public void verificarAresta(int n1, int n2, int n3) throws ArestasInvalidasException {
		int maior = 0;
		int soma = 0;
		double c1 = 0;
		double c2 = 0;

		if (n1 < n2 && n2 < n3) {
			maior = n3;
			c1 = n2;
			c2 = n1;
			soma = n2 + n1;
		} else if (n2 < n1 && n3 < n1) {
			maior = n1;
			c1 = n2;
			c2 = n3;
			soma = n2 + n3;
		} else if (n1 < n2 && n3 < n2) {
			maior = n2;
			c1 = n3;
			c2 = n1;
			soma = n1 + n3;
		}
		if (maior < soma) {
			System.out.println("É um triangulo");

			double hipo = Math.pow(maior, 2);
			double c1r = Math.pow(c1, 2);
			double c2r = Math.pow(c2, 2);
			
			if(hipo == (c1r +c2r)) {
				System.out.println("Triangulo Retangulo");
			}
			if (n1 == n2 && n2 != n3) {
				System.out.println("Triangulo isosceles");

			} else if (n1 == n3 && n3 != n2) {
				System.out.println("Triangulo isosceles");

			} else if (n2 == n3 && n3 != n1) {
				System.out.println("Triangulo isosceles");

			} else if (n1 != n2 && n2 != n3) {
				System.out.println("Triangulo escaleno");

			}

		} else {
			throw new ArestasInvalidasException(n3, n3, n3);
		}

	}

}
