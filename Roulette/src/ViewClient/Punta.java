package ViewClient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;

public class Punta extends JFrame {

	private JPanel contentPane;
	private JTextField tPunta;
	private JLabel lbPuntare;
	private JButton btnPunta;
	private JLabel lbPuntata;

	/**
	 * Create the frame.
	 */
	
	public Punta() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Punta.class.getResource("/img/roulette3.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbPuntare = new JLabel("Quanto vuoi puntare :");
		lbPuntare.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbPuntare.setForeground(Color.WHITE);
		lbPuntare.setBounds(12, 96, 221, 38);
		contentPane.add(lbPuntare);
		
		tPunta = new JTextField();
		tPunta.setFont(new Font("Tahoma", Font.PLAIN, 17));
		tPunta.setBounds(243, 102, 165, 26);
		contentPane.add(tPunta);
		tPunta.setColumns(10);
		
		btnPunta = new JButton("PUNTA");
		btnPunta.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPunta.setForeground(Color.WHITE);
		btnPunta.setBackground(Color.BLACK);
		btnPunta.setBounds(161, 197, 108, 33);
		contentPane.add(btnPunta);
		
		lbPuntata = new JLabel("PUNTATA");
		lbPuntata.setForeground(Color.WHITE);
		lbPuntata.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbPuntata.setBounds(153, 11, 157, 43);
		contentPane.add(lbPuntata);
	}

	public JTextField gettPunta() {
		return tPunta;
	}

	public void settPunta(JTextField tPunta) {
		this.tPunta = tPunta;
	}

	public JLabel getLbPuntare() {
		return lbPuntare;
	}

	public void setLbPuntare(JLabel lbPuntare) {
		this.lbPuntare = lbPuntare;
	}

	public JButton getBtnPunta() {
		return btnPunta;
	}

	public void setBtnPunta(JButton btnPunta) {
		this.btnPunta = btnPunta;
	}

	public JLabel getLbPuntata() {
		return lbPuntata;
	}

	public void setLbPuntata(JLabel lbPuntata) {
		this.lbPuntata = lbPuntata;
	}
}
