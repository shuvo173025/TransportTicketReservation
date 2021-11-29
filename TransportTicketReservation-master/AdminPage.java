import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AdminPage  extends JFrame {
	private Container container;
	private String[] classBTA= {"First Class","business","Economy"};
	
	private JCheckBox Driver,superviser,A1,A2,A3,A4;
	private JCheckBox B1,B2,B3,B4;
	private JCheckBox C1,C2,C3,C4;
	private JCheckBox D1,D2,D3,D4;
	private JCheckBox E1,E2,E3,E4;
	private JCheckBox F1,F2,F3,F4;
	private JCheckBox G1,G2,G3,G4;
	private JCheckBox H1,H2,H3,H4;
	private JCheckBox I1,I2,I3,I4,I5;
	
	private JTable scheduletable;
	private DefaultTableModel model;
	private String[] colums = {"Bus Name","Bus No","Time","Date","From","To"};
	private String[] rows = new String[6];
	
	private JTable advancebooking;
	private DefaultTableModel model2;
	private String[] colum = {"Name","Quantity","Time","Date","From","To"};
	private String[] row = new String[6];
	
	private JLabel datelabel;
	private JLabel busnamelabel;
	private JLabel busnolabel;
	private JLabel fromlabel;
	private JLabel tolabel;
	private JLabel timelabel;
	private JLabel capacitylabel;
	private JLabel farecastlabel;
	private JLabel classlabel;
	
	private JTextField datefield;
	private JTextField busnamefield;
	private JTextField busnofield;
	private JTextField fromfield;
	private JTextField tofield;
	private JTextField timefield;
	private JTextField capacityfield;
	private JTextField farecastfield;
	private JComboBox classbox;
	
	private JButton Backbutton;
	private JButton addbutton;
	private JButton cheakbutton;
	private JButton usermessagesbutton;
	
	private JPanel panelA;
	private JPanel panelB;
	private JPanel panelC;
	
	private JRadioButton bus;
	private JRadioButton train;
	private JRadioButton air;
	private ButtonGroup group;
	public String Catagory;
	
	public String a1="0",a2="0",a3="0",a4="0";
	public String b1="0",b2="0",b3="0",b4="0";
	public String c1="0",c2="0",c3="0",c4="0";
	public String d1="0",d2="0",d3="0",d4="0";
	public String e1="0",e2="0",e3="0",e4="0";
	public String f1="0",f2="0",f3="0",f4="0";
	public String g1="0",g2="0",g3="0",g4="0";
	public String h1="0",h2="0",h3="0",h4="0";
	public String i1="0",i2="0",i3="0",i4="0",i5="0";
	public String driver="0",superViser="0";
	
	
		public AdminPage() {
		
		super("Companny");
		backgroundcolour();
		label();
		textfield();
		button();
		actionlistener();
		panelA();
		panelB();
		panelC();
		radiobutton();
		
	}
		
		
		private void radiobutton() {
			group = new ButtonGroup();
			
			bus = new JRadioButton("Bus");
			bus.setBounds(50, 330, 50, 25);
			bus.setBackground(Color.BLUE);
			bus.setForeground(Color.YELLOW);
			add(bus);
			group.add(bus);
			
			train = new JRadioButton("Train");
			train.setBounds(120, 330, 80, 25);
			train.setBackground(Color.BLUE);
			train.setForeground(Color.YELLOW);
			add(train);
			group.add(train);
			
			air = new JRadioButton("Air");
			air.setBounds(200, 330, 50, 25);
			air.setBackground(Color.BLUE);
			air.setForeground(Color.YELLOW);
			add(air);
			group.add(air);
			Handler handler = new Handler();
			bus.addActionListener(handler);
			train.addActionListener(handler);
			air.addActionListener(handler);
			
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
		



	private void panelB() {
		panelB = new JPanel();
		panelB.setLayout(null);
		panelB.setBounds(320, 0, 400, 500);
		panelB.setBackground(Color.blue);
		panelB.setVisible(false);
		add(panelB);
		
		advancebooking = new JTable();
		model2 = new DefaultTableModel();
		model2.setColumnIdentifiers(colum);	
		advancebooking.setModel(model2);
		 JScrollPane scroll = new JScrollPane(advancebooking);
	        scroll.setHorizontalScrollBarPolicy(
	        		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        scroll.setVerticalScrollBarPolicy(
	                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	        advancebooking.setRowHeight(30);
	        scroll.setBounds(0, 0, 400, 500);
	        scroll.setOpaque(true);
	        advancebooking.setOpaque(true);
	        scroll.setBackground(Color.WHITE);
	        advancebooking.setBackground(Color.WHITE);
	        panelB.add(scroll);
	        
	}



	private void panelC() {
			
		panelC = new JPanel();
		panelC.setLayout(null);
		panelC.setBounds(720, 0, 300, 500);
		panelC.setBackground(Color.blue);
		add(panelC);
		
		Driver = new JCheckBox("Driver");
		Driver.setBounds(230,50,60,25);
		Driver.setBackground(Color.blue);
		Driver.setForeground(Color.YELLOW);
		panelC.add(Driver);
		
		superviser = new JCheckBox("superviser");
		superviser.setBounds(20,90,100,25);
		superviser.setBackground(Color.blue);
		superviser.setForeground(Color.YELLOW);
		panelC.add(superviser);
		
		A1 = new JCheckBox("A1");
		A1.setBounds(20,130,40,20);
		A1.setBackground(Color.blue);
		A1.setForeground(Color.YELLOW);
		panelC.add(A1);
		
		A2 = new JCheckBox("A2");
		A2.setBounds(80,130,40,20);
		A2.setBackground(Color.blue);
		A2.setForeground(Color.YELLOW);
		panelC.add(A2);
		
		A3 = new JCheckBox("A3");
		A3.setBounds(180,130,40,20);
		A3.setBackground(Color.blue);
		A3.setForeground(Color.YELLOW);
		panelC.add(A3);
		
		A4 = new JCheckBox("A4");
		A4.setBounds(240,130,40,20);
		A4.setBackground(Color.blue);
		A4.setForeground(Color.YELLOW);
		panelC.add(A4);
		
		B1 = new JCheckBox("B1");
		B1.setBounds(20,165,40,20);
		B1.setBackground(Color.blue);
		B1.setForeground(Color.YELLOW);
		panelC.add(B1);
		
		B2 = new JCheckBox("B2");
		B2.setBounds(80,165,40,20);
		B2.setBackground(Color.blue);
		B2.setForeground(Color.YELLOW);
		panelC.add(B2);
		
		B3 = new JCheckBox("B3");
		B3.setBounds(180,165,40,20);
		B3.setBackground(Color.blue);
		B3.setForeground(Color.YELLOW);
		panelC.add(B3);
		
		B4 = new JCheckBox("B4");
		B4.setBounds(240,165,40,20);
		B4.setBackground(Color.blue);
		B4.setForeground(Color.YELLOW);
		panelC.add(B4);
		
		C1 = new JCheckBox("C1");
		C1.setBounds(20,200,40,20);
		C1.setBackground(Color.blue);
		C1.setForeground(Color.YELLOW);
		panelC.add(C1);
		
		C2 = new JCheckBox("C2");
		C2.setBounds(80,200,40,20);
		C2.setBackground(Color.blue);
		C2.setForeground(Color.YELLOW);
		panelC.add(C2);
		
		C3 = new JCheckBox("C3");
		C3.setBounds(180,200,40,20);
		C3.setBackground(Color.blue);
		C3.setForeground(Color.YELLOW);
		panelC.add(C3);
		
		C4 = new JCheckBox("C4");
		C4.setBounds(240,200,40,20);
		C4.setBackground(Color.blue);
		C4.setForeground(Color.YELLOW);
		panelC.add(C4);
		
		D1 = new JCheckBox("D1");
		D1.setBounds(20,235,40,20);
		D1.setBackground(Color.blue);
		D1.setForeground(Color.YELLOW);
		panelC.add(D1);
		
		D2 = new JCheckBox("D2");
		D2.setBounds(80,235,40,20);
		D2.setBackground(Color.blue);
		D2.setForeground(Color.YELLOW);
		panelC.add(D2);
		
		D3 = new JCheckBox("D3");
		D3.setBounds(180,235,40,20);
		D3.setBackground(Color.blue);
		D3.setForeground(Color.YELLOW);
		panelC.add(D3);
		
		D4 = new JCheckBox("D4");
		D4.setBounds(240,235,40,20);
		D4.setBackground(Color.blue);
		D4.setForeground(Color.YELLOW);
		panelC.add(D4);
		
		E1 = new JCheckBox("E1");
		E1.setBounds(20,270,40,20);
		E1.setBackground(Color.blue);
		E1.setForeground(Color.YELLOW);
		panelC.add(E1);
		
		E2 = new JCheckBox("E2");
		E2.setBounds(80,270,40,20);
		E2.setBackground(Color.blue);
		E2.setForeground(Color.YELLOW);
		panelC.add(E2);
		
		E3 = new JCheckBox("E3");
		E3.setBounds(180,270,40,20);
		E3.setBackground(Color.blue);
		E3.setForeground(Color.YELLOW);
		panelC.add(E3);
		
		E4 = new JCheckBox("E4");
		E4.setBounds(240,270,40,20);
		E4.setBackground(Color.blue);
		E4.setForeground(Color.YELLOW);
		panelC.add(E4);
		
		F1 = new JCheckBox("F1");
		F1.setBounds(20,305,40,20);
		F1.setBackground(Color.blue);
		F1.setForeground(Color.YELLOW);
		panelC.add(F1);
		
		F2 = new JCheckBox("F2");
		F2.setBounds(80,305,40,20);
		F2.setBackground(Color.blue);
		F2.setForeground(Color.YELLOW);
		panelC.add(F2);
		
		F3 = new JCheckBox("F3");
		F3.setBounds(180,305,40,20);
		F3.setBackground(Color.blue);
		F3.setForeground(Color.YELLOW);
		panelC.add(F3);
		
		F4 = new JCheckBox("F4");
		F4.setBounds(240,305,40,20);
		F4.setBackground(Color.blue);
		F4.setForeground(Color.YELLOW);
		panelC.add(F4);
		
		G1 = new JCheckBox("G1");
		G1.setBounds(20,340,40,20);
		G1.setBackground(Color.blue);
		G1.setForeground(Color.YELLOW);
		panelC.add(G1);
		
		G2 = new JCheckBox("G2");
		G2.setBounds(80,340,40,20);
		G2.setBackground(Color.blue);
		G2.setForeground(Color.YELLOW);
		panelC.add(G2);
		
		G3 = new JCheckBox("G3");
		G3.setBounds(180,340,40,20);
		G3.setBackground(Color.blue);
		G3.setForeground(Color.YELLOW);
		panelC.add(G3);
		
		G4 = new JCheckBox("G4");
		G4.setBounds(240,340,40,20);
		G4.setBackground(Color.blue);
		G4.setForeground(Color.YELLOW);
		panelC.add(G4);
		
		H1 = new JCheckBox("H1");
		H1.setBounds(20,375,40,20);
		H1.setBackground(Color.blue);
		H1.setForeground(Color.YELLOW);
		panelC.add(H1);
		
		H2 = new JCheckBox("H2");
		H2.setBounds(80,375,40,20);
		H2.setBackground(Color.blue);
		H2.setForeground(Color.YELLOW);
		panelC.add(H2);
		
		H3 = new JCheckBox("H3");
		H3.setBounds(180,375,40,20);
		H3.setBackground(Color.blue);
		H3.setForeground(Color.YELLOW);
		panelC.add(H3);
		
		H4 = new JCheckBox("H4");
		H4.setBounds(240,375,40,20);
		H4.setBackground(Color.blue);
		H4.setForeground(Color.YELLOW);
		panelC.add(H4);
		
		I1 = new JCheckBox("I1");
		I1.setBounds(20,410,40,20);
		I1.setBackground(Color.blue);
		I1.setForeground(Color.YELLOW);
		panelC.add(I1);
		
		I2 = new JCheckBox("I2");
		I2.setBounds(80,410,40,20);
		I2.setBackground(Color.blue);
		I2.setForeground(Color.YELLOW);
		panelC.add(I2);
		
		I3 = new JCheckBox("I3");
		I3.setBounds(180,410,40,20);
		I3.setBackground(Color.blue);
		I3.setForeground(Color.YELLOW);
		panelC.add(I3);
		
		I4 = new JCheckBox("I4");
		I4.setBounds(240,410,40,20);
		I4.setBackground(Color.blue);
		I4.setForeground(Color.YELLOW);
		panelC.add(I4);
		
		I5 = new JCheckBox("I5");
		I5.setBounds(130,410,40,20);
		I5.setBackground(Color.blue);
		I5.setForeground(Color.YELLOW);
		panelC.add(I5);
		
		Handler1 hendler = new Handler1();
		Driver.addActionListener(hendler);
		superviser.addActionListener(hendler);
		
		A1.addActionListener(hendler);
		A2.addActionListener(hendler);
		A3.addActionListener(hendler);
		A4.addActionListener(hendler);
		
		B1.addActionListener(hendler);
		B2.addActionListener(hendler);
		B3.addActionListener(hendler);
		B4.addActionListener(hendler);
		
		C1.addActionListener(hendler);
		C2.addActionListener(hendler);
		C3.addActionListener(hendler);
		C4.addActionListener(hendler);
		
		D1.addActionListener(hendler);
		D2.addActionListener(hendler);
		D3.addActionListener(hendler);
		D4.addActionListener(hendler);
		
		E1.addActionListener(hendler);
		E2.addActionListener(hendler);
		E3.addActionListener(hendler);
		E4.addActionListener(hendler);
		
		F1.addActionListener(hendler);
		F2.addActionListener(hendler);
		F3.addActionListener(hendler);
		F4.addActionListener(hendler);
		
		G1.addActionListener(hendler);
		G2.addActionListener(hendler);
		G3.addActionListener(hendler);
		G4.addActionListener(hendler);
		
		H1.addActionListener(hendler);
		H2.addActionListener(hendler);
		H3.addActionListener(hendler);
		H4.addActionListener(hendler);
		
		I1.addActionListener(hendler);
		I2.addActionListener(hendler);
		I3.addActionListener(hendler);
		I4.addActionListener(hendler);
		I5.addActionListener(hendler);
		
	}
	
	
	class Handler1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==Driver) {
				driver = "1";
			}
			if(e.getSource()==superviser) {
				superViser = "1";
			}
			
			if(e.getSource()==A1) {
				a1 = "1";
			}
			if(e.getSource()==A2) {
				a2 = "1";
			}
			if(e.getSource()==A3) {
				a3 = "1";
			}
			if(e.getSource()==A4) {
				a4 = "1";
			}
			
			if(e.getSource()==B1) {
				b1 = "1";
			}
			if(e.getSource()==B2) {
				b2 = "1";
			}
			if(e.getSource()==B3) {
				b3 = "1";
			}
			if(e.getSource()==B4) {
				b4 = "1";
			}
			
			if(e.getSource()==C1) {
				c1 = "1";
			}
			if(e.getSource()==C2) {
				c2 = "1";
			}
			if(e.getSource()==C3) {
				c3 = "1";
			}
			if(e.getSource()==C4) {
				c4 = "1";
			}
			
			if(e.getSource()==D1) {
				d1 = "1";
			}
			if(e.getSource()==D2) {
				d2 = "1";
			}
			if(e.getSource()==D3) {
				d3 = "1";
			}
			if(e.getSource()==D4) {
				d4 = "1";
			}
			
			if(e.getSource()==E1) {
				e1 = "1";
			}
			if(e.getSource()==E2) {
				e2 = "1";
			}
			if(e.getSource()==E3) {
				e3 = "1";
			}
			if(e.getSource()==E4) {
				e4 = "1";
			}
			
			if(e.getSource()==F1) {
				f1 = "1";
			}
			if(e.getSource()==F2) {
				f2 = "1";
			}
			if(e.getSource()==F3) {
				f3 = "1";
			}
			if(e.getSource()==F4) {
				f4 = "1";
			}
			
			if(e.getSource()==G1) {
				g1 = "1";	
			}
			if(e.getSource()==G2) {
				g2 = "1";
			}
			if(e.getSource()==G3) {
				g3 = "1";
			}
			if(e.getSource()==G4) {
				g4 = "1";
			}
			
			if(e.getSource()==H1) {
				h1 = "1";
			}
			if(e.getSource()==H2) {
				h2 = "1";
			}
			if(e.getSource()==H3) {
				h3 = "1";
			}
			if(e.getSource()==H4) {
				h4 = "1";
			}
			
			if(e.getSource()==I1) {
				i1 = "1";
			}
			if(e.getSource()==I2) {
				i2 = "1";
			}
			if(e.getSource()==I3) {
				i3 = "1";
			}
			if(e.getSource()==I4) {
				i4 = "1";
			}
			if(e.getSource()==I5) {
				i5 = "1";
			}
		}	
	}



	private void panelA() {
		panelA = new JPanel();
		panelA.setLayout(null);
		panelA.setBounds(320, 0, 400, 500);
		panelA.setBackground(Color.blue);
		panelA.setVisible(false);
		add(panelA);
		
		scheduletable = new JTable();
		model = new DefaultTableModel();
		model.setColumnIdentifiers(colums);	
		scheduletable.setModel(model);
		 JScrollPane scroll = new JScrollPane(scheduletable);
	        scroll.setHorizontalScrollBarPolicy(
	        		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        scroll.setVerticalScrollBarPolicy(
	                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	        scheduletable.setRowHeight(30);
	        scroll.setBounds(0, 0, 400, 500);
	        scroll.setOpaque(true);
	        scheduletable.setOpaque(true);
	        scroll.setBackground(Color.WHITE);
	        scheduletable.setBackground(Color.WHITE);
	        panelA.add(scroll);

	}



	private void button() {
		
		Backbutton = new JButton("Back"); 
		Backbutton.setBounds(20, 430, 80, 25);
		Backbutton.setBackground(Color.GREEN);
		Backbutton.setForeground(Color.red);
		Backbutton.setHorizontalAlignment(JTextField.CENTER);
		add(Backbutton);
		
		addbutton = new JButton("Add"); 
		addbutton.setBounds(150, 370, 80, 25);
		addbutton.setBackground(Color.GREEN);
		addbutton.setForeground(Color.red);
		addbutton.setHorizontalAlignment(JTextField.CENTER);
		add(addbutton);
		
		cheakbutton = new JButton("Cheak"); 
		cheakbutton.setBounds(50, 370, 80, 25);
		cheakbutton.setBackground(Color.GREEN);
		cheakbutton.setForeground(Color.red);
		cheakbutton.setHorizontalAlignment(JTextField.CENTER);
		add(cheakbutton);
		
		usermessagesbutton = new JButton("User Messages"); 
		usermessagesbutton.setBounds(150, 430, 150, 25);
		usermessagesbutton.setBackground(Color.GREEN);
		usermessagesbutton.setForeground(Color.red);
		usermessagesbutton.setHorizontalAlignment(JTextField.CENTER);
		add(usermessagesbutton);
		
	}


	
	
	private void actionlistener() {
	Backbutton.addActionListener(e->{
			FirstPage a = new FirstPage();
			a.setLayout(null);
			a.setVisible(true);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setBounds(0, 0, 300, 400);
			a.setResizable(false);
			a.setLocationRelativeTo(null);
			dispose();
		});
		
		
	cheakbutton.addActionListener(e->{
		panelA.setVisible(true);
		panelB.setVisible(false);
	});
	
	usermessagesbutton.addActionListener(e->{
		panelB.setVisible(true);
		panelA.setVisible(false);
	});
	
	addbutton.addActionListener(e->{
		String Date = datefield.getText();
		String BusName = busnamefield.getText();
		String BusNo = busnofield.getText();
		String From = fromfield.getText();
		String To = tofield.getText();
		String Time = timefield.getText();
		String Capacity = capacityfield.getText();
		String Fare = farecastfield.getText();
		String Clas = classbox.getSelectedItem().toString();
		
		DataBase DB = new DataBase();
		DB.insertSchedule(Date,BusName,BusNo,From,To,Time,Capacity,Fare,Clas,Catagory,driver,superViser,a1,a2,a3,a4,b1,b2,b3,b4,c1,
				c2,c3,c4,d1,d2,d3,d4,e1,e2,e3,e4,f1,f2,f3,f4,g1,g2,g3,g4,h1,h2,h3,h4,i1,i2,i3,i4,i5);
		AdminPage a = new AdminPage();
		a.setLayout(null);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setBounds(0, 0, 1035, 500);
		a.setResizable(false);
		a.setLocationRelativeTo(null);
		dispose();
	});
		
	}


	private void textfield() {
		
		datefield = new JTextField();
		datefield.setBounds(105, 15, 150, 25);
		datefield.setForeground(Color.BLACK);
		datefield.setBackground(Color.white);
		datefield.setHorizontalAlignment(JTextField.CENTER);
		add(datefield);
		
		busnamefield = new JTextField();
		busnamefield.setBounds(105, 50, 150, 25);
		busnamefield.setForeground(Color.BLACK);
		busnamefield.setBackground(Color.white);
		busnamefield.setHorizontalAlignment(JTextField.CENTER);
		add(busnamefield);
		
		busnofield = new JTextField();
		busnofield.setBounds(105, 85, 150, 25);
		busnofield.setForeground(Color.BLACK);
		busnofield.setBackground(Color.white);
		busnofield.setHorizontalAlignment(JTextField.CENTER);
		add(busnofield);
		
		fromfield = new JTextField();
		fromfield.setBounds(105, 120, 150, 25);
		fromfield.setForeground(Color.BLACK);
		fromfield.setBackground(Color.white);
		fromfield.setHorizontalAlignment(JTextField.CENTER);
		add(fromfield);
		
		tofield = new JTextField();
		tofield.setBounds(105, 155, 150, 25);
		tofield.setForeground(Color.BLACK);
		tofield.setBackground(Color.white);
		tofield.setHorizontalAlignment(JTextField.CENTER);
		add(tofield);
		
		
		timefield = new JTextField();
		timefield.setBounds(105, 190, 150, 25);
		timefield.setForeground(Color.BLACK);
		timefield.setBackground(Color.WHITE);
		timefield.setHorizontalAlignment(JTextField.CENTER);
		add(timefield);
		
		
		capacityfield = new JTextField();
		capacityfield.setBounds(105, 225, 150, 25);
		capacityfield.setForeground(Color.BLACK);
		capacityfield.setBackground(Color.WHITE);
		capacityfield.setHorizontalAlignment(JTextField.CENTER);
		add(capacityfield);
		
		farecastfield = new JTextField();
		farecastfield.setBounds(105, 260, 150, 25);
		farecastfield.setForeground(Color.BLACK);
		farecastfield.setBackground(Color.white);
		farecastfield.setHorizontalAlignment(JTextField.CENTER);
		add(farecastfield);
		
		classbox = new JComboBox(classBTA);
		classbox.setBounds(105, 295, 150, 25);
		classbox.setForeground(Color.BLACK);
		classbox.setBackground(Color.white);
		add(classbox);
	}



	private void label() {
		
		datelabel = new JLabel("Date: ");
		setLayout(null);
		datelabel.setBounds(20, 15, 80, 25);
		datelabel.setForeground(Color.yellow);
		datelabel.setBackground(Color.BLUE);
		datelabel.setOpaque(true);
		datelabel.setHorizontalAlignment(JLabel.LEFT);
		add(datelabel);
		
		busnamelabel = new JLabel("Bus Name: ");
		setLayout(null);
		busnamelabel.setBounds(20, 50, 80, 25);
		busnamelabel.setForeground(Color.yellow);
		busnamelabel.setBackground(Color.BLUE);
		busnamelabel.setOpaque(true);
		busnamelabel.setHorizontalAlignment(JLabel.LEFT);
		add(busnamelabel);
		
		busnolabel = new JLabel("Bus No: ");
		setLayout(null);
		busnolabel.setBounds(20, 85, 80, 25);
		busnolabel.setForeground(Color.yellow);
		busnolabel.setBackground(Color.BLUE);
		busnolabel.setOpaque(true);
		busnolabel.setHorizontalAlignment(JLabel.LEFT);
		add(busnolabel);
		
		fromlabel = new JLabel("From: ");
		setLayout(null);
		fromlabel.setBounds(20, 120, 80, 25);
		fromlabel.setForeground(Color.yellow);
		fromlabel.setBackground(Color.BLUE);
		fromlabel.setOpaque(true);
		fromlabel.setHorizontalAlignment(JLabel.LEFT);
		add(fromlabel);
		
		tolabel = new JLabel("To: ");
		setLayout(null);
		tolabel.setBounds(20, 155, 80, 25);
		tolabel.setForeground(Color.yellow);
		tolabel.setBackground(Color.BLUE);
		tolabel.setOpaque(true);
		tolabel.setHorizontalAlignment(JLabel.LEFT);
		add(tolabel);
		
		timelabel = new JLabel("Time: ");
		setLayout(null);
		timelabel.setBounds(20, 190, 80, 25);
		timelabel.setForeground(Color.yellow);
		timelabel.setBackground(Color.BLUE);
		timelabel.setOpaque(true);
		timelabel.setHorizontalAlignment(JLabel.LEFT);
		add(timelabel);
		
		capacitylabel = new JLabel("Capacity: ");
		setLayout(null);
		capacitylabel.setBounds(20, 225, 80, 25);
		capacitylabel.setForeground(Color.yellow);
		capacitylabel.setBackground(Color.BLUE);
		capacitylabel.setOpaque(true);
		capacitylabel.setHorizontalAlignment(JLabel.LEFT);
		add(capacitylabel);
		
		farecastlabel = new JLabel("Fare : ");
		setLayout(null);
		farecastlabel.setBounds(20, 260, 80, 25);
		farecastlabel.setForeground(Color.yellow);
		farecastlabel.setBackground(Color.BLUE);
		farecastlabel.setOpaque(true);
		farecastlabel.setHorizontalAlignment(JLabel.LEFT);
		add(farecastlabel);
		
		classlabel = new JLabel("Class: ");
		setLayout(null);
		classlabel.setBounds(20, 295, 80, 25);
		classlabel.setForeground(Color.yellow);
		classlabel.setBackground(Color.BLUE);
		classlabel.setOpaque(true);
		classlabel.setHorizontalAlignment(JLabel.LEFT);
		add(classlabel);
		
	}
	
	

	public void backgroundcolour() {
		container = this.getContentPane();
		container.setBackground(Color.BLUE);
	}
	
public static void main(String[] args) {
		
	AdminPage a = new AdminPage();
		a.setLayout(null);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setBounds(0, 0, 1035, 500);
		a.setResizable(false);
		a.setLocationRelativeTo(null);
		

	}

}
