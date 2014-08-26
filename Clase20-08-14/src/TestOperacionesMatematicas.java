
public class TestOperacionesMatematicas {

	public static void main(String[] args) {
		OperacionesMatematicas MiClase = new OperacionesMatematicas();
		
		MiClase.a=10;
		MiClase.b=15;
		MiClase.c=20;
		
		int suma = MiClase.a+MiClase.b;
		
		int resta = MiClase.a-MiClase.b;
		
		int multiplica = MiClase.a*MiClase.c;
		
		int dividir = MiClase.c/MiClase.b;
		
		MiClase.mostrarResultado(suma);
		
		MiClase.mostrarResultado(resta);
		
		MiClase.mostrarResultado(multiplica);
		
		MiClase.mostrarResultado(dividir);
		
		
		

	}

}
