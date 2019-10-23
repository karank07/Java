package broadcaster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerHandler extends Thread {

	Socket socket;
	BServer server;
	InputStream in;
	OutputStream out;
	BufferedReader br;
	PrintStream ps;

	public ServerHandler(Socket socket, BServer server) {
		this.socket = socket;
		this.server = server;
	}

	public void run() {
		try {
			in = socket.getInputStream();
			out = socket.getOutputStream();
			br = new BufferedReader(new InputStreamReader(in));
			ps = new PrintStream(out);
			String msg;
			while (true) {
				if(socket.isClosed())
				{
					server.clients.remove(this);
					break;
				}
				msg = br.readLine();
				
				if (msg == null)
					break;
				broadcast(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public void broadcast(String msg) {
		for (ServerHandler client : server.clients) {
			if (client.equals(this))
				continue;
			client.sendToClient(msg);
		}
	}

	public void sendToClient(String msg) {
		ps.println(msg);
	}

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
