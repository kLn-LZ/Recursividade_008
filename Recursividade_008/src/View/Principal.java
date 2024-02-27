package View;

import java.util.*;

import Controller.Par;

public class Principal {
	public static void main (String[] args ) {
		
		Scanner scan = new Scanner(System.in);
		
		Par par = new Par();
		
		int[] vet = new int[10];
		
		int tam = vet.length;
		
		boolean m = true;
		
		for(int i = 0; i < tam ; i++) {
			
			System.out.print("Insira um valor inteiro diferente de zero: ");
			
			
			
			while(m == true) {
			
				vet[i] = scan.nextInt();
				
				if(vet[i] != 0) {
					
					m = false;
					
				}	
				
				else {
					m = true;
					System.out.println("Não insira o número zero");
					System.out.print("Insira um valor inteiro diferente de zero: ");
				}
				
			
			}
			
			
			m = true;
		
		
		}
		
		
		System.out.println("Quantidade números pares: " + par.funcPar(vet, tam - 1));
		
		
		
		
		
	}
	
	
}
