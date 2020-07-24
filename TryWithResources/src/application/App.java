package application;

public class App {

	public static void main(String[] args) {

		try (Database db = new Database("spring")) {
			db.getData();
		} catch (Exception e) {
			System.out.println("catching exception...");
			System.out.println(e.getMessage());
		}

	}
}
// in this close method is called automatically.