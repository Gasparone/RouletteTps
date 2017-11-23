package ViewClient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class FinestraClient extends JFrame {

	private JPanel contentPane;
	private JLabel lbimg;
	private JButton bt0;
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	private JButton bt4;
	private JButton bt5;
	private JButton bt6;
	private JButton bt7;
	private JButton bt8;
	private JButton bt9;
	private JButton bt10;
	private JButton bt11;
	private JButton bt12;
	private JButton bt13;
	private JButton bt14;
	private JButton bt15;
	private JButton bt16;
	private JButton bt17;
	private JButton bt18;
	private JButton bt19;
	private JButton bt20;
	private JButton bt21;
	private JButton bt22;
	private JButton bt23;
	private JButton bt24;
	private JButton bt25;
	private JButton bt26;
	private JButton bt27;
	private JButton bt28;
	private JButton bt29;
	private JButton bt30;
	private JButton bt31;
	private JButton bt32;
	private JButton bt33;
	private JButton bt34;
	private JButton bt35;
	private JButton bt36;
	private JButton btBlack;
	private JButton btRed;
	private JButton btNewPartita;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lb1;
	private JLabel lb00;
	private JLabel lbNickname;
	private JLabel lbNick;
	private JLabel lbPuntata;
	private JLabel lbPunt;
	private JLabel lb3;
	private JLabel lb5;
	private JLabel lb7;
	private JLabel lb9;
	private JLabel lb12;
	private JLabel lb14;
	private JLabel lb18;
	private JLabel lb16;
	private JLabel lb19;
	private JLabel lb21;
	private JLabel lb23;
	private JLabel lb25;
	private JLabel lb27;
	private JLabel lb30;
	private JLabel lb32;
	private JLabel lb34;
	private JLabel lb36;
	private JLabel lb2;
	private JLabel lb4;
	private JLabel lb6;
	private JLabel lb8;
	private JLabel lb10;
	private JLabel lb11;
	private JLabel lb13;
	private JLabel lb15;
	private JLabel lb17;
	private JLabel lb20;
	private JLabel lb22;
	private JLabel lb24;
	private JLabel lb26;
	private JLabel lb28;
	private JLabel lb29;
	private JLabel lb31;
	private JLabel lb33;
	private JLabel lb35;
	private JLabel lbRed;
	private JLabel lbBlack;
	private JLabel lb0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinestraClient frame = new FinestraClient();
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
	public FinestraClient() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FinestraClient.class.getResource("/img/roulette3.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 787);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bt1 = new JButton("1");
		buttonGroup.add(bt1);
		bt1.setBackground(Color.RED);
		bt1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt1.setForeground(Color.WHITE);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		lb0 = new JLabel("");
		lb0.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/Senza titolo-2.png")));
		lb0.setBackground(new Color(0, 128, 0));
		lb0.setBounds(193, 58, 50, 41);
		contentPane.add(lb0);
		
		lb0.setVisible(false);
		
		bt0 = new JButton("0");
		buttonGroup.add(bt0);
		bt0.setForeground(new Color(255, 255, 255));
		bt0.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt0.setBackground(new Color(0, 128, 0));
		bt0.setBounds(113, 54, 210, 45);
		contentPane.add(bt0);
		
		lb1 = new JLabel("");
		lb1.setBackground(Color.RED);
		lb1.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb1.setBounds(113, 102, 69, 45);
		contentPane.add(lb1);
		bt1.setBounds(113, 102, 69, 45);
		contentPane.add(bt1);
		
		lb1.setVisible(false);
		
		lb2 = new JLabel("");
		lb2.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb2.setBackground(new Color(0, 0, 0));
		lb2.setBounds(183, 102, 69, 45);
		contentPane.add(lb2);
		
		lb2.setVisible(false);		
		
		bt2 = new JButton("2");
		buttonGroup.add(bt2);
		bt2.setForeground(Color.WHITE);
		bt2.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt2.setBackground(Color.BLACK);
		bt2.setBounds(183, 102, 69, 45);
		contentPane.add(bt2);
		
		lb3 = new JLabel("");
		lb3.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb3.setBackground(new Color(255, 0, 0));
		lb3.setBounds(255, 102, 67, 45);
		contentPane.add(lb3);
		
		lb3.setVisible(false);
		
		bt3 = new JButton("3");
		buttonGroup.add(bt3);
		bt3.setForeground(Color.WHITE);
		bt3.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt3.setBackground(Color.RED);
		bt3.setBounds(255, 102, 69, 45);
		contentPane.add(bt3);
		
		lb4 = new JLabel("");
		lb4.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb4.setBackground(Color.BLACK);
		lb4.setBounds(113, 151, 69, 45);
		contentPane.add(lb4);
		
		lb4.setVisible(false);
		
		bt4 = new JButton("4");
		buttonGroup.add(bt4);
		bt4.setForeground(Color.WHITE);
		bt4.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt4.setBackground(Color.BLACK);
		bt4.setBounds(113, 151, 69, 45);
		contentPane.add(bt4);
		
		lb5 = new JLabel("");
		lb5.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb5.setBackground(Color.RED);
		lb5.setBounds(183, 151, 69, 45);
		contentPane.add(lb5);
		
		lb5.setVisible(false);
		
		bt5 = new JButton("5");
		buttonGroup.add(bt5);
		bt5.setForeground(Color.WHITE);
		bt5.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt5.setBackground(Color.RED);
		bt5.setBounds(183, 151, 69, 45);
		contentPane.add(bt5);
		
		lb6 = new JLabel("");
		lb6.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb6.setBackground(Color.BLACK);
		lb6.setBounds(255, 151, 67, 45);
		contentPane.add(lb6);
		
		lb6.setVisible(false);
		
		bt6 = new JButton("6");
		buttonGroup.add(bt6);
		bt6.setForeground(Color.WHITE);
		bt6.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt6.setBackground(Color.BLACK);
		bt6.setBounds(255, 151, 69, 45);
		contentPane.add(bt6);
		
		lb7 = new JLabel("");
		lb7.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb7.setBackground(Color.RED);
		lb7.setBounds(113, 200, 69, 45);
		contentPane.add(lb7);
		
		lb7.setVisible(false);
		
		bt7 = new JButton("7");
		buttonGroup.add(bt7);
		bt7.setForeground(Color.WHITE);
		bt7.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt7.setBackground(Color.RED);
		bt7.setBounds(113, 200, 69, 45);
		contentPane.add(bt7);
		
		lb8 = new JLabel("");
		lb8.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb8.setBackground(Color.BLACK);
		lb8.setBounds(183, 200, 69, 45);
		contentPane.add(lb8);
		
		lb8.setVisible(false);
		
		bt8 = new JButton("8");
		buttonGroup.add(bt8);
		bt8.setForeground(Color.WHITE);
		bt8.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt8.setBackground(Color.BLACK);
		bt8.setBounds(183, 200, 69, 45);
		contentPane.add(bt8);
		
		lb9 = new JLabel("");
		lb9.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb9.setBackground(Color.RED);
		lb9.setBounds(255, 200, 67, 45);
		contentPane.add(lb9);
		
		lb9.setVisible(false);
		
		bt9 = new JButton("9");
		buttonGroup.add(bt9);
		bt9.setForeground(Color.WHITE);
		bt9.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt9.setBackground(Color.RED);
		bt9.setBounds(255, 200, 69, 45);
		contentPane.add(bt9);
		
		lb10 = new JLabel("");
		lb10.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb10.setBackground(Color.BLACK);
		lb10.setBounds(113, 247, 69, 45);
		contentPane.add(lb10);
		
		lb10.setVisible(false);
		
		bt10 = new JButton("10");
		buttonGroup.add(bt10);
		bt10.setForeground(Color.WHITE);
		bt10.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt10.setBackground(new Color(0, 0, 0));
		bt10.setBounds(113, 247, 69, 45);
		contentPane.add(bt10);
		
		lb11 = new JLabel("");
		lb11.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb11.setBackground(Color.BLACK);
		lb11.setBounds(183, 247, 69, 45);
		contentPane.add(lb11);
		
		lb11.setVisible(false);
		
		bt11 = new JButton("11");
		buttonGroup.add(bt11);
		bt11.setForeground(Color.WHITE);
		bt11.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt11.setBackground(Color.BLACK);
		bt11.setBounds(183, 247, 69, 45);
		contentPane.add(bt11);
		
		lb12 = new JLabel("");
		lb12.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb12.setBackground(Color.RED);
		lb12.setBounds(255, 247, 67, 45);
		contentPane.add(lb12);
		
		lb12.setVisible(false);
		
		bt12 = new JButton("12");
		buttonGroup.add(bt12);
		bt12.setForeground(Color.WHITE);
		bt12.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt12.setBackground(Color.RED);
		bt12.setBounds(255, 247, 69, 45);
		contentPane.add(bt12);
		
		lb13 = new JLabel("");
		lb13.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb13.setBackground(Color.BLACK);
		lb13.setBounds(113, 295, 69, 45);
		contentPane.add(lb13);
		
		lb13.setVisible(false);
		
		bt13 = new JButton("13");
		buttonGroup.add(bt13);
		bt13.setForeground(Color.WHITE);
		bt13.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt13.setBackground(Color.BLACK);
		bt13.setBounds(113, 295, 69, 45);
		contentPane.add(bt13);
		
		lb14 = new JLabel("");
		lb14.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb14.setBackground(Color.RED);
		lb14.setBounds(183, 295, 69, 45);
		contentPane.add(lb14);
		
		lb14.setVisible(false);
		
		bt14 = new JButton("14");
		buttonGroup.add(bt14);
		bt14.setForeground(Color.WHITE);
		bt14.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt14.setBackground(Color.RED);
		bt14.setBounds(183, 295, 69, 45);
		contentPane.add(bt14);
		
		lb15 = new JLabel("");
		lb15.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb15.setBackground(Color.BLACK);
		lb15.setBounds(255, 295, 67, 45);
		contentPane.add(lb15);
		
		lb15.setVisible(false);
		
		bt15 = new JButton("15");
		buttonGroup.add(bt15);
		bt15.setForeground(Color.WHITE);
		bt15.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt15.setBackground(Color.BLACK);
		bt15.setBounds(255, 295, 69, 45);
		contentPane.add(bt15);
		
		lb16 = new JLabel("");
		lb16.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb16.setBackground(Color.RED);
		lb16.setBounds(113, 345, 69, 45);
		contentPane.add(lb16);
		
		lb16.setVisible(false);
		
		bt16 = new JButton("16");
		buttonGroup.add(bt16);
		bt16.setForeground(Color.WHITE);
		bt16.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt16.setBackground(Color.RED);
		bt16.setBounds(113, 345, 69, 45);
		contentPane.add(bt16);
		
		lb17 = new JLabel("");
		lb17.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb17.setBackground(Color.BLACK);
		lb17.setBounds(183, 345, 69, 45);
		contentPane.add(lb17);
		
		lb17.setVisible(false);
		
		bt17 = new JButton("17");
		buttonGroup.add(bt17);
		bt17.setForeground(Color.WHITE);
		bt17.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt17.setBackground(Color.BLACK);
		bt17.setBounds(183, 345, 69, 45);
		contentPane.add(bt17);
		
		lb18 = new JLabel("");
		lb18.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb18.setBackground(Color.RED);
		lb18.setBounds(255, 345, 67, 45);
		contentPane.add(lb18);
		
		lb18.setVisible(false);
		
		bt18 = new JButton("18");
		buttonGroup.add(bt18);
		bt18.setForeground(Color.WHITE);
		bt18.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt18.setBackground(Color.RED);
		bt18.setBounds(255, 345, 69, 45);
		contentPane.add(bt18);
		
		lb19 = new JLabel("");
		lb19.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb19.setBackground(Color.RED);
		lb19.setBounds(113, 394, 69, 45);
		contentPane.add(lb19);
		
		lb19.setVisible(false);
		
		bt19 = new JButton("19");
		buttonGroup.add(bt19);
		bt19.setForeground(Color.WHITE);
		bt19.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt19.setBackground(Color.RED);
		bt19.setBounds(113, 394, 69, 45);
		contentPane.add(bt19);
		
		lb20 = new JLabel("");
		lb20.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb20.setBackground(Color.BLACK);
		lb20.setBounds(183, 394, 69, 45);
		contentPane.add(lb20);
		
		lb20.setVisible(false);
		
		bt20 = new JButton("20");
		buttonGroup.add(bt20);
		bt20.setForeground(Color.WHITE);
		bt20.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt20.setBackground(Color.BLACK);
		bt20.setBounds(183, 394, 69, 45);
		contentPane.add(bt20);
		
		lb21 = new JLabel("");
		lb21.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb21.setBackground(Color.RED);
		lb21.setBounds(255, 394, 67, 45);
		contentPane.add(lb21);
		
		lb21.setVisible(false);
		
		bt21 = new JButton("21");
		buttonGroup.add(bt21);
		bt21.setForeground(Color.WHITE);
		bt21.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt21.setBackground(Color.RED);
		bt21.setBounds(255, 394, 69, 45);
		contentPane.add(bt21);
		
		lb22 = new JLabel("");
		lb22.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb22.setBackground(Color.BLACK);
		lb22.setBounds(113, 441, 69, 45);
		contentPane.add(lb22);
		
		lb22.setVisible(false);
		
		bt22 = new JButton("22");
		buttonGroup.add(bt22);
		bt22.setForeground(Color.WHITE);
		bt22.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt22.setBackground(Color.BLACK);
		bt22.setBounds(113, 441, 69, 45);
		contentPane.add(bt22);
		
		lb23 = new JLabel("");
		lb23.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb23.setBackground(Color.RED);
		lb23.setBounds(183, 441, 69, 45);
		contentPane.add(lb23);
		
		lb23.setVisible(false);
		
		bt23 = new JButton("23");
		buttonGroup.add(bt23);
		bt23.setForeground(Color.WHITE);
		bt23.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt23.setBackground(Color.RED);
		bt23.setBounds(183, 441, 69, 45);
		contentPane.add(bt23);
		
		lb24 = new JLabel("");
		lb24.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb24.setBackground(Color.BLACK);
		lb24.setBounds(255, 441, 67, 45);
		contentPane.add(lb24);
		
		lb24.setVisible(false);
		
		bt24 = new JButton("24");
		buttonGroup.add(bt24);
		bt24.setForeground(Color.WHITE);
		bt24.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt24.setBackground(Color.BLACK);
		bt24.setBounds(255, 441, 69, 45);
		contentPane.add(bt24);
		
		lb25 = new JLabel("");
		lb25.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb25.setBackground(Color.RED);
		lb25.setBounds(113, 490, 69, 45);
		contentPane.add(lb25);
		
		lb25.setVisible(false);
		
		bt25 = new JButton("25");
		buttonGroup.add(bt25);
		bt25.setForeground(Color.WHITE);
		bt25.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt25.setBackground(Color.RED);
		bt25.setBounds(113, 490, 69, 45);
		contentPane.add(bt25);
		
		lb26 = new JLabel("");
		lb26.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb26.setBackground(Color.BLACK);
		lb26.setBounds(183, 490, 69, 45);
		contentPane.add(lb26);
		
		lb26.setVisible(false);
		
		bt26 = new JButton("26");
		buttonGroup.add(bt26);
		bt26.setForeground(Color.WHITE);
		bt26.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt26.setBackground(Color.BLACK);
		bt26.setBounds(183, 490, 69, 45);
		contentPane.add(bt26);
		
		lb27 = new JLabel("");
		lb27.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb27.setBackground(Color.RED);
		lb27.setBounds(255, 490, 67, 45);
		contentPane.add(lb27);
		
		lb27.setVisible(false);
		
		bt27 = new JButton("27");
		buttonGroup.add(bt27);
		bt27.setForeground(Color.WHITE);
		bt27.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt27.setBackground(Color.RED);
		bt27.setBounds(255, 490, 69, 45);
		contentPane.add(bt27);
		
		lb28 = new JLabel("");
		lb28.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb28.setBackground(Color.BLACK);
		lb28.setBounds(113, 539, 69, 45);
		contentPane.add(lb28);
		
		lb28.setVisible(false);
		
		bt28 = new JButton("28");
		buttonGroup.add(bt28);
		bt28.setForeground(Color.WHITE);
		bt28.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt28.setBackground(Color.BLACK);
		bt28.setBounds(113, 539, 69, 45);
		contentPane.add(bt28);
		
		lb29 = new JLabel("");
		lb29.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb29.setBackground(Color.BLACK);
		lb29.setBounds(183, 539, 69, 45);
		contentPane.add(lb29);
		
		lb29.setVisible(false);
		
		bt29 = new JButton("29");
		buttonGroup.add(bt29);
		bt29.setForeground(Color.WHITE);
		bt29.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt29.setBackground(Color.BLACK);
		bt29.setBounds(183, 539, 69, 45);
		contentPane.add(bt29);
		
		lb30 = new JLabel("");
		lb30.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb30.setBackground(Color.RED);
		lb30.setBounds(255, 539, 67, 45);
		contentPane.add(lb30);
		
		lb30.setVisible(false);
		
		bt30 = new JButton("30");
		buttonGroup.add(bt30);
		bt30.setForeground(Color.WHITE);
		bt30.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt30.setBackground(Color.RED);
		bt30.setBounds(255, 539, 69, 45);
		contentPane.add(bt30);
		
		lb31 = new JLabel("");
		lb31.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb31.setBackground(Color.BLACK);
		lb31.setBounds(113, 587, 69, 45);
		contentPane.add(lb31);
		
		lb31.setVisible(false);
		
		bt31 = new JButton("31");
		buttonGroup.add(bt31);
		bt31.setForeground(Color.WHITE);
		bt31.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt31.setBackground(Color.BLACK);
		bt31.setBounds(113, 587, 69, 45);
		contentPane.add(bt31);
		
		lb32 = new JLabel("");
		lb32.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb32.setBackground(Color.RED);
		lb32.setBounds(183, 587, 69, 45);
		contentPane.add(lb32);
		
		lb32.setVisible(false);
		
		bt32 = new JButton("32");
		buttonGroup.add(bt32);
		bt32.setForeground(Color.WHITE);
		bt32.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt32.setBackground(Color.RED);
		bt32.setBounds(183, 587, 69, 45);
		contentPane.add(bt32);
		
		lb33 = new JLabel("");
		lb33.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb33.setBackground(Color.BLACK);
		lb33.setBounds(255, 587, 67, 45);
		contentPane.add(lb33);
		
		lb33.setVisible(false);
		
		bt33 = new JButton("33");
		buttonGroup.add(bt33);
		bt33.setForeground(Color.WHITE);
		bt33.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt33.setBackground(Color.BLACK);
		bt33.setBounds(255, 587, 69, 45);
		contentPane.add(bt33);
		
		lb34 = new JLabel("");
		lb34.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb34.setBackground(Color.RED);
		lb34.setBounds(113, 635, 69, 45);
		contentPane.add(lb34);
		
		lb34.setVisible(false);
		
		bt34 = new JButton("34");
		buttonGroup.add(bt34);
		bt34.setForeground(Color.WHITE);
		bt34.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt34.setBackground(Color.RED);
		bt34.setBounds(113, 635, 69, 45);
		contentPane.add(bt34);
		
		lb35 = new JLabel("");
		lb35.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera.jpg")));
		lb35.setBackground(Color.BLACK);
		lb35.setBounds(183, 635, 69, 45);
		contentPane.add(lb35);
		
		lb35.setVisible(false);
		
		bt35 = new JButton("35");
		buttonGroup.add(bt35);
		bt35.setForeground(Color.WHITE);
		bt35.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt35.setBackground(Color.BLACK);
		bt35.setBounds(183, 635, 69, 45);
		contentPane.add(bt35);
		
		lb36 = new JLabel("");
		lb36.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa.jpg")));
		lb36.setBackground(Color.RED);
		lb36.setBounds(255, 635, 67, 45);
		contentPane.add(lb36);
		
		lb36.setVisible(false);
		
		bt36 = new JButton("36");
		buttonGroup.add(bt36);
		bt36.setForeground(Color.WHITE);
		bt36.setFont(new Font("Tahoma", Font.PLAIN, 27));
		bt36.setBackground(Color.RED);
		bt36.setBounds(255, 635, 69, 45);
		contentPane.add(bt36);
		
		lbRed = new JLabel("");
		lbRed.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_rossa_g.jpg")));
		lbRed.setBackground(Color.RED);
		lbRed.setBounds(325, 272, 101, 173);
		contentPane.add(lbRed);
		
		lbRed.setVisible(false);
		
		btRed = new JButton("");
		buttonGroup.add(btRed);
		btRed.setSelectedIcon(null);
		btRed.setBackground(Color.RED);
		btRed.setBounds(325, 272, 101, 173);
		contentPane.add(btRed);
		
		lbBlack = new JLabel("");
		lbBlack.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/fisch_nera_g.jpg")));
		lbBlack.setBackground(Color.BLACK);
		lbBlack.setBounds(10, 272, 101, 173);
		contentPane.add(lbBlack);
		
		lbBlack.setVisible(false);
		
		btBlack = new JButton("");
		buttonGroup.add(btBlack);
		btBlack.setSelectedIcon(null);
		btBlack.setBackground(Color.BLACK);
		btBlack.setBounds(10, 272, 101, 173);
		contentPane.add(btBlack);
		
		lb00 = new JLabel("");
		lb00.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/Senza titolo-2.png")));
		lb00.setBackground(new Color(0, 128, 0));
		lb00.setBounds(376, 12, 50, 33);
		contentPane.add(lb00);
		
		lb00.setVisible(true);
		
		lbPunt = new JLabel("");
		lbPunt.setForeground(new Color(255, 255, 255));
		lbPunt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbPunt.setBackground(new Color(0, 128, 0));
		lbPunt.setBounds(325, 12, 70, 28);
		contentPane.add(lbPunt);
		
		lbPuntata = new JLabel("Puntata:");
		lbPuntata.setForeground(new Color(255, 255, 255));
		lbPuntata.setBackground(new Color(0, 128, 0));
		lbPuntata.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbPuntata.setBounds(243, 12, 88, 28);
		contentPane.add(lbPuntata);
		
		lbNick = new JLabel("");
		lbNick.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbNick.setForeground(new Color(255, 255, 255));
		lbNick.setBackground(new Color(0, 128, 0));
		lbNick.setBounds(113, 12, 127, 31);
		contentPane.add(lbNick);
		
		lbNickname = new JLabel("Nickname:");
		lbNickname.setForeground(new Color(255, 255, 255));
		lbNickname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbNickname.setBackground(new Color(0, 128, 0));
		lbNickname.setBounds(12, 12, 115, 33);
		contentPane.add(lbNickname);
		
		btNewPartita = new JButton("NUOVA PARTITA");
		btNewPartita.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btNewPartita.setBackground(new Color(0, 128, 0));
		btNewPartita.setForeground(new Color(255, 255, 255));
		btNewPartita.setBounds(113, 691, 210, 33);
		contentPane.add(btNewPartita);
		
		btNewPartita.setVisible(false);
		
		lbimg = new JLabel("");
		lbimg.setBackground(Color.RED);
		lbimg.setIcon(new ImageIcon(FinestraClient.class.getResource("/img/Senza titolo-2.jpg")));
		lbimg.setBounds(10, 11, 416, 726);
		contentPane.add(lbimg);
		
		
		
	}

	public JButton getBtNewPartita() {
		return btNewPartita;
	}

	public void setBtNewPartita(JButton btNewPartita) {
		this.btNewPartita = btNewPartita;
	}

	public JLabel getLb0() {
		return lb0;
	}

	public void setLb0(JLabel lb0) {
		this.lb0 = lb0;
	}
	
	public JLabel getLbRed() {
		return lbRed;
	}

	public void setLbRed(JLabel lbRed) {
		this.lbRed = lbRed;
	}

	public JLabel getLbBlack() {
		return lbBlack;
	}

	public void setLbBlack(JLabel lbBlack) {
		this.lbBlack = lbBlack;
	}

	public JLabel getLb3() {
		return lb3;
	}

	public void setLb3(JLabel lb3) {
		this.lb3 = lb3;
	}

	public JLabel getLb5() {
		return lb5;
	}

	public void setLb5(JLabel lb5) {
		this.lb5 = lb5;
	}

	public JLabel getLb7() {
		return lb7;
	}

	public void setLb7(JLabel lb7) {
		this.lb7 = lb7;
	}

	public JLabel getLb9() {
		return lb9;
	}

	public void setLb9(JLabel lb9) {
		this.lb9 = lb9;
	}

	public JLabel getLb21() {
		return lb21;
	}

	public void setLb21(JLabel lb21) {
		this.lb21 = lb21;
	}

	public JLabel getLb23() {
		return lb23;
	}

	public void setLb23(JLabel lb23) {
		this.lb23 = lb23;
	}

	public JLabel getLb25() {
		return lb25;
	}

	public void setLb25(JLabel lb25) {
		this.lb25 = lb25;
	}

	public JLabel getLb27() {
		return lb27;
	}

	public void setLb27(JLabel lb27) {
		this.lb27 = lb27;
	}

	public JLabel getLb30() {
		return lb30;
	}

	public void setLb30(JLabel lb30) {
		this.lb30 = lb30;
	}

	public JLabel getLb32() {
		return lb32;
	}

	public void setLb32(JLabel lb32) {
		this.lb32 = lb32;
	}

	public JLabel getLb34() {
		return lb34;
	}

	public void setLb34(JLabel lb34) {
		this.lb34 = lb34;
	}

	public JLabel getLb36() {
		return lb36;
	}

	public void setLb36(JLabel lb36) {
		this.lb36 = lb36;
	}

	public JLabel getLb2() {
		return lb2;
	}

	public void setLb2(JLabel lb2) {
		this.lb2 = lb2;
	}

	public JLabel getLb4() {
		return lb4;
	}

	public void setLb4(JLabel lb4) {
		this.lb4 = lb4;
	}

	public JLabel getLb6() {
		return lb6;
	}

	public void setLb6(JLabel lb6) {
		this.lb6 = lb6;
	}

	public JLabel getLb8() {
		return lb8;
	}

	public void setLb8(JLabel lb8) {
		this.lb8 = lb8;
	}

	public JLabel getLb20() {
		return lb20;
	}

	public void setLb20(JLabel lb20) {
		this.lb20 = lb20;
	}

	public JLabel getLb22() {
		return lb22;
	}

	public void setLb22(JLabel lb22) {
		this.lb22 = lb22;
	}

	public JLabel getLb24() {
		return lb24;
	}

	public void setLb24(JLabel lb24) {
		this.lb24 = lb24;
	}

	public JLabel getLb26() {
		return lb26;
	}

	public void setLb26(JLabel lb26) {
		this.lb26 = lb26;
	}

	public JLabel getLb28() {
		return lb28;
	}

	public void setLb28(JLabel lb28) {
		this.lb28 = lb28;
	}

	public JLabel getLb29() {
		return lb29;
	}

	public void setLb29(JLabel lb29) {
		this.lb29 = lb29;
	}

	public JLabel getLb31() {
		return lb31;
	}

	public void setLb31(JLabel lb31) {
		this.lb31 = lb31;
	}

	public JLabel getLb33() {
		return lb33;
	}

	public void setLb33(JLabel lb33) {
		this.lb33 = lb33;
	}

	public JLabel getLb35() {
		return lb35;
	}

	public void setLb35(JLabel lb35) {
		this.lb35 = lb35;
	}

	public JLabel getLb12() {
		return lb12;
	}

	public void setLb12(JLabel lb12) {
		this.lb12 = lb12;
	}

	public JLabel getLb14() {
		return lb14;
	}

	public void setLb14(JLabel lb14) {
		this.lb14 = lb14;
	}

	public JLabel getLb18() {
		return lb18;
	}

	public void setLb18(JLabel lb18) {
		this.lb18 = lb18;
	}

	public JLabel getLb16() {
		return lb16;
	}

	public void setLb16(JLabel lb16) {
		this.lb16 = lb16;
	}

	public JLabel getLb19() {
		return lb19;
	}

	public void setLb19(JLabel lb19) {
		this.lb19 = lb19;
	}

	public JLabel getLb11() {
		return lb11;
	}

	public void setLb11(JLabel lb11) {
		this.lb11 = lb11;
	}

	public JLabel getLb13() {
		return lb13;
	}

	public void setLb13(JLabel lb13) {
		this.lb13 = lb13;
	}

	public JLabel getLb15() {
		return lb15;
	}

	public void setLb15(JLabel lb15) {
		this.lb15 = lb15;
	}

	public JLabel getLb17() {
		return lb17;
	}

	public void setLb17(JLabel lb17) {
		this.lb17 = lb17;
	}

	public JLabel getLb10() {
		return lb10;
	}

	public void setLb10(JLabel lb10) {
		this.lb10 = lb10;
	}

	public JLabel getLb00() {
		return lb00;
	}

	public void setLb00(JLabel lb00) {
		this.lb00 = lb00;
	}

	public JLabel getLbNick() {
		return lbNick;
	}

	public void setLbNick(JLabel lbNick) {
		this.lbNick = lbNick;
	}

	public JLabel getLbPunt() {
		return lbPunt;
	}

	public void setLbPunt(JLabel lbPunt) {
		this.lbPunt = lbPunt;
	}

	public JLabel getLb1() {
		return lb1;
	}

	public void setLb1(JLabel l1) {
		this.lb1 = l1;
	}

	public JButton getBt36() {
		return bt36;
	}

	public void setBt36(JButton bt36) {
		this.bt36 = bt36;
	}

	public JButton getBt0() {
		return bt0;
	}

	public void setBt0(JButton bt0) {
		this.bt0 = bt0;
	}

	public JButton getBt1() {
		return bt1;
	}

	public void setBt1(JButton bt1) {
		this.bt1 = bt1;
	}

	public JButton getBt2() {
		return bt2;
	}

	public void setBt2(JButton bt2) {
		this.bt2 = bt2;
	}

	public JButton getBt3() {
		return bt3;
	}

	public void setBt3(JButton bt3) {
		this.bt3 = bt3;
	}

	public JButton getBt4() {
		return bt4;
	}

	public void setBt4(JButton bt4) {
		this.bt4 = bt4;
	}

	public JButton getBt5() {
		return bt5;
	}

	public void setBt5(JButton bt5) {
		this.bt5 = bt5;
	}

	public JButton getBt6() {
		return bt6;
	}

	public void setBt6(JButton bt6) {
		this.bt6 = bt6;
	}

	public JButton getBt7() {
		return bt7;
	}

	public void setBt7(JButton bt7) {
		this.bt7 = bt7;
	}

	public JButton getBt8() {
		return bt8;
	}

	public void setBt8(JButton bt8) {
		this.bt8 = bt8;
	}

	public JButton getBt9() {
		return bt9;
	}

	public void setBt9(JButton bt9) {
		this.bt9 = bt9;
	}

	public JButton getBt10() {
		return bt10;
	}

	public void setBt10(JButton bt10) {
		this.bt10 = bt10;
	}

	public JButton getBt11() {
		return bt11;
	}

	public void setBt11(JButton bt11) {
		this.bt11 = bt11;
	}

	public JButton getBt12() {
		return bt12;
	}

	public void setBt12(JButton bt12) {
		this.bt12 = bt12;
	}

	public JButton getBt13() {
		return bt13;
	}

	public void setBt13(JButton bt13) {
		this.bt13 = bt13;
	}

	public JButton getBt14() {
		return bt14;
	}

	public void setBt14(JButton bt14) {
		this.bt14 = bt14;
	}

	public JButton getBt15() {
		return bt15;
	}

	public void setBt15(JButton bt15) {
		this.bt15 = bt15;
	}

	public JButton getBt16() {
		return bt16;
	}

	public void setBt16(JButton bt16) {
		this.bt16 = bt16;
	}

	public JButton getBt17() {
		return bt17;
	}

	public void setBt17(JButton bt17) {
		this.bt17 = bt17;
	}

	public JButton getBt18() {
		return bt18;
	}

	public void setBt18(JButton bt18) {
		this.bt18 = bt18;
	}

	public JButton getBt19() {
		return bt19;
	}

	public void setBt19(JButton bt19) {
		this.bt19 = bt19;
	}

	public JButton getBt20() {
		return bt20;
	}

	public void setBt20(JButton bt20) {
		this.bt20 = bt20;
	}

	public JButton getBt21() {
		return bt21;
	}

	public void setBt21(JButton bt21) {
		this.bt21 = bt21;
	}

	public JButton getBt22() {
		return bt22;
	}

	public void setBt22(JButton bt22) {
		this.bt22 = bt22;
	}

	public JButton getBt23() {
		return bt23;
	}

	public void setBt23(JButton bt23) {
		this.bt23 = bt23;
	}

	public JButton getBt24() {
		return bt24;
	}

	public void setBt24(JButton bt24) {
		this.bt24 = bt24;
	}

	public JButton getBt25() {
		return bt25;
	}

	public void setBt25(JButton bt25) {
		this.bt25 = bt25;
	}

	public JButton getBt26() {
		return bt26;
	}

	public void setBt26(JButton bt26) {
		this.bt26 = bt26;
	}

	public JButton getBt27() {
		return bt27;
	}

	public void setBt27(JButton bt27) {
		this.bt27 = bt27;
	}

	public JButton getBt28() {
		return bt28;
	}

	public void setBt28(JButton bt28) {
		this.bt28 = bt28;
	}

	public JButton getBt29() {
		return bt29;
	}

	public void setBt29(JButton bt29) {
		this.bt29 = bt29;
	}

	public JButton getBt30() {
		return bt30;
	}

	public void setBt30(JButton bt30) {
		this.bt30 = bt30;
	}

	public JButton getBt31() {
		return bt31;
	}

	public void setBt31(JButton bt31) {
		this.bt31 = bt31;
	}

	public JButton getBt32() {
		return bt32;
	}

	public void setBt32(JButton bt32) {
		this.bt32 = bt32;
	}

	public JButton getBt33() {
		return bt33;
	}

	public void setBt33(JButton bt33) {
		this.bt33 = bt33;
	}

	public JButton getBt34() {
		return bt34;
	}

	public void setBt34(JButton bt34) {
		this.bt34 = bt34;
	}

	public JButton getBt35() {
		return bt35;
	}

	public void setBt35(JButton bt35) {
		this.bt35 = bt35;
	}

	public JButton getBtBlack() {
		return btBlack;
	}

	public void setBtBlack(JButton btBlack) {
		this.btBlack = btBlack;
	}

	public JButton getBtRed() {
		return btRed;
	}

	public void setBtRed(JButton btRed) {
		this.btRed = btRed;
	}
}
