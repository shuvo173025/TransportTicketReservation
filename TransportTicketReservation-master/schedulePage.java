import java.awt.Color;
import java.awt.Container;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class schedulePage extends JFrame {
	private JLabel busnamelabel;
	private JLabel busnolabel;
	private JLabel fromlabel;
	private JLabel tolabel;
	private JLabel timelabel;
	private JLabel datelabel;
	private JLabel farecastlabel;
	private JLabel classlabel;
	
	private JLabel namelabel;
	private JLabel phonelabel;
	private JLabel agelabel;
	private JLabel quantitylabel;
	private JLabel extraweightlabel;
	private JLabel seatnamelabel;
	
	private JTextField namefield;
	private JTextField phonefield;
	private JTextField agefield;
	private JTextField quantityfield;
	private JTextField extraweightfield;
	private JTextField seatnamefield,seatnamefield1,seatnamefield2,seatnamefield3,seatnamefield4;
	
	private JLabel labelA;
	private JLabel labelB;
	private JLabel labelC;
	
	private JTextField busnamefield;
	private JTextField busnofield;
	private JTextField fromfield;
	private JTextField tofield;
	private JTextField timefield;
	private JTextField datefield;
	private JTextField farecastfield;
	private JTextField classbox;
	
	private JCheckBox Driver,superviser,A1,A2,A3,A4;
	private JCheckBox B1,B2,B3,B4;
	private JCheckBox C1,C2,C3,C4;
	private JCheckBox D1,D2,D3,D4;
	private JCheckBox E1,E2,E3,E4;
	private JCheckBox F1,F2,F3,F4;
	private JCheckBox G1,G2,G3,G4;
	private JCheckBox H1,H2,H3,H4;
	private JCheckBox I1,I2,I3,I4,I5;
	
	private Container container;
	private JButton buybutton;
	private JButton confirmbutton;
	private JButton backbutton;
	private JButton returnbutton;
	private JButton advancebookingbutton;

	private JPanel panelA;
	private JPanel panelB;
	private JPanel panelC;

	private JTable scheduletable;
	private DefaultTableModel model;
	private String[] colums = {"Bus Name","Bus No","Time","Date"};
	private String[] rows = new String[4];
	
	public schedulePage(String from,String to,String clas,String Catagory) {
		
		super("All Schedule!");
		backgroundcolour();
		panelA(from,to,clas,Catagory);
		panelB();
		panelB1();
		panelC();
		label();
		actionlisten(); 
		
	}

	private void panelB1() {
		namelabel = new JLabel("Name: ");
		setLayout(null);
		namelabel.setBounds(20, 50, 80, 25);
		namelabel.setForeground(Color.yellow);
		namelabel.setBackground(Color.blue);
		namelabel.setOpaque(true);
		namelabel.setVisible(false);
		namelabel.setHorizontalAlignment(JLabel.LEFT);
		panelB.add(namelabel);
		
		phonelabel = new JLabel("Phone No: ");
		setLayout(null);
		phonelabel.setBounds(20, 85, 80, 25);
		phonelabel.setForeground(Color.yellow);
		phonelabel.setBackground(Color.blue);
		phonelabel.setOpaque(true);
		phonelabel.setHorizontalAlignment(JLabel.LEFT);
		phonelabel.setVisible(false);
		panelB.add(phonelabel);
		
		agelabel = new JLabel("Age: ");
		setLayout(null);
		agelabel.setBounds(20, 120, 80, 25);
		agelabel.setForeground(Color.yellow);
		agelabel.setBackground(Color.blue);
		agelabel.setOpaque(true);
		agelabel.setHorizontalAlignment(JLabel.LEFT);
		agelabel.setVisible(false);
		panelB.add(agelabel);
		
		quantitylabel = new JLabel("Quantity: ");
		setLayout(null);
		quantitylabel.setBounds(20, 155, 80, 25);
		quantitylabel.setForeground(Color.yellow);
		quantitylabel.setBackground(Color.blue);
		quantitylabel.setOpaque(true);
		quantitylabel.setHorizontalAlignment(JLabel.LEFT);
		quantitylabel.setVisible(false);
		panelB.add(quantitylabel);
		
		extraweightlabel = new JLabel("Extra Weight(if any): ");
		setLayout(null);
		extraweightlabel.setBounds(20, 190,150, 25);
		extraweightlabel.setForeground(Color.yellow);
		extraweightlabel.setBackground(Color.blue);
		extraweightlabel.setOpaque(true);
		extraweightlabel.setHorizontalAlignment(JLabel.LEFT);
		extraweightlabel.setVisible(false);
		panelB.add(extraweightlabel);
		
		seatnamelabel = new JLabel("Seat Name: ");
		setLayout(null);
		seatnamelabel.setBounds(20, 225, 80, 25);
		seatnamelabel.setForeground(Color.yellow);
		seatnamelabel.setBackground(Color.blue);
		seatnamelabel.setOpaque(true);
		seatnamelabel.setHorizontalAlignment(JLabel.LEFT);
		seatnamelabel.setVisible(false);
		panelB.add(seatnamelabel);
		
		
		namefield = new JTextField();
		namefield.setBounds(105, 50, 150, 25);
		namefield.setForeground(Color.BLACK);
		namefield.setBackground(Color.white);
		namefield.setHorizontalAlignment(JTextField.CENTER);
		seatnamelabel.setVisible(false);
		panelB.add(namefield);
		
		phonefield = new JTextField();
		phonefield.setBounds(105, 85, 150, 25);
		phonefield.setForeground(Color.BLACK);
		phonefield.setBackground(Color.white);
		phonefield.setHorizontalAlignment(JTextField.CENTER);
		phonefield.setVisible(false);
		panelB.add(phonefield);
		
		agefield = new JTextField();
		agefield.setBounds(105, 120, 150, 25);
		agefield.setForeground(Color.BLACK);
		agefield.setBackground(Color.white);
		agefield.setHorizontalAlignment(JTextField.CENTER);
		agefield.setVisible(false);
		panelB.add(agefield);
		
		quantityfield = new JTextField();
		quantityfield.setBounds(105, 155, 150, 25);
		quantityfield.setForeground(Color.BLACK);
		quantityfield.setBackground(Color.white);
		quantityfield.setHorizontalAlignment(JTextField.CENTER);
		quantityfield.setVisible(false);
		panelB.add(quantityfield);
		
		
		extraweightfield = new JTextField();
		extraweightfield.setBounds(140, 190, 150, 25);
		extraweightfield.setForeground(Color.BLACK);
		extraweightfield.setBackground(Color.WHITE);
		extraweightfield.setHorizontalAlignment(JTextField.CENTER);
		extraweightfield.setVisible(false);
		panelB.add(extraweightfield);
		
		
		seatnamefield = new JTextField();
		seatnamefield.setBounds(105, 225, 150, 25);
		seatnamefield.setForeground(Color.BLACK);
		seatnamefield.setBackground(Color.WHITE);
		seatnamefield.setHorizontalAlignment(JTextField.CENTER);
		seatnamefield.setVisible(false);
		panelB.add(seatnamefield);
		
		seatnamefield1 = new JTextField();
		seatnamefield1.setBounds(20, 260, 140, 25);
		seatnamefield1.setForeground(Color.BLACK);
		seatnamefield1.setBackground(Color.WHITE);
		seatnamefield1.setHorizontalAlignment(JTextField.CENTER);
		seatnamefield1.setVisible(false);
		panelB.add(seatnamefield1);
		
		seatnamefield2 = new JTextField();
		seatnamefield2.setBounds(180, 260, 140, 25);
		seatnamefield2.setForeground(Color.BLACK);
		seatnamefield2.setBackground(Color.WHITE);
		seatnamefield2.setHorizontalAlignment(JTextField.CENTER);
		seatnamefield2.setVisible(false);
		panelB.add(seatnamefield2);
		
		seatnamefield3 = new JTextField();
		seatnamefield3.setBounds(20, 295, 140, 25);
		seatnamefield3.setForeground(Color.BLACK);
		seatnamefield3.setBackground(Color.WHITE);
		seatnamefield3.setHorizontalAlignment(JTextField.CENTER);
		seatnamefield3.setVisible(false);
		panelB.add(seatnamefield3);
		
		seatnamefield4 = new JTextField();
		seatnamefield4.setBounds(180, 295, 140, 25);
		seatnamefield4.setForeground(Color.BLACK);
		seatnamefield4.setBackground(Color.WHITE);
		seatnamefield4.setHorizontalAlignment(JTextField.CENTER);
		seatnamefield4.setVisible(false);
		panelB.add(seatnamefield4);

		
	}

	private void label() {
		labelA = new JLabel("label A");
		setLayout(null);
		labelA.setBounds(5, 0, 300, 50);
		labelA.setForeground(Color.yellow);
		labelA.setBackground(Color.blue);
		labelA.setOpaque(true);
		labelA.setHorizontalAlignment(JLabel.LEFT);
		panelA.add(labelA);
		
		labelB = new JLabel("label B");
		setLayout(null);
		labelB.setBounds(5, 0, 400, 40);
		labelB.setForeground(Color.yellow);
		labelB.setBackground(Color.blue);
		labelB.setOpaque(true);
		labelB.setHorizontalAlignment(JLabel.LEFT);
		panelB.add(labelB);
		
		labelC = new JLabel("label c");
		setLayout(null);
		labelC.setBounds(5, 0, 300, 50);
		labelC.setForeground(Color.yellow);
		labelC.setBackground(Color.blue);
		labelC.setOpaque(true);
		labelC.setHorizontalAlignment(JLabel.LEFT);
		panelC.add(labelC);
		
		
	}


	private void panelA(String from,String to,String clas,String Catagory) {
		panelA = new JPanel();
		panelA.setLayout(null);
		panelA.setBounds(0, 0, 300, 500);
		panelA.setBackground(Color.blue);
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
	        scroll.setBounds(0, 50, 300, 450);
	        scroll.setOpaque(true);
	        scheduletable.setOpaque(true);
	        scroll.setBackground(Color.WHITE);
	        scheduletable.setBackground(Color.WHITE);
	        panelA.add(scroll);   
	        Object [] row;
	        
	        DataBase d = new DataBase();
	        ResultSet s =d.schedule(from,to,clas,Catagory);
	        
	        try {
				while(s.next()) {
					row = new Object[4];
					
					row[0] = s.getString(1);
					row[1] = s.getString(2);
					row[2] = s.getString(3);
					row[3] = s.getString(4);
					model.addRow(row);
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        
		
	}
	
	

	private void panelB() {
		panelB = new JPanel();
		panelB.setLayout(null);
		panelB.setBounds(300, 0, 400, 500);
		panelB.setBackground(Color.blue);
		add(panelB);
		
		
		busnamelabel = new JLabel("Bus Name: ");
		setLayout(null);
		busnamelabel.setBounds(20, 50, 80, 25);
		busnamelabel.setForeground(Color.yellow);
		busnamelabel.setBackground(Color.blue);
		busnamelabel.setOpaque(true);
		busnamelabel.setHorizontalAlignment(JLabel.LEFT);
		panelB.add(busnamelabel);
		
		busnolabel = new JLabel("Bus No: ");
		setLayout(null);
		busnolabel.setBounds(20, 85, 80, 25);
		busnolabel.setForeground(Color.yellow);
		busnolabel.setBackground(Color.blue);
		busnolabel.setOpaque(true);
		busnolabel.setHorizontalAlignment(JLabel.LEFT);
		panelB.add(busnolabel);
		
		fromlabel = new JLabel("From: ");
		setLayout(null);
		fromlabel.setBounds(20, 120, 80, 25);
		fromlabel.setForeground(Color.yellow);
		fromlabel.setBackground(Color.blue);
		fromlabel.setOpaque(true);
		fromlabel.setHorizontalAlignment(JLabel.LEFT);
		panelB.add(fromlabel);
		
		tolabel = new JLabel("To: ");
		setLayout(null);
		tolabel.setBounds(20, 155, 80, 25);
		tolabel.setForeground(Color.yellow);
		tolabel.setBackground(Color.blue);
		tolabel.setOpaque(true);
		tolabel.setHorizontalAlignment(JLabel.LEFT);
		panelB.add(tolabel);
		
		timelabel = new JLabel("Time: ");
		setLayout(null);
		timelabel.setBounds(20, 190, 80, 25);
		timelabel.setForeground(Color.yellow);
		timelabel.setBackground(Color.blue);
		timelabel.setOpaque(true);
		timelabel.setHorizontalAlignment(JLabel.LEFT);
		panelB.add(timelabel);
		
		datelabel = new JLabel("Date: ");
		setLayout(null);
		datelabel.setBounds(20, 225, 80, 25);
		datelabel.setForeground(Color.yellow);
		datelabel.setBackground(Color.blue);
		datelabel.setOpaque(true);
		datelabel.setHorizontalAlignment(JLabel.LEFT);
		panelB.add(datelabel);
		
		farecastlabel = new JLabel("Fare : ");
		setLayout(null);
		farecastlabel.setBounds(20, 260, 80, 25);
		farecastlabel.setForeground(Color.yellow);
		farecastlabel.setBackground(Color.blue);
		farecastlabel.setOpaque(true);
		farecastlabel.setHorizontalAlignment(JLabel.LEFT);
		panelB.add(farecastlabel);
		
		classlabel = new JLabel("Class: ");
		setLayout(null);
		classlabel.setBounds(20, 295, 80, 25);
		classlabel.setForeground(Color.yellow);
		classlabel.setBackground(Color.blue);
		classlabel.setOpaque(true);
		classlabel.setHorizontalAlignment(JLabel.LEFT);
		panelB.add(classlabel);
		
		

		buybutton = new JButton("Buy"); 
		buybutton.setBounds(150, 350, 80, 25);
		buybutton.setBackground(Color.GREEN);
		buybutton.setForeground(Color.red);
		buybutton.setHorizontalAlignment(JTextField.CENTER);
		panelB.add(buybutton);
		
		confirmbutton = new JButton("Confirm"); 
		confirmbutton.setBounds(150, 350, 80, 25);
		confirmbutton.setBackground(Color.GREEN);
		confirmbutton.setForeground(Color.red);
		confirmbutton.setHorizontalAlignment(JTextField.CENTER);
		confirmbutton.setVisible(false);
		panelB.add(confirmbutton);
		
		backbutton = new JButton("Back"); 
		backbutton.setBounds(50, 430, 80, 25);
		backbutton.setBackground(Color.GREEN);
		backbutton.setForeground(Color.red);
		backbutton.setHorizontalAlignment(JTextField.CENTER);
		panelB.add(backbutton);
		
		returnbutton = new JButton("Return"); 
		returnbutton.setBounds(50, 430, 80, 25);
		returnbutton.setBackground(Color.GREEN);
		returnbutton.setForeground(Color.red);
		returnbutton.setHorizontalAlignment(JTextField.CENTER);
		returnbutton.setVisible(false);
		panelB.add(returnbutton);
		
		advancebookingbutton = new JButton("Advance Booking"); 
		advancebookingbutton.setBounds(200, 430, 180, 25);
		advancebookingbutton.setBackground(Color.GREEN);
		advancebookingbutton.setForeground(Color.red);
		advancebookingbutton.setHorizontalAlignment(JTextField.CENTER);
		panelB.add(advancebookingbutton);
		
		
		
		busnamefield = new JTextField();
		busnamefield.setBounds(105, 50, 150, 25);
		busnamefield.setForeground(Color.BLACK);
		busnamefield.setBackground(Color.white);
		busnamefield.setHorizontalAlignment(JTextField.CENTER);
		panelB.add(busnamefield);
		
		busnofield = new JTextField();
		busnofield.setBounds(105, 85, 150, 25);
		busnofield.setForeground(Color.BLACK);
		busnofield.setBackground(Color.white);
		busnofield.setHorizontalAlignment(JTextField.CENTER);
		panelB.add(busnofield);
		
		fromfield = new JTextField();
		fromfield.setBounds(105, 120, 150, 25);
		fromfield.setForeground(Color.BLACK);
		fromfield.setBackground(Color.white);
		fromfield.setHorizontalAlignment(JTextField.CENTER);
		panelB.add(fromfield);
		
		tofield = new JTextField();
		tofield.setBounds(105, 155, 150, 25);
		tofield.setForeground(Color.BLACK);
		tofield.setBackground(Color.white);
		tofield.setHorizontalAlignment(JTextField.CENTER);
		panelB.add(tofield);
		
		
		timefield = new JTextField();
		timefield.setBounds(105, 190, 150, 25);
		timefield.setForeground(Color.BLACK);
		timefield.setBackground(Color.WHITE);
		timefield.setHorizontalAlignment(JTextField.CENTER);
		panelB.add(timefield);
		
		
		datefield = new JTextField();
		datefield.setBounds(105, 225, 150, 25);
		datefield.setForeground(Color.BLACK);
		datefield.setBackground(Color.WHITE);
		datefield.setHorizontalAlignment(JTextField.CENTER);
		panelB.add(datefield);

		farecastfield = new JTextField();
		farecastfield.setBounds(105, 260, 150, 25);
		farecastfield.setForeground(Color.BLACK);
		farecastfield.setBackground(Color.white);
		farecastfield.setHorizontalAlignment(JTextField.CENTER);
		panelB.add(farecastfield);
		
		classbox = new JTextField();
		classbox.setBounds(105, 295, 150, 25);
		classbox.setForeground(Color.BLACK);
		classbox.setBackground(Color.white);
		panelB.add(classbox);
		
	}
	
	
		
	
	private void panelC() {
		
		panelC = new JPanel();
		panelC.setLayout(null);
		panelC.setBounds(700, 0, 300, 500);
		panelC.setBackground(Color.blue);
		add(panelC);
		
		Driver = new JCheckBox("Driver");
		Driver.setBounds(230,50,60,25);
		Driver.setBackground(Color.blue);
		Driver.setForeground(Color.YELLOW);
		Driver.setEnabled(false);
		panelC.add(Driver);
		
		superviser = new JCheckBox("superviser");
		superviser.setBounds(20,90,100,25);
		superviser.setBackground(Color.blue);
		superviser.setForeground(Color.YELLOW);
		superviser.setEnabled(false);
		panelC.add(superviser);
		
		A1 = new JCheckBox("A1");
		A1.setBounds(20,130,40,20);
		A1.setBackground(Color.blue);
		A1.setForeground(Color.YELLOW);
		A1.setEnabled(false);
		panelC.add(A1);
		
		A2 = new JCheckBox("A2");
		A2.setBounds(80,130,40,20);
		A2.setBackground(Color.blue);
		A2.setForeground(Color.YELLOW);
		A2.setEnabled(false);
		panelC.add(A2);
		
		A3 = new JCheckBox("A3");
		A3.setBounds(180,130,40,20);
		A3.setBackground(Color.blue);
		A3.setForeground(Color.YELLOW);
		A3.setEnabled(false);
		panelC.add(A3);
		
		A4 = new JCheckBox("A4");
		A4.setBounds(240,130,40,20);
		A4.setBackground(Color.blue);
		A4.setForeground(Color.YELLOW);
		A4.setEnabled(false);
		panelC.add(A4);
		
		B1 = new JCheckBox("B1");
		B1.setBounds(20,165,40,20);
		B1.setBackground(Color.blue);
		B1.setForeground(Color.YELLOW);
		B1.setEnabled(false);
		panelC.add(B1);
		
		B2 = new JCheckBox("B2");
		B2.setBounds(80,165,40,20);
		B2.setBackground(Color.blue);
		B2.setForeground(Color.YELLOW);
		B2.setEnabled(false);
		panelC.add(B2);
		
		B3 = new JCheckBox("B3");
		B3.setBounds(180,165,40,20);
		B3.setBackground(Color.blue);
		B3.setForeground(Color.YELLOW);
		B3.setEnabled(false);
		panelC.add(B3);
		
		B4 = new JCheckBox("B4");
		B4.setBounds(240,165,40,20);
		B4.setBackground(Color.blue);
		B4.setForeground(Color.YELLOW);
		B4.setEnabled(false);
		panelC.add(B4);
		
		C1 = new JCheckBox("C1");
		C1.setBounds(20,200,40,20);
		C1.setBackground(Color.blue);
		C1.setForeground(Color.YELLOW);
		C1.setEnabled(false);
		panelC.add(C1);
		
		C2 = new JCheckBox("C2");
		C2.setBounds(80,200,40,20);
		C2.setBackground(Color.blue);
		C2.setForeground(Color.YELLOW);
		C2.setEnabled(false);
		panelC.add(C2);
		
		C3 = new JCheckBox("C3");
		C3.setBounds(180,200,40,20);
		C3.setBackground(Color.blue);
		C3.setForeground(Color.YELLOW);
		C3.setEnabled(false);
		panelC.add(C3);
		
		C4 = new JCheckBox("C4");
		C4.setBounds(240,200,40,20);
		C4.setBackground(Color.blue);
		C4.setForeground(Color.YELLOW);
		C4.setEnabled(false);
		panelC.add(C4);
		
		D1 = new JCheckBox("D1");
		D1.setBounds(20,235,40,20);
		D1.setBackground(Color.blue);
		D1.setForeground(Color.YELLOW);
		D1.setEnabled(false);
		panelC.add(D1);
		
		D2 = new JCheckBox("D2");
		D2.setBounds(80,235,40,20);
		D2.setBackground(Color.blue);
		D2.setForeground(Color.YELLOW);
		D2.setEnabled(false);
		panelC.add(D2);
		
		D3 = new JCheckBox("D3");
		D3.setBounds(180,235,40,20);
		D3.setBackground(Color.blue);
		D3.setForeground(Color.YELLOW);
		D3.setEnabled(false);
		panelC.add(D3);
		
		D4 = new JCheckBox("D4");
		D4.setBounds(240,235,40,20);
		D4.setBackground(Color.blue);
		D4.setForeground(Color.YELLOW);
		D4.setEnabled(false);
		panelC.add(D4);
		
		E1 = new JCheckBox("E1");
		E1.setBounds(20,270,40,20);
		E1.setBackground(Color.blue);
		E1.setForeground(Color.YELLOW);
		E1.setEnabled(false);
		panelC.add(E1);
		
		E2 = new JCheckBox("E2");
		E2.setBounds(80,270,40,20);
		E2.setBackground(Color.blue);
		E2.setForeground(Color.YELLOW);
		E2.setEnabled(false);
		panelC.add(E2);
		
		E3 = new JCheckBox("E3");
		E3.setBounds(180,270,40,20);
		E3.setBackground(Color.blue);
		E3.setForeground(Color.YELLOW);
		E3.setEnabled(false);
		panelC.add(E3);
		
		E4 = new JCheckBox("E4");
		E4.setBounds(240,270,40,20);
		E4.setBackground(Color.blue);
		E4.setForeground(Color.YELLOW);
		E4.setEnabled(false);
		panelC.add(E4);
		
		F1 = new JCheckBox("F1");
		F1.setBounds(20,305,40,20);
		F1.setBackground(Color.blue);
		F1.setForeground(Color.YELLOW);
		F1.setEnabled(false);
		panelC.add(F1);
		
		F2 = new JCheckBox("F2");
		F2.setBounds(80,305,40,20);
		F2.setBackground(Color.blue);
		F2.setForeground(Color.YELLOW);
		F2.setEnabled(false);
		panelC.add(F2);
		
		F3 = new JCheckBox("F3");
		F3.setBounds(180,305,40,20);
		F3.setBackground(Color.blue);
		F3.setForeground(Color.YELLOW);
		F3.setEnabled(false);
		panelC.add(F3);
		
		F4 = new JCheckBox("F4");
		F4.setBounds(240,305,40,20);
		F4.setBackground(Color.blue);
		F4.setForeground(Color.YELLOW);
		F4.setEnabled(false);
		panelC.add(F4);
		
		G1 = new JCheckBox("G1");
		G1.setBounds(20,340,40,20);
		G1.setBackground(Color.blue);
		G1.setForeground(Color.YELLOW);
		G1.setEnabled(false);
		panelC.add(G1);
		
		G2 = new JCheckBox("G2");
		G2.setBounds(80,340,40,20);
		G2.setBackground(Color.blue);
		G2.setForeground(Color.YELLOW);
		G2.setEnabled(false);
		panelC.add(G2);
		
		G3 = new JCheckBox("G3");
		G3.setBounds(180,340,40,20);
		G3.setBackground(Color.blue);
		G3.setForeground(Color.YELLOW);
		G3.setEnabled(false);
		panelC.add(G3);
		
		G4 = new JCheckBox("G4");
		G4.setBounds(240,340,40,20);
		G4.setBackground(Color.blue);
		G4.setForeground(Color.YELLOW);
		G4.setEnabled(false);
		panelC.add(G4);
		
		H1 = new JCheckBox("H1");
		H1.setBounds(20,375,40,20);
		H1.setBackground(Color.blue);
		H1.setForeground(Color.YELLOW);
		H1.setEnabled(false);
		panelC.add(H1);
		
		H2 = new JCheckBox("H2");
		H2.setBounds(80,375,40,20);
		H2.setBackground(Color.blue);
		H2.setForeground(Color.YELLOW);
		H2.setEnabled(false);
		panelC.add(H2);
		
		H3 = new JCheckBox("H3");
		H3.setBounds(180,375,40,20);
		H3.setBackground(Color.blue);
		H3.setForeground(Color.YELLOW);
		H3.setEnabled(false);
		panelC.add(H3);
		
		H4 = new JCheckBox("H4");
		H4.setBounds(240,375,40,20);
		H4.setBackground(Color.blue);
		H4.setForeground(Color.YELLOW);
		H4.setEnabled(false);
		panelC.add(H4);
		
		I1 = new JCheckBox("I1");
		I1.setBounds(20,410,40,20);
		I1.setBackground(Color.blue);
		I1.setForeground(Color.YELLOW);
		I1.setEnabled(false);
		panelC.add(I1);
		
		I2 = new JCheckBox("I2");
		I2.setBounds(80,410,40,20);
		I2.setBackground(Color.blue);
		I2.setForeground(Color.YELLOW);
		I2.setEnabled(false);
		panelC.add(I2);
		
		I3 = new JCheckBox("I3");
		I3.setBounds(180,410,40,20);
		I3.setBackground(Color.blue);
		I3.setForeground(Color.YELLOW);
		I3.setEnabled(false);
		panelC.add(I3);
		
		I4 = new JCheckBox("I4");
		I4.setBounds(240,410,40,20);
		I4.setBackground(Color.blue);
		I4.setForeground(Color.YELLOW);
		I4.setEnabled(false);
		panelC.add(I4);
		
		I5 = new JCheckBox("I5");
		I5.setBounds(130,410,40,20);
		I5.setBackground(Color.blue);
		I5.setForeground(Color.YELLOW);
		I5.setEnabled(false);
		panelC.add(I5);
	}
	
	

	public void backgroundcolour() {
		container = this.getContentPane();
		container.setBackground(Color.BLUE);
	}
	
	
	private void actionlisten() {
	backbutton.addActionListener(e->{
		FirstPage a = new FirstPage();
		a.setLayout(null);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setBounds(0, 0, 300, 400);
		a.setResizable(false);
		a.setLocationRelativeTo(null);
		dispose();
	});
	
	
	buybutton.addActionListener(e->{
		busnamelabel.setVisible(false);
		busnolabel.setVisible(false);
		fromlabel.setVisible(false);
		tolabel.setVisible(false);
		timelabel.setVisible(false);
		datelabel.setVisible(false);
		farecastlabel.setVisible(false);
		classlabel.setVisible(false);
		timefield.setVisible(false);
		datefield.setVisible(false);
		farecastfield.setVisible(false);
		classbox.setVisible(false);
		busnamefield.setVisible(false);
		busnofield.setVisible(false);
		fromfield.setVisible(false);
		tofield.setVisible(false);
		backbutton.setVisible(false);
		buybutton.setVisible(false);
		
		confirmbutton.setVisible(true);
		returnbutton.setVisible(true);
		namelabel.setVisible(true);
		phonelabel.setVisible(true);
		agelabel.setVisible(true);
		quantitylabel.setVisible(true);
		extraweightlabel.setVisible(true);
		seatnamelabel.setVisible(true);
		namefield.setVisible(true);
		phonefield.setVisible(true);
		agefield.setVisible(true);
		quantityfield.setVisible(true);
		extraweightfield.setVisible(true);
		seatnamefield.setVisible(true);
		seatnamefield1.setVisible(true);
		seatnamefield2.setVisible(true);
		seatnamefield3.setVisible(true);
		seatnamefield4.setVisible(true);
		
	});
	
	returnbutton.addActionListener(e->{
		busnamelabel.setVisible(true);
		busnolabel.setVisible(true);
		fromlabel.setVisible(true);
		tolabel.setVisible(true);
		timelabel.setVisible(true);
		datelabel.setVisible(true);
		farecastlabel.setVisible(true);
		classlabel.setVisible(true);
		timefield.setVisible(true);
		datefield.setVisible(true);
		farecastfield.setVisible(true);
		classbox.setVisible(true);
		busnamefield.setVisible(true);
		busnofield.setVisible(true);
		fromfield.setVisible(true);
		tofield.setVisible(true);
		backbutton.setVisible(true);
		buybutton.setVisible(true);
		
		confirmbutton.setVisible(false);
		returnbutton.setVisible(false);
		namelabel.setVisible(false);
		phonelabel.setVisible(false);
		agelabel.setVisible(false);
		quantitylabel.setVisible(false);
		extraweightlabel.setVisible(false);
		seatnamelabel.setVisible(false);
		namefield.setVisible(false);
		phonefield.setVisible(false);
		agefield.setVisible(false);
		quantityfield.setVisible(false);
		extraweightfield.setVisible(false);
		seatnamefield.setVisible(false);
		seatnamefield1.setVisible(false);
		seatnamefield2.setVisible(false);
		seatnamefield3.setVisible(false);
		seatnamefield4.setVisible(false);
	});
	
	advancebookingbutton.addActionListener(e->{
		advancebooking a = new advancebooking();
		a.setVisible(true);
		dispose();
	});
	
	
	confirmbutton.addActionListener(e->{
		BillSection a = new BillSection();
		a.setVisible(true);
		dispose();
	});
	
		
	}
	
	
	


	public static void main(String[] args) {

		schedulePage a = new schedulePage(null,null,null,null);
		a.setLayout(null);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setBounds(0, 0, 1000, 500);
		a.setResizable(false);
		a.setLocationRelativeTo(null);
	}

}
