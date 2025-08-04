package exerHudson_04_08_2025;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
		
	    String[] nome = new String [5]; 
	    double[] nota1 = new double  [5];  		
	    double[] nota2 = new double  [5];
	    double[] media  = new double  [5];
	
	    
	    for ( int i = 0; i < 5; i++) { 
	     System.out.println("Digite o nome do aluno" + (i + 1 ) + ":"); 
	    nome [i] = input.nextLine();
	    	
	     System.out.println("nota 1");
	     nota1[i] = input.nextDouble(); 
	    
         System.out.println("nota2"); 
         nota2[i] = input.nextDouble(); 
         input.nextLine();
           
         media [i] = (nota1[i] + nota2 [i]) / 2; 
         System.out.println();
         }
	     System.out.println("resultado final:");
	    
	       for(int i = 0; i < 5; i++ ) { 
	     System.out.println(nome [i] + "-media :" + media[i]);
	    }
        	
	       input.close();
	}

}
