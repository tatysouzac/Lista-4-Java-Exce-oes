package fapi.br.edu.ex3;

public class Verificar implements VerificarImplement {

	@Override
	public void verificador(String nome) throws NomeInvalidoException {

		if (nome.startsWith("_")) {
			throw new NomeInvalidoException(nome);

		}

	}
}
