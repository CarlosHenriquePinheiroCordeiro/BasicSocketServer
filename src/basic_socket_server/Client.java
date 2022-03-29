package basic_socket_server;

import java.io.InputStream;
import java.net.ServerSocket;
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
	 * Constructor that sets the Client through the Server instance
	 * @param serverSocket
	 */
	public Client(ServerSocket serverSocket) {
		setClient(serverSocket);
	}
	
	/**
	 * Returns the Client inputStream
	 * @return
	 */
	public InputStream getInputStream() {
		try {
			return this.client.getInputStream();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Returns the Client instance
	 * @return
	 */
	public Socket getClient() {
		return client;
	}

	/**
	 * Setter of the Client, taking it through Server
	 * @param serverSocket
	 */
	public void setClient(ServerSocket serverSocket) {
		try {
			this.client = serverSocket.accept();
		} catch (Exception e) {
			System.out.println("Connecting client error:\n");
			e.printStackTrace();
		}
	}


}
