public class TestPersona {

	public static void main(String[] args) {
		Persona miPersona = new Persona();

		miPersona.nombre = "Seba";
		miPersona.edad = 22;
		miPersona.telefono = "2994564653";

		miPersona.mostrarInfo();

		int edad = miPersona.edad;

		if (edad == 18) {
			System.out.println("Esta persona tiene 18 años ");
		} else {
			if (edad == 21) {
				System.out.println("Esta persona tiene 21 años");
			} else {
				System.out.println("Esta persona no tiene ni 18 ni 21 años");
			}

		}

	}

}
