package broadcaster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ClientHandler extends Thread {

	Socket socket;
	static InputStream in;
	static OutputStream out;
	BufferedReader br;
	PrintStream ps;

	BClient client;

	public ClientHandler(Socket socket, BClient client) {
		this.socket = socket;
		this.client = client;
	}

	public void sendMsgToServer(String msg) {

		ps.println(msg);
	}

	public void run() {
		try {
			in = socket.getInputStream();
			out = socket.getOutputStream();
			ps = new PrintStream(out);
			br = new BufferedReader(new InputStreamReader(in));
			while (true) {
				String reply;
				try {
					reply = br.readLine();
					if(reply==null)
						break;
					BClient.setOutput(reply);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			ps.close();
			br.close();
			socket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
