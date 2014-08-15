
public class Camisa {
	public int camisaID = 0; // Default ID for the shirt
	public String descripcion = "-ingresar descripcion-";
	public char codigoColor='S'; //Los codigos de color son R=Rojo, A=Azul, V=Verde, S=Sin setear
	public double precio = 0.0; 
	public int cantidadEnStock = 0; 
	
	
	// Este metodo muestra los valores,atributos de una camisa 
	
	public void displayShirtInformation() {
	System.out.println("Camisa ID: " + camisaID);
	System.out.println("Descripcion:" + descripcion);
	System.out.println("Codigo Color: " + codigoColor);
	System.out.println("Precio: " + precio);
	}
	
}
