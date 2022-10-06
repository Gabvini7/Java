package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exemplo3 {

	
	public static void main (String[] args)  {
	
		int n, nm ;
		double at,soma, media, pm;
		
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("quantas pessoas serão digitadas? ");
	n =   sc.nextInt();
	
	int idade [] = new int[n];
	double altura[] = new double [n];
	String nome[] = new String [n];
	
	
	for(int i=0; i<n; i++) {
		System.out.printf("dados da %da pessoa:\n ", i+1);
		System.out.print("nome: ");
		nome[i] = sc.next();
		System.out.print("idade: ");
		idade[i] = sc.nextInt();
		System.out.print("altura: ");
		altura[i]= sc.nextDouble();	
	}
	
	  nm=0;
	  at=0;
	 soma=0;
	 
	  for (int i=0; i<n; i++) {
		  soma= soma+altura[i];
	  }
	   media = soma/n;
	  
	for(int i=0; i<n ;i++) {
		if(idade[i]<16) {
			nm=nm+1;
	}	
	}
       pm= (nm/n)*100.0;
	 
	 System.out.printf("\nAltura media= %.2f\n", media);
	 System.out.printf("pessoas com menos de 16 anos: %.1f%%\n",pm);
	 
	 
	 
	 for (int i=0; i<n; i++) {
		 if (idade[i]<16) {
			 System.out.printf("%s\n", nome[i]);
		 }
	 }
	 
	
	
}
}