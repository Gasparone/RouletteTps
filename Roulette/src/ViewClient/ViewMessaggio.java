package ViewClient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class ViewMessaggio extends JFrame {

	private JPanel contentPane;
	private JLabel lblVinto;
	private JLabel lblVincitori;
	private JLabel lblIVincitoriSono;
	private JButton btnOk;
	private JLabel lblVincita;
	private JLabel lblImg;
	private JLabel lblPerso;
	private JLabel lblNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMessaggio frame = new ViewMessaggio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewMessaggio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ViewMessaggio.class.getResource("/img/roulette3.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 437);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(ViewMessaggio.class.getResource("/img/soldi.jpg")));
		lblImg.setBounds(506, 11, 212, 183);
		contentPane.add(lblImg);
		
		lblImg.setVisible(false);
		
		lblPerso = new JLabel("HAI PERSO!!");
		lblPerso.setForeground(new Color(255, 0, 0));
		lblPerso.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblPerso.setBounds(245, 11, 231, 94);
		contentPane.add(lblPerso);
		
		lblPerso.setVisible(false);
		
		lblVinto = new JLabel("HAI VINTO!!");
		lblVinto.setForeground(new Color(0, 255, 0));
		lblVinto.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblVinto.setBounds(245, 11, 231, 94);
		contentPane.add(lblVinto);
		
		lblVinto.setVisible(false);
		
		lblVincita = new JLabel("");
		lblVincita.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblVincita.setForeground(new Color(255, 215, 0));
		lblVincita.setBounds(282, 98, 163, 53);
		contentPane.add(lblVincita);
		
		lblVincita.setVisible(false);
		
		lblNum = new JLabel("");
		lblNum.setForeground(new Color(255, 255, 255));
		lblNum.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNum.setBounds(203, 98, 364, 53);
		contentPane.add(lblNum);
		
		lblNum.setVisible(false);
		
		lblIVincitoriSono = new JLabel("I vincitori sono:");
		lblIVincitoriSono.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblIVincitoriSono.setForeground(new Color(255, 255, 255));
		lblIVincitoriSono.setBounds(64, 180, 253, 27);
		contentPane.add(lblIVincitoriSono);
		
		lblIVincitoriSono.setVisible(false);
		
		lblVincitori = new JLabel("");
		lblVincitori.setForeground(Color.WHITE);
		lblVincitori.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVincitori.setBounds(64, 233, 585, 53);
		contentPane.add(lblVincitori);
		
		lblVincitori.setVisible(false);
		
		btnOk = new JButton("OK");
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnOk.setForeground(new Color(255, 255, 255));
		btnOk.setBackground(new Color(0, 0, 0));
		btnOk.setBounds(295, 334, 156, 53);
		contentPane.add(btnOk);
	}

	public JLabel getLblVinto() {
		return lblVinto;
	}

	public void setLblVinto(JLabel lblVinto) {
		this.lblVinto = lblVinto;
	}

	public JLabel getLblIVincitoriSono() {
		return lblIVincitoriSono;
	}

	public void setLblIVincitoriSono(JLabel lblIVincitoriSono) {
		this.lblIVincitoriSono = lblIVincitoriSono;
	}

	public JLabel getLblImg() {
		return lblImg;
	}

	public void setLblImg(JLabel lblImg) {
		this.lblImg = lblImg;
	}

	public JLabel getLblPerso() {
		return lblPerso;
	}

	public void setLblPerso(JLabel lblPerso) {
		this.lblPerso = lblPerso;
	}

	public JLabel getLblNum() {
		return lblNum;
	}

	public void setLblNum(JLabel lblNum) {
		this.lblNum = lblNum;
	}

	public JLabel getLblVincita() {
		return lblVincita;
	}

	public void setLblVincita(JLabel lblVincita) {
		this.lblVincita = lblVincita;
	}

	public JLabel getLblVincitori() {
		return lblVincitori;
	}

	public void setLblVincitori(JLabel lblVincitori) {
		this.lblVincitori = lblVincitori;
	}

	public JButton getBtnOk() {
		return btnOk;
	}

	public void setBtnOk(JButton btnOk) {
		this.btnOk = btnOk;
	}
}
