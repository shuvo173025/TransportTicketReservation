import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BillSection extends JFrame{
	private Container container;
	
	private JLabel namelabel;
	private JLabel timelabel;
	private JLabel datelabel;
	private JLabel fromlabel;
	private JLabel tolabel;
	private JLabel quantitylabel;
	private JLabel seatnamelabel;
	private JLabel billlabel;
	
	private JTextField namefield;
	private JTextField timefield;
	private JTextField datefield;
	private JTextField fromfield;
	private JTextField tofield;
	private JTextField quantityfield;
	private JTextField seatnamefield,seatnamefield1,seatnamefield2,seatnamefield3,seatnamefield4;
	private JTextField billfield;
	
	private JButton exitbutton;
	
	
	public BillSection() {
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 450, 550);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		backgroundcolour(); 
		label();
		textfield();
		button();	
	}

	
	
	private void label() {
		namelabel = new JLabel("Name : ");
		setLayout(null);
		namelabel.setBounds(20, 50, 80, 25);
		namelabel.setForeground(Color.yellow);
		namelabel.setBackground(Color.blue);
		namelabel.setOpaque(true);
		namelabel.setHorizontalAlignment(JLabel.LEFT);
		add(namelabel);
		
		timelabel = new JLabel("Time: ");
		setLayout(null);
		timelabel.setBounds(20, 85, 80, 25);
		timelabel.setForeground(Color.yellow);
		timelabel.setBackground(Color.blue);
		timelabel.setOpaque(true);
		timelabel.setHorizontalAlignment(JLabel.LEFT);
		add(timelabel);
		
		datelabel = new JLabel("Date: ");
		setLayout(null);
		datelabel.setBounds(20, 120, 80, 25);
		datelabel.setForeground(Color.yellow);
		datelabel.setBackground(Color.blue);
		datelabel.setOpaque(true);
		datelabel.setHorizontalAlignment(JLabel.LEFT);
		add(datelabel);
		
		fromlabel = new JLabel("From: ");
		setLayout(null);
		fromlabel.setBounds(20, 155, 80, 25);
		fromlabel.setForeground(Color.yellow);
		fromlabel.setBackground(Color.blue);
		fromlabel.setOpaque(true);
		fromlabel.setHorizontalAlignment(JLabel.LEFT);
		add(fromlabel);
		
		tolabel = new JLabel("To: ");
		setLayout(null);
		tolabel.setBounds(20, 190, 80, 25);
		tolabel.setForeground(Color.yellow);
		tolabel.setBackground(Color.blue);
		tolabel.setOpaque(true);
		tolabel.setHorizontalAlignment(JLabel.LEFT);
		add(tolabel);
		
		quantitylabel = new JLabel("Quantity: ");
		setLayout(null);
		quantitylabel.setBounds(20, 225, 80, 25);
		quantitylabel.setForeground(Color.yellow);
		quantitylabel.setBackground(Color.blue);
		quantitylabel.setOpaque(true);
		quantitylabel.setHorizontalAlignment(JLabel.LEFT);
		add(quantitylabel);
		
		seatnamelabel = new JLabel("Seat Name : ");
		setLayout(null);
		seatnamelabel.setBounds(20, 295, 80, 25);
		seatnamelabel.setForeground(Color.yellow);
		seatnamelabel.setBackground(Color.blue);
		seatnamelabel.setOpaque(true);
		seatnamelabel.setHorizontalAlignment(JLabel.LEFT);
		add(seatnamelabel);
		
		billlabel = new JLabel("Bill: ");
		setLayout(null);
		billlabel.setBounds(20, 260, 80, 25);
		billlabel.setForeground(Color.yellow);
		billlabel.setBackground(Color.blue);
		billlabel.setOpaque(true);
		billlabel.setHorizontalAlignment(JLabel.LEFT);
		add(billlabel);
		
	}



	private void textfield() {
		namefield = new JTextField();
		namefield.setBounds(105, 50, 150, 25);
		namefield.setForeground(Color.BLACK);
		namefield.setBackground(Color.white);
		namefield.setHorizontalAlignment(JTextField.CENTER);
		namefield.setEditable(false);
		add(namefield);
		
		timefield = new JTextField();
		timefield.setBounds(105, 85, 150, 25);
		timefield.setForeground(Color.BLACK);
		timefield.setBackground(Color.white);
		timefield.setHorizontalAlignment(JTextField.CENTER);
		timefield.setEditable(false);
		add(timefield);
		
		datefield = new JTextField();
		datefield.setBounds(105, 120, 150, 25);
		datefield.setForeground(Color.BLACK);
		datefield.setBackground(Color.white);
		datefield.setHorizontalAlignment(JTextField.CENTER);
		datefield.setEditable(false);
		add(datefield);
		
		fromfield = new JTextField();
		fromfield.setBounds(105, 155, 150, 25);
		fromfield.setForeground(Color.BLACK);
		fromfield.setBackground(Color.white);
		fromfield.setHorizontalAlignment(JTextField.CENTER);
		fromfield.setEditable(false);
		add(fromfield);
		
		tofield = new JTextField();
		tofield.setBounds(105, 190, 150, 25);
		tofield.setForeground(Color.BLACK);
		tofield.setBackground(Color.white);
		tofield.setHorizontalAlignment(JTextField.CENTER);
		tofield.setEditable(false);
		add(tofield);
		
		quantityfield = new JTextField();
		quantityfield.setBounds(105, 225, 150, 25);
		quantityfield.setForeground(Color.BLACK);
		quantityfield.setBackground(Color.WHITE);
		quantityfield.setHorizontalAlignment(JTextField.CENTER);
		quantityfield.setEditable(false);
		add(quantityfield);
		
		billfield = new JTextField();
		billfield.setBounds(105, 260, 150, 25);
		billfield.setForeground(Color.BLACK);
		billfield.setBackground(Color.WHITE);
		billfield.setHorizontalAlignment(JTextField.CENTER);
		billfield.setEditable(false);
		add(billfield);
		
		seatnamefield = new JTextField();
		seatnamefield.setBounds(105, 295, 150, 25);
		seatnamefield.setForeground(Color.BLACK);
		seatnamefield.setBackground(Color.WHITE);
		seatnamefield.setHorizontalAlignment(JTextField.CENTER);
		seatnamefield.setEditable(false);
		add(seatnamefield);
		
		seatnamefield1 = new JTextField();
		seatnamefield1.setBounds(20, 330, 150, 25);
		seatnamefield1.setForeground(Color.BLACK);
		seatnamefield1.setBackground(Color.WHITE);
		seatnamefield1.setHorizontalAlignment(JTextField.CENTER);
		seatnamefield1.setEditable(false);
		add(seatnamefield1);
		
		seatnamefield2 = new JTextField();
		seatnamefield2.setBounds(190, 330, 150, 25);
		seatnamefield2.setForeground(Color.BLACK);
		seatnamefield2.setBackground(Color.WHITE);
		seatnamefield2.setHorizontalAlignment(JTextField.CENTER);
		seatnamefield2.setEditable(false);
		add(seatnamefield2);
		
		seatnamefield3 = new JTextField();
		seatnamefield3.setBounds(20, 365, 150, 25);
		seatnamefield3.setForeground(Color.BLACK);
		seatnamefield3.setBackground(Color.WHITE);
		seatnamefield3.setHorizontalAlignment(JTextField.CENTER);
		seatnamefield3.setEditable(false);
		add(seatnamefield3);
		
		seatnamefield4 = new JTextField();
		seatnamefield4.setBounds(190, 365, 150, 25);
		seatnamefield4.setForeground(Color.BLACK);
		seatnamefield4.setBackground(Color.WHITE);
		seatnamefield4.setHorizontalAlignment(JTextField.CENTER);
		seatnamefield4.setEditable(false);
		add(seatnamefield4);
		
	}



	private void button() {
		exitbutton = new JButton("Exit"); 
		exitbutton.setBounds(150, 450, 100, 60);
		exitbutton.setBackground(Color.RED);
		exitbutton.setForeground(Color.white);
		exitbutton.setHorizontalAlignment(JTextField.CENTER);
		add(exitbutton);
		
		
		
		exitbutton.addActionListener(e->{
			dispose();
		});
	}
	

	public void backgroundcolour() {
		container = this.getContentPane();
		container.setBackground(Color.BLUE);
	}
	
	
	
	public static void main(String[] args) {
		BillSection a = new BillSection();
		a.setVisible(true);

	}

}
