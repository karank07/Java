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
 *class ClientHandler extends Thread- to manage reading and writing data from stream for each client
 */
public class ClientHandler extends Thread {

	Socket socket;
	static InputStream in;
	static OutputStream out;
	BufferedReader br;
	PrintStream ps;

	BClient client;

	/**
	 * Constructor to initialize object
	 * @param socket
	 * @param client
	 */
	public ClientHandler(Socket socket, BClient client) {
		this.socket = socket;
		this.client = client;
	}

	/**
	 * @param msg writing to output stream
	 */
	public void sendMsgToServer(String msg) {

		ps.println(msg);
		ps.flush();
	}

	@Override
	public void run() {
		try {
			in = socket.getInputStream();
			out = socket.getOutputStream();
			ps = new PrintStream(out);
			br = new BufferedReader(new InputStreamReader(in));
			while (true) {
				String reply;
				reply = br.readLine();
				if(reply==null)
					break;
					BClient.setOutput(reply);
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}

	/**
	 * to close all streams
	 */
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
