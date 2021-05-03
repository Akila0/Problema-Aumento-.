import java.util.Scanner;
import java.util.Locale;

    public class Main {
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
     Locale.setDefault(Locale.US);
     
 double salario, aumento, salario5, salario10, salario15, salario20;    
  
     
     System.out.print("Digite o salario da pessoa: ");
     salario = sc.nextDouble();
     
     if (salario > 8000) {
    	 
    	 aumento = (salario * 5) / 100;
    	 salario5 = aumento + salario;
    	 
         System.out.println("Novo salario = R$ " + String.format("%.2f", salario5));
         System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
         System.out.println("Porcentagem = 5%");
    	    	 
     } else if (salario > 3000 && salario <= 8000) {
    	 
    	 aumento = (salario * 10) / 100;
    	 salario10 = aumento + salario;
    	 
         System.out.println("Novo salario = R$ " + String.format("%.2f", salario10));
         System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
         System.out.println("Porcentagem = 10% ");	 
    	 	 
     } else if (salario > 1000 && salario <= 3000) {
    	 
    	 aumento = (salario * 15) / 100;
    	 salario15 = aumento + salario;
    	 
         System.out.println("Novo salario = R$ " + String.format("%.2f", salario15));
         System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
         System.out.println("Porcentagem = 15% ");
    	 
     } else if (salario <= 1000) {
    	 
    	 aumento = (salario * 20) / 100;
    	 salario20 = aumento + salario;
    	 
         System.out.println("Novo salario = R$ " + String.format("%.2f", salario20));
         System.out.println("Aumento = R$ "+ String.format("%.2f", aumento));
         System.out.println("Porcentagem = 20% ");
     }
     
     
     sc.close();
	}

}

