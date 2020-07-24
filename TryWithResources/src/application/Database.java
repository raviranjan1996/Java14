package application;

public class Database implements AutoCloseable {
	private String databaseConnection;

	public Database(String databaseConnection) throws Exception {
		System.out.println("connecting:-> " + databaseConnection);
		
		if (databaseConnection == null) {
			throw new Exception("cannot connect to db " + databaseConnection);
		}
		this.databaseConnection = databaseConnection;
		System.out.println("connected to database :-> " + databaseConnection);
	}

	public void getData() throws Exception {
		System.out.println("getting data from:-> " + databaseConnection);

		if (databaseConnection.length() < 3) {
			throw new Exception("cannot get data from db :-> " + databaseConnection);
		}
	}

	@Override
	public void close() throws Exception {
		System.out.println("closing....");
		if (databaseConnection.length()<5) {
			throw new Exception("cannot closing db:-> " + databaseConnection);
		}
		System.out.println("connection closing");
	}
}
