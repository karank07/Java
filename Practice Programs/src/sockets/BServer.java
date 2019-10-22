package broadcaster;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BServer {

	static ServerSocket ss;
	static Socket s;
	static DataInputStream din;
	static DataOutputStream dout;

	public static void main(String[] args) throws IOException {
		try {
			new BServer();
		} finally {
			try {
				din.close();
				dout.close();
				s.close();
				ss.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public BServer() {
		try {
			ss = new ServerSocket(9997);
			s = ss.accept();
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());

			listenForData();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void listenForData() {
		while (true) {
			try {
				/*
				 * while(din.available()==0) { try { Thread.sleep(1); } catch
				 * (InterruptedException e) { e.printStackTrace(); } }
				 */
				String DataIn = din.readUTF();
				System.out.println(DataIn);
				dout.writeUTF(DataIn);
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}

		}

	}
}
