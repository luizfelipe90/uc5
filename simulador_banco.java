package agenciaBancaria;
import java.util.Scanner;
public class simulador_banco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
	    
		int opcao;
	    double saldo = 5000.00;
	    double valor; 
	    
	    do { 
	    	
	    
	    	System.out.println("|===================|");
	    	System.out.println("|BEM VINDO AO   MENU|" );
	    	System.out.println("|===================|");
	    	System.out.println("1- Ver Saldo ");
	    	System.out.println("2- Fazer Deposito"); 
	    	System.out.println("3- Realizar Saque");
	    	System.out.println("4- Sair do Sistema");
            System.out.println("Escolha uma opcao:");	    
	    
            opcao = scanner.nextInt();  
	    
	    switch (opcao) { 
	         case 1:
	    		 System.out.printf("Seu saldo disponivel %2.f\n", saldo); 
	    	 break; 
	         case 2: 
	        	 System.out.printf("digite um valor para depositar R$ ");
	             valor = scanner.nextDouble(); 
	             if (valor > 0) { 
	            	 saldo += valor; 
	             System.out.printf("deposito de %.2f realizado com sucesso!", valor);
	             }else { 
	            	 System.out.println("valor invalido para deposito ");
	             }
	    	  break; 
	    	  case 3: 
	    		  System.out.println("digite o valor do para saque: R$"); 
	    		  valor = scanner.nextDouble(); 
	    		 if (valor > 0 && valor <= saldo) { 
	    			  saldo -= valor; 
	    			  System.out.printf("saque %.2f realizado com sucesso",valor);
	    		}else { 
	    			 System.out.println("saque invalido. verifique o valor do saldo insuficiente.");
	    		}
	        	break; 
	    	  case 4: 
	    		  System.out.printf("obriagdo por utulizar nosso sistema"); 
	    		  System.exit(0); 
	    	 
	    		  default: 
	    			  System.out.println("opcao invalida. por favor, tente novamente.");
	    		}
	    } while (opcao != 4); 
	    scanner.close(); 
	  }
	
} 
	    
