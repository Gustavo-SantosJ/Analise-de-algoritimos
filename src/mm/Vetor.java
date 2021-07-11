package mm;

public class Vetor {

	private static String nome;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Vetor.nome = nome;
	}

	private static int[] vetor;
	private static int indice;

	public static int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		Vetor.indice = indice;
	}

	public static int[] getArray() {
		return vetor;
	}

	public void setArray(int[] array) {
		Vetor.vetor = array;
	}

}
