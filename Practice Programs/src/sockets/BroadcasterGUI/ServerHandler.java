package broadcaster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @author Karan
 *
 */

/**
 * 
 * class ServerHandler extends Thread to manage connections to server socket and broadcasting
 * message
 */
public class ServerHandler extends Thread {

	Socket socket;
	BServer server;
	InputStream in;
	OutputStream out;
	BufferedReader br;
	PrintStream ps;

	/**
	 * ServerHandler constructor to instantiate object
	 * 
	 * @param socket
	 * @param server
	 */
	public ServerHandler(Socket socket, BServer server) {
		this.socket = socket;
		this.server = server;
	}

	@Override
	public void run() {
		try {
			in = socket.getInputStream();
			out = socket.getOutputStream();
			br = new BufferedReader(new InputStreamReader(in));
			ps = new PrintStream(out);
			String msg;
			while (true) {

				msg = br.readLine();

				if (msg == null)
					break;
				broadcast(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
			close();
		}finally {
			close();
		}
	}

	/**
	 * @param msg to broadcast to each client
	 */
	public void broadcast(String msg) {
		for (ServerHandler client : server.socketsList) {
			if (client.equals(this))
				continue;
			client.sendToClient(msg);
		}
	}

	/**
	 * @param msg to broadcast
	 */
	public void sendToClient(String msg) {
		ps.println(msg);
		ps.flush();
	}

	/**
	 * to close all streams
	 */
	public void close() {
		try {
			br.close();
			ps.close();
			socket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
