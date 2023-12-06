package week3.day2;

public abstract interface DatabaseConnection {
	
	public void connect();
	
	public void disconnect();
	
	public void executeUpdate();

}
