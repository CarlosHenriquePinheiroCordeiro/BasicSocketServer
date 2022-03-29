package basic_socket_server;

import java.net.Socket;

/**
 * The Client class, containing Client creation, returning and settings
 * @author CarlosHenriquePinheiroCordeiro
 * @since 29/03/2022
 */
public class Client {

	/**
	 * The Client instance
	 */
	private Socket client;

	/**
	 * Constructor that sets the Client through a Socket passed from the Server instance
	 * @param client
	 */
	public Client(Socket client) {
		setClient(client);
	}
	
	public Socket getClient() {
		return client;
	}

	public void setClient(Socket client) {
		this.client = client;
	}


}
