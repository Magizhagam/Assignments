package week3.day1;

public class APIClient {
	
	public void sendRequest(String endpoint)
	{
		System.out.println("String   " +endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
	{
		System.out.println("Send Request Paramenters \n" +endpoint +"\n" +requestBody +"\n" +requestStatus);
	}
	
	public static void main(String[] args) {
		
		APIClient api = new APIClient();
		api.sendRequest("API");
		api.sendRequest("Start", "Body", true);
		
	}

}
