package lanchonete;
import java.util.Scanner;

public class lanchonete {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
                System.out.println("|__________________________|");
		        System.out.println("|BEM - VINDOS AO TROIA FOOD|");
		        System.out.println("|__________________________|");
		        
		        System.out.println("Menu:");
		        System.out.println("1 - x tudo (R$5.00)");
		        System.out.println("2 - Refrigerante (R$25.00)");
		        System.out.println("3 - Batata Frita (R$48.00)");
		        System.out.print("Escolha um item (1-3): "); 
		        
		       
		        int opcao = scanner.nextInt();
		        double preco = 0;

		  if (opcao == 1) {
		            preco = 15.00;
		            System.out.println("Você escolheu x tudo.");
		     } else if (opcao == 2) {
		            preco = 5.00;
		            System.out.println("Você escolheu Refrigerante.");
		     } else if (opcao == 3) {
		            preco = 8.00;
		            System.out.println("Você escolheu Batata Frita.");
		     } else {
		            System.out.println("Opção inválida.");
		     }

		  if (preco > 0) {
		            System.out.println("Total a pagar: R$" + preco);
		     }

		        scanner.close();
		    }
		
	}
   	     
   	    
  
   	   