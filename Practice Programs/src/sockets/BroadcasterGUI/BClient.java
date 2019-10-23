package broadcaster;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BClient extends JFrame implements ActionListener {
	Socket s;
	ClientHandler ch;
	boolean stop = false;
	BServer server;

	JFrame chatFrame;
	JTextField chatSendField, usernameField;
	static JTextArea chatReadArea;
	JButton send, exit, submit;
	JLabel usernameLabel,sendLabel;

	String username;
	public static void main(String[] args) {
		new BClient();

	}

	public BClient() {
		try {
			s = new Socket("localhost", 9996);
			ch = new ClientHandler(s, this);
			ch.start();
			createChatView();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void createChatView() {
		chatFrame = new JFrame("Broadcaster");

		usernameLabel=new JLabel("Username*:");
		usernameLabel.setBounds(50, 8, 80, 25);
		usernameField = new JTextField();
		usernameField.setBounds(140, 8, 200, 25);
		
		submit=new JButton("submit");
		submit.setBounds(350,8,100,25);
		
		chatReadArea = new JTextArea();
		chatReadArea.setBounds(50, 40, 400, 400);
		chatReadArea.setFont(chatReadArea.getFont().deriveFont(18f));
		chatReadArea.setText("Broadcasted Messages :");
		chatReadArea.setEditable(false);

		sendLabel=new JLabel("Your Message: ");
		sendLabel.setBounds(50, 450, 150, 25);
		
		
		chatSendField = new JTextField();
		chatSendField.setBounds(150, 450, 300, 25);
		chatSendField.setEditable(false);

		send = new JButton("send");
		send.setBounds(50, 490, 100, 25);
		
		exit = new JButton("Exit");
		exit.setBounds(160, 490, 100, 25);

		chatFrame.add(sendLabel);
		chatFrame.add(usernameLabel);
		chatFrame.add(usernameField);
		chatFrame.add(submit);
		chatFrame.add(chatSendField);
		chatFrame.add(chatReadArea);
		chatFrame.add(send);
		chatFrame.add(exit);
		chatFrame.setSize(580, 580);
		chatFrame.setLayout(null);
		chatFrame.setVisible(true);
		
		send.addActionListener(this);
		exit.addActionListener(this);
		submit.addActionListener(this);

	}

	public static void setOutput(String msg) {
		System.out.println(msg);
		chatReadArea.append("\n" + msg);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = chatSendField.getText();
		if (e.getSource() == submit) {
			username=usernameField.getText();
			chatSendField.setEditable(true);
		}
			if (e.getSource() == send) {
				String msg = username+": "+str;
				ch.sendMsgToServer(msg);
				chatSendField.setText("");

			} else if (e.getSource() == exit) {
				try {
					ch.stop();
					s.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				System.exit(0);
			}

	}

}
