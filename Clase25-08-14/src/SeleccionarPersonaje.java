
public class SeleccionarPersonaje {

	public static void main(String[] args) {
		String personaje = "Mario";

        int maxLife;
        int maxJump;
        int maxSpeed;

        switch (personaje) {

        case "Mario":
            System.out.println("You have selected Mario!");
            maxLife = 70;
            maxJump = 50;
            maxSpeed = 25;
            break;

        case "Luigi":
            System.out.println("You have selected Luigi!");
            maxLife = 40;
            maxJump = 70;
            maxSpeed = 30;
            break;

        case "Yoshi":
            System.out.println("You have selected Yoshi!");
            maxLife = 50;
            maxJump = 30;
            maxSpeed = 40;
            break;

        }

	}

}
