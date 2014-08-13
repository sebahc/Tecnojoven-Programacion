
public class Telefono {
// estas variables describen el estado del telefono
	
	public int peso;
	public boolean encendido;
	public String color="azul";
	
	// este metodo controla el comportamiento del telefono
	public void EncenderApagar(){
		if (encendido==true){
			   encendido=false;
		} else {
			   encendido=true;
		}
	}
}
