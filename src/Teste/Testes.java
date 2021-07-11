package Teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import mm.M�todosEModelo;

public class Testes {
	public static void main(String[] args) throws IOException {// Exe��o nescess�ria para poder ler arquivos

		// lendo o arquivo
		FileInputStream fis = new FileInputStream("1.000-Numeros-25%.txt");
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

				// Campo NUMERO,Separa os n�meros, transforma em int e inclui na ArrayList
				dados = st.nextToken();
				numeros = Integer.parseInt(dados);
				numero.add(numeros);

			}
		}
		// declarando o vetor com tamanho baseado na ArrayList
		final int[] arr = new int[numero.size()];
		int index = 0;
		// for com consumer, para cada valor de n�mero,ele acrecenta no vetor, e depois
		// vai para o pr�ximo indice
		for (final Integer value : numero) {
			arr[index++] = value;
		}

		// Intanciando a classe onde estam os m�todos de ordena��o
		M�todosEModelo base = new M�todosEModelo();
		// long utilizado para guardar o tempo atual em millisegundos
		long TempoInicial = System.currentTimeMillis();
		base.QuickSort(arr, 0, arr.length-1);

		for (Integer i : arr) {
			System.out.println(i);

		}
		long TempoFinal = System.currentTimeMillis();// 17552
		System.out.println(
				"=============================================================================================================");
		long Tempo = (int) ((TempoFinal - TempoInicial) / 1000);
		if (Tempo == 0) {
			Tempo = (TempoFinal - TempoInicial);
			System.out.println("O Tempo que demorou para ordenar foi de : " + Tempo + " MiliSegundos ");
		} else {

			System.out.println("O Tempo que demorou para ordenar foi de : " + Tempo + " Segundos");
		}

		System.out.println(
				"=============================================================================================================");
		br.close();
	}

}
