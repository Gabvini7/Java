package vetores;

import java.util.Locale;
import java.util.Scanner;
import vetores.dados;
public class pensionato {
	
	public static void main (String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		dados[] vect = new dados[10];
		
		System.out.print("how many rooms will be rented? ");
		int n= sc.nextInt();
	
		for (int i=0; i<n; i++) {
		
		System.out.printf("Rent %da\n" , i+1);
		System.out.print("name: ");
		sc.nextLine();
		String name= sc.nextLine();		
		System.out.print("email: ");
		String email=sc.next();
		System.out.print("room: ");
		int roomNumber=sc.nextInt();
		System.out.println();
		
		
		vect[roomNumber]= new dados(name,email);

		}
		System.out.println("busy rooms: ");
		for (int i=0; i<10 ; i++) {
			if(vect[i]!= null) {
			System.out.println(i + ":" +vect[i]);
		}}
			
		
		sc.close();
	}}


