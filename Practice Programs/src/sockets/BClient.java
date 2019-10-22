package broadcaster;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class BClient {
	static Socket s = null;
	static DataInputStream din = null;
	static DataOutputStream dout = null;

	public static void main(String[] args) {
		try {
			new BClient();
		} finally {
			try {
				din.close();
				dout.close();
				s.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	public BClient() {
		try {
			s = new Socket("localhost", 9997);
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());

			listenForInput();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void listenForInput() {
		Scanner in = new Scanner(System.in);
		while (true) {
			/*
			 * while (!in.hasNextLine()) { try { Thread.sleep(1); } catch
			 * (InterruptedException e) { e.printStackTrace(); }
			 */
			String input = in.nextLine();
			if (input.equalsIgnoreCase("stop")) {
				break;
			}
			try {
				dout.writeUTF(input);

				/*
				 * while (din.available() == 0) { try { Thread.sleep(1); } catch
				 * (InterruptedException e) { e.printStackTrace(); } }
				 */
				String reply = din.readUTF();
				System.out.println(reply);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		in.close();
	}

}
