import java.util.Random;


public class RandomMio {

	public static void main(String[] args) {
		Random numeroAlAzar = new Random();
		
		int contador=0;
		
		while (contador<10){
			int numero=numeroAlAzar.nextInt(10);
			System.out.println(numero);
			if (numero==5){
				System.out.println("Gane!");
				
			}
			
			//contador=contador+1;
			contador++;
			
		}
		
		

	}

}
