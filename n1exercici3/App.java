package n1exercici3;

public class App {

	public static void main(String[] args) {
		
		Game game = new Game(Input.readString("Insert player name: "));
		
		game.play();
	}
}
