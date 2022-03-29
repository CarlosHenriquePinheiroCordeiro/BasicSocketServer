package basic_socket_server;

import java.util.Scanner;

/**
 * The Server piece main class
 * @author CarlosHenriquePinheiroCordeiro
 * @since 28/03/2022
 */
public class Main {

	public static void main(String[] args) {
		Client client = new Client(Server.getInstance());
		System.out.println("Client accepted.");
		Scanner in = new Scanner(client.getInputStream());
		while (in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		in.close();
		Server.close();
	}


}
