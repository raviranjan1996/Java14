package application;

public class App {

	public static void main(String[] args) {
			//does not work
			//new GameObject();
			
		
			GameObject[] gameObject = {new Player() , new Monster()};
			for(var gameObjects: gameObject) {
				gameObjects.gamer();
				gameObjects.Run();
				System.out.println(gameObjects);
			}
	}
		
}
//abstract class - it forces all of the subclass to implement the particular method
