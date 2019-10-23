package broadcaster;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler extends Thread {

	Socket socket;
	static DataInputStream din = null;
	static DataOutputStream dout = null;
	boolean stop=true;
	BClient client;
	public ClientHandler(Socket socket,BClient client) {
		this.socket = socket;
		this.client=client;
	}

	public void sendMsgToServer(String msg) {
		try {
			dout.writeUTF(msg);
			dout.flush();
		} catch (IOException e) {
			e.printStackTrace();
			close();
		}

	}

	public void run() {
		try {
			din = new DataInputStream(socket.getInputStream());
			dout = new DataOutputStream(socket.getOutputStream());
			while (stop) {
				String reply;
				if(!socket.isConnected())
				{
					break;
				}
				try {
					/*
					 * if (din.available() == 0) { try { Thread.sleep(1); } catch
					 * (InterruptedException e) { e.printStackTrace(); } }
					 */
					reply = din.readUTF();
					System.out.println(reply);
				} catch (IOException e) {
					e.printStackTrace();
					close();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			close();
		}
	}

	public void close() {
		try {
			din.close();
			dout.close();
			socket.close();
			this.stop=false;
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
