package week3.day2;

public class JavaConnection extends MySqlConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
		System.out.println("Parent Class Connect Method.. ");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
		System.out.println("Parent Class Disconnect Method.. ");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Parent Class Update Method.. ");
	}

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		
		System.out.println("Child Class Query Method.. ");
	}

	public static void main(String[] args) {
		
		JavaConnection con = new JavaConnection();
		
		con.connect();
		con.disconnect();
		con.executeQuery();
		con.executeUpdate();
		
		
	}
		

}
