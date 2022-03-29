package basic_socket_server;

import java.net.ServerSocket;

/**
 * The Server class, containing Server creation, returning and settings
 * @author CarlosHenriquePinheiroCordeiro
 * @since 28/03/2022
 */
public class Server {

	/**
	 * Server instance
	 */
	public static ServerSocket server = null;
	
	/**
	 * Server port attribute
	 */
	private static int port = 3334;
	
	/**
	 * Returns the Server instance (the Singleton "getInstance()" concept)
	 * @return ServerSocket
	 */
	public static ServerSocket getInstance() {
		if (server == null) {
			createServer();
		}
		return server;
	}
	
	/**
	 * Create the Server instance
	 */
	private static void createServer() {
		try {
			server = new ServerSocket(port);
			System.out.println("Server init port: "+port);
		} catch (Exception e) {
			System.out.println("Creating server error: \n");
			e.printStackTrace();
		}
		
	}

	/**
	 * Returns the Port attribute about the Server
	 * @return
	 */
	public int getPort() {
		return port;
	}


}
