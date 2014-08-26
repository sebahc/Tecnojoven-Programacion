
import java.util.Random;

public class JuegoDados {

	public int valorDado;
	
    

    public void tirarDado() {
    
        Random rand = new Random();
        valorDado = rand.nextInt(6) + 1;
        System.out.println("Tiraste un.. " + valorDado);
       
        evaluarResultado(valorDado);    
    } 


    public void evaluarResultado(int valorDado) {
    	
    	// si el valor es igual a 1 o 2 se pierde el juego
    
        if (valorDado <= 2) {
            System.out.println("Perdiste.");
           
        } 
        
     // si el valor es de 3 a 5 tira de nuevo
        
        else if (valorDado == 3 || valorDado == 4 || valorDado == 5) {
            System.out.println();
            System.out.println("Tirando de Nuevo el Dado...");
            System.out.println();
            tirarDado();
        } 
        
     // si el valor es igual a 6 gana
        else if (valorDado == 6) {
        	
            System.out.println("Ganaste! Felicidades!");
           
        } 
        
    } 
    
    public static void main(String[] args) {
		JuegoDados nuevoDado = new JuegoDados();
		
		nuevoDado.tirarDado();
		

	}

}   