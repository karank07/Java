package broadcaster;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class BClient {
	Socket s;
	ClientHandler ch;
	
	public static void main(String[] args) {
			new BClient();
	
	}

	public BClient() {
		try {
			s = new Socket("localhost", 9997);
			
			ch=new ClientHandler(s,this);
			ch.start();
			listenForInput();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void listenForInput() {
		Scanner in = new Scanner(System.in);
		String msg;
		while (true) {
			 msg= in.nextLine();
			if (msg.equalsIgnoreCase("stop")) {
				ch.close();
				
				break;
			}
			ch.sendMsgToServer(msg);
		}
		in.close();
	}

}
