package broadcaster;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * @author Karan
 *
 */

/**
 * 
 * class BServer to create server socket and maintain list of socket connections of server
 */
public class BServer {

	ServerSocket ss;
	ArrayList<ServerHandler> socketsList = new ArrayList<ServerHandler>();
	ServerHandler sh;
	
	public static void main(String[] args) throws IOException {
		new BServer();
	}

	/**
	 * Constructor to create server socket and initialize ServerHandler object, 
	 */
	public BServer() {
		try {
			ss = new ServerSocket(9996);
			while (true) {
				Socket s = ss.accept();
				System.out.println("New Client connected: " + s);
				sh= new ServerHandler(s, this);
				sh.start();
				socketsList.add(sh);
			}

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				ss.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
