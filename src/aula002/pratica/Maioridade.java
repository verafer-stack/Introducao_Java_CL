package aula002.pratica;

import java.util.Scanner;

public class Maioridade {
		public static void main(String[]args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite sua idade, por favor: ");
			int idade = sc.nextInt();
			
			if (idade>=18) {
				System.out.print("Você é maior de idade");
			} else {
				System.out.print("você é menor de idade");
			}
	//sempre fechar o scanner
			
			sc.close();
}
}
