package mm;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import mm.Vetor;
import javax.swing.JOptionPane;

public class MétodosEModelo {

	private int[] vetor;

	public int[] getArray() {
		return vetor;
	}

	public void setArray(int[] array) {
		this.vetor = array;
	}

	public void QuickSort(int[] vetor, int inicio, int fim) {

		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			QuickSort(vetor, inicio, posicaoPivo - 1);
			QuickSort(vetor, posicaoPivo + 1, fim);
		}

	}

	public static int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[f])
				f--;
			else {
				int troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				i++;
				f--;
			}
		}
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;
		return f;
	}

	public void BubbleSort(int[] arr) {
		int i = 0, n = arr.length;
		boolean swapNeeded = true;

		while (i < n - 1 && swapNeeded) {
			swapNeeded = false;
			for (int j = 1; j < n - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					swapNeeded = true;
				}
			}
			if (!swapNeeded) {

				break;

			}
			i++;

		}
	}

	public void InsertionSort(int[] vetor) {
		int j;
		int key;
		int i;

		for (j = 1; j < vetor.length; j++) {
			key = vetor[j];
			for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
				vetor[i + 1] = vetor[i];
			}
			vetor[i + 1] = key;
		}

	}

	public long tempo(long TempoInicial, long TempoFinal) {

		long Tempo = (int) ((TempoFinal - TempoInicial) / 1000);
		if (Tempo == 0) {
			Tempo = (TempoFinal - TempoInicial);
			JOptionPane.showMessageDialog(null,
					"O Tempo que demorou para ordenar foi de : " + Tempo + " MiliSegundos ");
		} else {

			JOptionPane.showMessageDialog(null, "O Tempo que demorou para ordenar foi de : " + Tempo + " Segundos ");
		}

		return Tempo;
	}

	public int[] LerESeparar(String nome) throws IOException {
		// lendo o arquivo

		FileInputStream fis = new FileInputStream(nome);
		InputStreamReader isr = new InputStreamReader(fis);
		LineNumberReader br = new LineNumberReader(isr);

		// Variaveis para poder separar os valores recebidos
		StringTokenizer st = null;
		String linha = null;
		int numeros;

		// ArrayList usada como container temporario, para depois virar um vetor
		ArrayList<Integer> numero = new ArrayList<Integer>();
		while ((linha = br.readLine()) != null) {

			// UTILIZA DELIMITADOR ; PARA DIVIDIR OS CAMPOS
			st = new StringTokenizer(linha, ",");
			String dados = null;

			while (st.hasMoreTokens()) {

				// Campo NUMERO,Separa os números, transforma em int e inclui na ArrayList
				dados = st.nextToken();
				numeros = Integer.parseInt(dados);
				numero.add(numeros);

			}
		}
		br.close();
		// declarando o vetor com tamanho baseado na ArrayList
		final int[] arr = new int[numero.size()];
		int index = 0;
		// for com consumer, para cada valor de número,ele acrecenta no vetor, e depois
		// vai para o próximo indice
		for (final Integer value : numero) {
			arr[index++] = value;
		}
		Vetor vet = new Vetor();
		vet.setArray(arr);
		vet.setIndice(arr.length);
		return arr;

	}

	public void SelectionSort(int[] array) {
		for (int fixo = 0; fixo < array.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < array.length; i++) {
				if (array[i] < array[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				int t = array[fixo];
				array[fixo] = array[menor];
				array[menor] = t;
			}
		}
	}
}
