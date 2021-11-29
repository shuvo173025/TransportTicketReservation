import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class advancebooking extends JFrame{
	private Container container;
	private String[] classBTA= {"First Class","business","Economy"};
	
	private JLabel datelabel;
	private JLabel Fromlabel;
	private JLabel tolabel;
	private JLabel timelabel;
	private JLabel classlabel;
	private JLabel namelabel;
	private JLabel phonelabel;
	private JLabel quantitylabel;
	private JLabel seatnamelabel;
	
	private JTextField datefield;
	private JTextField fromfield;
	private JTextField tofield;
	private JTextField timefield;
	private JComboBox classbox;
	private JTextField namefield;
	private JTextField phonefield;
	private JTextField quantityfield;
	private JTextField seatnamefield,seatnamefield1,seatnamefield2,seatnamefield3,seatnamefield4;
	
	private JButton backbutton;
	private JButton confirmbutton;
	
	private JRadioButton bus;
	private JRadioButton train;
	private JRadioButton air;
	private ButtonGroup group;
	public String Catagory;
	
	
	
	
	
	public advancebooking() {
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 450, 550);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		backgroundcolour(); 
		label();
		textfield();
		button();	
		actionlistener();
		radiobutton();
	}
	
	
	private void radiobutton() {
		group = new ButtonGroup();
		Handler handler= new Handler();
		
		bus = new JRadioButton("Bus");
		bus.setBounds(50, 15, 50, 25);
		bus.setBackground(Color.BLUE);
		bus.setForeground(Color.YELLOW);
		bus.addActionListener(handler);
		add(bus);
		group.add(bus);
		
		train = new JRadioButton("Train");
		train.setBounds(120, 15, 80, 25);
		train.setBackground(Color.BLUE);
		train.setForeground(Color.YELLOW);
		train.addActionListener(handler);
		add(train);
		group.add(train);
		
		air = new JRadioButton("Air");
		air.setBounds(200, 15, 50, 25);
		air.setBackground(Color.BLUE);
		air.setForeground(Color.YELLOW);
		air.addActionListener(handler);
		add(air);
		group.add(air);
		
	}
	
	class Handler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==bus) {
				Catagory = "Bus";
			}
			if(e.getSource()==train) {
				Catagory = "Train";
			}
			if(e.getSource()==air) {
				Catagory = "Air";
			}
		}	
	}
	
	

	private void label() {
		datelabel = new JLabel("Date : ");
		setLayout(null);
		datelabel.setBounds(20, 50, 80, 25);
		datelabel.setForeground(Color.yellow);
		datelabel.setBackground(Color.blue);
		datelabel.setOpaque(true);
		datelabel.setHorizontalAlignment(JLabel.LEFT);
		add(datelabel);
		
		Fromlabel = new JLabel("From: ");
		setLayout(null);
		Fromlabel.setBounds(20, 85, 80, 25);
		Fromlabel.setForeground(Color.yellow);
		Fromlabel.setBackground(Color.blue);
		Fromlabel.setOpaque(true);
		Fromlabel.setHorizontalAlignment(JLabel.LEFT);
		add(Fromlabel);
		
		tolabel = new JLabel("To: ");
		setLayout(null);
		tolabel.setBounds(20, 120, 80, 25);
		tolabel.setForeground(Color.yellow);
		tolabel.setBackground(Color.blue);
		tolabel.setOpaque(true);
		tolabel.setHorizontalAlignment(JLabel.LEFT);
		add(tolabel);
		
		timelabel = new JLabel("Time: ");
		setLayout(null);
		timelabel.setBounds(20, 155, 80, 25);
		timelabel.setForeground(Color.yellow);
		timelabel.setBackground(Color.blue);
		timelabel.setOpaque(true);
		timelabel.setHorizontalAlignment(JLabel.LEFT);
		add(timelabel);
		
		classlabel = new JLabel("Class: ");
		setLayout(null);
		classlabel.setBounds(20, 190, 80, 25);
		classlabel.setForeground(Color.yellow);
		classlabel.setBackground(Color.blue);
		classlabel.setOpaque(true);
		classlabel.setHorizontalAlignment(JLabel.LEFT);
		add(classlabel);
		
		namelabel = new JLabel("Name: ");
		setLayout(null);
		namelabel.setBounds(20, 225, 80, 25);
		namelabel.setForeground(Color.yellow);
		namelabel.setBackground(Color.blue);
		namelabel.setOpaque(true);
		namelabel.setHorizontalAlignment(JLabel.LEFT);
		add(namelabel);
		
		phonelabel = new JLabel("Phone No : ");
		setLayout(null);
		phonelabel.setBounds(20, 260, 80, 25);
		phonelabel.setForeground(Color.yellow);
		phonelabel.setBackground(Color.blue);
		phonelabel.setOpaque(true);
		phonelabel.setHorizontalAlignment(JLabel.LEFT);
		add(phonelabel);
		
		quantitylabel = new JLabel("Quantity: ");
		setLayout(null);
		quantitylabel.setBounds(20, 295, 80, 25);
		quantitylabel.setForeground(Color.yellow);
		quantitylabel.setBackground(Color.blue);
		quantitylabel.setOpaque(true);
		quantitylabel.setHorizontalAlignment(JLabel.LEFT);
		add(quantitylabel);
		
		seatnamelabel = new JLabel("Seat Name: ");
		setLayout(null);
		seatnamelabel.setBounds(20, 330, 80, 25);
		seatnamelabel.setForeground(Color.yellow);
		seatnamelabel.setBackground(Color.blue);
		seatnamelabel.setOpaque(true);
		seatnamelabel.setHorizontalAlignment(JLabel.LEFT);
		add(seatnamelabel);
	}


	
	private void textfield() {
		datefield = new JTextField();
		datefield.setBounds(105, 50, 150, 25);
		datefield.setForeground(Color.BLACK);
		datefield.setBackground(Color.white);
		datefield.setHorizontalAlignment(JTextField.CENTER);
		add(datefield);
		
		fromfield = new JTextField();
		fromfield.setBounds(105, 85, 150, 25);
		fromfield.setForeground(Color.BLACK);
		fromfield.setBackground(Color.white);
		fromfield.setHorizontalAlignment(JTextField.CENTER);
		add(fromfield);
		
		tofield = new JTextField();
		tofield.setBounds(105, 120, 150, 25);
		tofield.setForeground(Color.BLACK);
		tofield.setBackground(Color.white);
		tofield.setHorizontalAlignment(JTextField.CENTER);
		add(tofield);
		
		timefield = new JTextField();
		timefield.setBounds(105, 155, 150, 25);
		timefield.setForeground(Color.BLACK);
		timefield.setBackground(Color.white);
		timefield.setHorizontalAlignment(JTextField.CENTER);
		add(timefield);
		
		classbox = new JComboBox(classBTA);
		classbox.setBounds(105, 190, 150, 25);
		classbox.setForeground(Color.BLACK);
		classbox.setBackground(Color.white);
		add(classbox);
		
		namefield = new JTextField();
		namefield.setBounds(105, 225, 150, 25);
		namefield.setForeground(Color.BLACK);
		namefield.setBackground(Color.white);
		namefield.setHorizontalAlignment(JTextField.CENTER);
		add(namefield);
		
		phonefield = new JTextField();
		phonefield.setBounds(105, 260, 150, 25);
		phonefield.setForeground(Color.BLACK);
		phonefield.setBackground(Color.WHITE);
		phonefield.setHorizontalAlignment(JTextField.CENTER);
		add(phonefield);
		
		quantityfield = new JTextField();
		quantityfield.setBounds(105, 295, 150, 25);
		quantityfield.setForeground(Color.BLACK);
		quantityfield.setBackground(Color.WHITE);
		quantityfield.setHorizontalAlignment(JTextField.CENTER);
		add(quantityfield);
		
		seatnamefield = new JTextField();
		seatnamefield.setBounds(105, 330, 150, 25);
		seatnamefield.setForeground(Color.BLACK);
		seatnamefield.setBackground(Color.WHITE);
		seatnamefield.setHorizontalAlignment(JTextField.CENTER);
		add(seatnamefield);
		
		seatnamefield1 = new JTextField();
		seatnamefield1.setBounds(20, 365, 150, 25);
		seatnamefield1.setForeground(Color.BLACK);
		seatnamefield1.setBackground(Color.WHITE);
		seatnamefield1.setHorizontalAlignment(JTextField.CENTER);
		add(seatnamefield1);
		
		seatnamefield2 = new JTextField();
		seatnamefield2.setBounds(190, 365, 150, 25);
		seatnamefield2.setForeground(Color.BLACK);
		seatnamefield2.setBackground(Color.WHITE);
		seatnamefield2.setHorizontalAlignment(JTextField.CENTER);
		add(seatnamefield2);
		
		seatnamefield3 = new JTextField();
		seatnamefield3.setBounds(20, 400, 150, 25);
		seatnamefield3.setForeground(Color.BLACK);
		seatnamefield3.setBackground(Color.WHITE);
		seatnamefield3.setHorizontalAlignment(JTextField.CENTER);
		add(seatnamefield3);
		
		seatnamefield4 = new JTextField();
		seatnamefield4.setBounds(190, 400, 150, 25);
		seatnamefield4.setForeground(Color.BLACK);
		seatnamefield4.setBackground(Color.WHITE);
		seatnamefield4.setHorizontalAlignment(JTextField.CENTER);
		add(seatnamefield4);
		
	}

	
	
	private void button() {
		backbutton = new JButton("Back"); 
		backbutton.setBounds(20, 480, 80, 25);
		backbutton.setBackground(Color.GREEN);
		backbutton.setForeground(Color.red);
		backbutton.setHorizontalAlignment(JTextField.CENTER);
		add(backbutton);
		
		confirmbutton = new JButton("Confirm"); 
		confirmbutton.setBounds(350, 480, 80, 25);
		confirmbutton.setBackground(Color.GREEN);
		confirmbutton.setForeground(Color.red);
		confirmbutton.setHorizontalAlignment(JTextField.CENTER);
		add(confirmbutton);
		
	}
	
	

	private void actionlistener() {
		backbutton.addActionListener(e->{
			schedulePage a = new schedulePage("","","","");
			a.setLayout(null);
			a.setVisible(true);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setBounds(0, 0, 1000, 500);
			a.setResizable(false);
			a.setLocationRelativeTo(null);
			dispose();
		});
		confirmbutton.addActionListener(e->{
			
			
			String Date = datefield.getText();
			String From = fromfield.getText();
			String To = tofield.getText();
			String Time = timefield.getText();
			String Clas = classbox.getSelectedItem().toString();
			String Name = namefield.getText();
			String PhoneNo = phonefield.getText();
			String Quantity = quantityfield.getText();
			String SeatName = seatnamefield.getText();
			String SeatName1 = seatnamefield1.getText();
			String SeatName2 = seatnamefield2.getText();
			String SeatName3 = seatnamefield3.getText();
			String SeatName4 = seatnamefield4.getText();
			
			DataBase DB = new DataBase();
			DB.insertAdvancebooking(Catagory,Date,From,To,Time,Clas,Name,PhoneNo,Quantity,SeatName, SeatName1,SeatName2,SeatName3,SeatName4);
			advancebooking a = new advancebooking();
			a.setVisible(true);
			dispose();
		});
	}

	
	
	public void backgroundcolour() {
		container = this.getContentPane();
		container.setBackground(Color.BLUE);
	}
	
	
	
	public static void main(String[] args) {
		advancebooking a = new advancebooking();
		a.setVisible(true);
	}

}
