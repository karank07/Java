package broadcaster;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerHandler extends Thread {

	Socket socket;
	BServer server;
	DataInputStream din;
	DataOutputStream dout;

	public ServerHandler(Socket socket, BServer server) {
		this.socket = socket;
		this.server = server;
	}

	public void sendToClient(String msg) {
		try {
			dout.writeUTF(msg);
			dout.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void broadcast(String msg) {
		for (ServerHandler client : server.clients) {
			if(client.equals(this))
				continue;
			client.sendToClient(msg);
		}
	}

	public void run() {
		try {
			din = new DataInputStream(socket.getInputStream());
			dout = new DataOutputStream(socket.getOutputStream());
			String msg;
			while (true) {
				/*
				 * if (din.available() == 0) { try { Thread.sleep(1); } catch
				 * (InterruptedException e) { e.printStackTrace(); }
				 * 
				 * }
				 */		
				
				msg= din.readUTF();
				broadcast(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
