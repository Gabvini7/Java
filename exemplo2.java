package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exemplo2 {

public static void main (String[] args) {
	
	int n;
	double soma , media;
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("Quantos numeros voce vai digitar");
	n = sc.nextInt();
	
	double[] vetor = new double[n];
	for (int i=0; i<n; i++) {
		System.out.print("digite um numero: ");
		vetor[i]=sc.nextInt();
	}
		soma=0;
		
	for (int i=0 ; i<n ; i++) {
		soma = soma + vetor[i];	
	}
		
		media = soma/n;
		System.out.println();
		System.out.println("valores");
	
	for (int i=0; i<n; i++) {
		System.out.printf("%.1f ", vetor[i]);
	}
	System.out.printf("\nSOMA= %.2f\n", soma);
	System.out.printf("media = %.2f\n", media);
	
	
	
	}
	

}