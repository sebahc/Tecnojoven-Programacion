
public class Repetir {

	public static void main(String[] args) {
		boolean girando = true;
        int contador = 0;

        while (girando) {
            System.out.println("La tierra esta girando..");
            System.out.println(contador);
            contador++;

            if (contador == 10) {
                girando = false;
            } // ends If

        } // ends While

    } // ends Main

}
