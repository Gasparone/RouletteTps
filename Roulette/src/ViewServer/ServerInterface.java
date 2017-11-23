package ViewServer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.Toolkit;

public class ServerInterface extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JLabel lblNumeroVincente;
	private JLabel label;
	private JLabel label_1;
    private DefaultTableModel mod=new DefaultTableModel();
    private JTable table;

	/**
	 * Create the frame.
	 */
	public ServerInterface() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ServerInterface.class.getResource("/img/roulette3.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(431, 11, 326, 459);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setShowVerticalLines(false);
		table.setShowGrid(false);
		table.setRowSelectionAllowed(false);
		table.setShowHorizontalLines(false);
		table.setForeground(Color.WHITE);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		table.setBackground(Color.DARK_GRAY);
		scrollPane.setViewportView(table);
		
		lblNumeroVincente = new JLabel("NUMERO VINCENTE");
		lblNumeroVincente.setForeground(Color.RED);
		lblNumeroVincente.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroVincente.setFont(new Font("Cambria", Font.PLAIN, 24));
		lblNumeroVincente.setBounds(20, 367, 401, 52);
		contentPane.add(lblNumeroVincente);
		
		label = new JLabel("");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Cambria", Font.PLAIN, 24));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(158, 418, 114, 52);
		contentPane.add(label);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(ServerInterface.class.getResource("/img/bg_roulette_img.jpg")));
		label_1.setBounds(10, 42, 411, 330);
		contentPane.add(label_1);
		table.setModel(mod);
		mod.addColumn("Server Log");
	
	}

	public JLabel getLblNumeroVincente() {
		return lblNumeroVincente;
	}

	public void setLblNumeroVincente(JLabel lblNumeroVincente) {
		this.lblNumeroVincente = lblNumeroVincente;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public DefaultTableModel getMod() {
		return mod;
	}

	public void setMod(DefaultTableModel mod) {
		this.mod = mod;
	}
}
