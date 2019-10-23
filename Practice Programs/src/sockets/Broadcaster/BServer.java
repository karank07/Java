package broadcaster;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class BServer {

	static ServerSocket ss;
	ArrayList<ServerHandler> clients = new ArrayList<ServerHandler>();

	public static void main(String[] args) throws IOException {
		new BServer();
	}

	public BServer() {
		try {
			ss = new ServerSocket(9997);
			while (true) {
				Socket s = ss.accept();
				System.out.println("New Client connected: "+s);
				ServerHandler sh = new ServerHandler(s, this);
				sh.start();
				clients.add(sh);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
