package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exemplo4 {

	public static void main (String[] args) {
		
		int n;
		double media;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	

		
		System.out.print("quantos alunos serão digitados? :");
		n= sc.nextInt();
		
		String nome [] = new String[n];
		double nota1 [] = new double[n];
		double nota2 [] = new double[n];		
		
		
		for(int i=0; i<n; i++) {
			System.out.println("digite nome, primeira e segunda nota do aluno");
			nome[i]=sc.next();
			nota1[i]= sc.nextDouble();
			nota2[i] = sc.nextDouble();
			
		}
		
		
		
		for (int i=0; i<n; i++) {
			
			media= (nota1[i]+nota2[i])/2;
			
			if (media >=6) {
				System.out.println("Alunos aprovados");
			
				System.out.printf("%s\n",nome);}}
			
			for (int j=0; j<n; j++) {
				media= (nota1[j]+nota2[j])/2;
		     if (media <6){
				System.out.println("Alunos reprovados");
				System.out.printf("%s\n",nome);
		}
	
		sc.close();

	}
	
}
}