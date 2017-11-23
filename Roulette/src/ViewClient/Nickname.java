package ViewClient;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class Nickname extends JFrame {

	private JPanel contentPane;
	private JTextField textNick;
	private JTextField textSoldi;
	private JButton btnGioca;

	/**
	 * Create the frame.
	 */
	public Nickname() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Nickname.class.getResource("/img/roulette3.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 178);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Image icon=Toolkit.getDefaultToolkit().getImage("C:\\Users\\gianl\\Desktop\\Roulette\\src\\img\\roulette3.png");
		//this.setIconImage(icon);
		
		
		textNick = new JTextField();
		textNick.setBounds(193, 25, 117, 20);
		contentPane.add(textNick);
		textNick.setColumns(10);
		
		JLabel lblNickname = new JLabel("Nickname:");
		lblNickname.setForeground(new Color(255, 255, 255));
		lblNickname.setBounds(49, 28, 64, 14);
		contentPane.add(lblNickname);
		
		JLabel lblSoldiPuntati = new JLabel("Soldi Puntati:");
		lblSoldiPuntati.setForeground(new Color(255, 255, 255));
		lblSoldiPuntati.setBounds(49, 70, 95, 14);
		contentPane.add(lblSoldiPuntati);
		
		textSoldi = new JTextField();
		textSoldi.setBounds(194, 67, 116, 20);
		contentPane.add(textSoldi);
		textSoldi.setColumns(10);
		
		btnGioca = new JButton("Gioca!!");
		btnGioca.setBackground(new Color(0, 0, 0));
		btnGioca.setForeground(new Color(255, 255, 255));
		btnGioca.setBounds(131, 95, 95, 23);
		contentPane.add(btnGioca);
	}

	public JButton getBtnGioca() {
		return btnGioca;
	}

	public void setBtnGioca(JButton btnGioca) {
		this.btnGioca = btnGioca;
	}

	public JTextField getTextField() {
		return textNick;
	}

	public void setTextField(JTextField textField) {
		this.textNick = textField;
	}

	public JTextField getTextField_1() {
		return textSoldi;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textSoldi = textField_1;
	}
}
