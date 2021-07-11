package Geradores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Gerador_De_1000_Valores {
	public static void main(String[] args) throws IOException {
		int opção;

		Scanner in = new Scanner(System.in);
			System.out.println(
					"Selecione 1 - Para 1.000 números 100% desordenados\n Selecione 2 - Para 1.000 números 50% desordenados\n Selecione 3 - Para 1.000 números 75% desordenados\n ");

					opção = in.nextInt();

		switch (opção) {
		case 1:// Gera números 100% desordenados
			PrintWriter pw = new PrintWriter("1.000-Numeros-100%.txt");
			int[] vetor = new int[1000]; // cria o vetor com 1.000 posições
			for (int i = 0; i < vetor.length; i++) {
				int rnd = (int) (1 + Math.random() * 1000); // gera um valor randomico de 0.0 ate menores q 1.0,
																// multiplica por 10000 e soma 1. Convertendo o
																// resultado para int.
				vetor[i] = rnd; // atribui o valor a cada indice do vetor
			}
			for (Integer i : vetor) {
				pw.println(i);// escreve os numeros do vetor em um txt, cada linha só possui um número

			}
			pw.close();
			break;
		case 2: // Gera números 50% desordenados
			PrintWriter pw1 = new PrintWriter("1.000-Numeros-50%.txt");
			int[] vetor1 = new int[1000]; // cria o vetor com 100.000 posições
			int aux = vetor1.length;
			int aux2 = aux / 2;
			int contador50 = 1;

			for (int i = 0; i < aux2; i++) {

				int temp = contador50;
				contador50++;

				vetor1[i] = temp;
			}

			for (int i = contador50 + 1; i < aux; i++) {
				int rnd = (int) (1 + Math.random() * aux2); // gera um valor randomico de 0.0 ate menores q 1.0,
															// multiplica por 10000 e soma 1. Convertendo o
															// resultado para int.
				vetor1[i] = rnd; // atribui o valor a cada indice do vetor
			}
			for (Integer i : vetor1) {
				pw1.println(i);// escreve os numeros do vetor em um txt, cada linha só possui um número

			}
			pw1.close();
			break;

		case 3: // Gera números 25% desordenados
			PrintWriter pw2 = new PrintWriter("1.000-Numeros-25%.txt");
			int[] vetor2 = new int[1000]; // cria o vetor com 100.000 posições
			int auxi = vetor2.length;
			int auxi2 = (int) ((int) auxi * 0.75);
			int contador25 = 1;

			for (int i = 0; i < auxi2; i++) {
				int tempor = contador25;
				contador25++;

				vetor2[i] = tempor;
			}

			for (int i = auxi2; i < auxi; i++) {
				int rnd = (int) (1 + Math.random() * auxi2); // gera um valor randomico de 0.0 ate menores q 1.0,
																// multiplica por 10000 e soma 1. Convertendo o
																// resultado para int.
				vetor2[i] = rnd; // atribui o valor a cada indice do vetor
			}
			for (Integer i : vetor2) {
				pw2.println(i);// escreve os numeros do vetor em um txt, cada linha só possui um úmero

			}
			pw2.close();
			break;
		}
		in.close();
	}
}