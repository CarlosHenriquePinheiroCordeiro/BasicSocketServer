package basic_socket_server;

import java.net.ServerSocket;

/**
 * The Server piece main class
 * @author CarlosHenriquePinheiroCordeiro
 * @since 28/03/2022
 */
public class Main {

	public static void main(String[] args) {
		try {
			Client client = new Client(Server.getInstance().accept());
			System.out.println("Client accepted.");
		} catch (Exception e) {
			System.out.println("Client accepting error:\n");
			e.printStackTrace();
		}
	}


}
