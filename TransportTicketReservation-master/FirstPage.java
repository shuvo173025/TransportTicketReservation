import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class FirstPage extends JFrame{
	private JLabel formlabel;
	private JLabel tolabel;
	private JLabel classlabel;
	private JLabel emaillabel;
	private JLabel passwordlabel;
	
	private JTextField fromfield;
	private JTextField tofield;
	private JTextField emailfield;
	private JComboBox classfield;
	private JPasswordField passwordfield;
	
	private JButton submit;
	private JButton admin;
	private JButton login;
	private JButton back;
	
	
	private JRadioButton bus;
	private JRadioButton train;
	private JRadioButton air;
	private ButtonGroup group;
	private String[] classBTA= {"First Class","business","Economy"};
	
	private Container container;
	public String Catagory;
	
	public FirstPage() {
		
		super("Welcome Here!");
		backgroundcolour();
		label();
		textfield();
		radiobutton();
		button();
		actionlistener();
		
	}


	public void backgroundcolour() {
		container = this.getContentPane();
		container.setBackground(Color.BLUE);
	}
	
	
private void label() {
			formlabel = new JLabel("From : ");
			setLayout(null);
			formlabel.setBounds(20, 40, 80, 25);
			formlabel.setForeground(Color.yellow);
			formlabel.setBackground(Color.BLUE);
			formlabel.setOpaque(true);
			formlabel.setHorizontalAlignment(JLabel.CENTER);
			add(formlabel);
			
			emaillabel = new JLabel("Email : ");
			setLayout(null);
			emaillabel.setBounds(20, 80, 80, 25);
			emaillabel.setForeground(Color.yellow);
			emaillabel.setBackground(Color.BLUE);
			emaillabel.setOpaque(true);
			emaillabel.setHorizontalAlignment(JLabel.CENTER);
			emaillabel.setVisible(false);
			add(emaillabel);
			
			tolabel = new JLabel("To : ");
			setLayout(null);
			tolabel.setBounds(20, 80, 80, 25);
			tolabel.setForeground(Color.YELLOW);
			tolabel.setBackground(Color.BLUE);
			tolabel.setOpaque(true);
			tolabel.setHorizontalAlignment(JLabel.CENTER);
			add(tolabel);
			
			
			passwordlabel = new JLabel("Password : ");
			setLayout(null);
			passwordlabel.setBounds(20, 120, 80, 25);
			passwordlabel.setForeground(Color.yellow);
			passwordlabel.setBackground(Color.BLUE);
			passwordlabel.setOpaque(true);
			passwordlabel.setHorizontalAlignment(JLabel.CENTER);
			passwordlabel.setVisible(false);
			add(passwordlabel);
			

			classlabel = new JLabel("class : ");
			setLayout(null);
			classlabel.setBounds(20, 120, 80, 25);
			classlabel.setForeground(Color.yellow);
			classlabel.setBackground(Color.BLUE);
			classlabel.setOpaque(true);
			classlabel.setHorizontalAlignment(JLabel.CENTER);
			add(classlabel);
			
			
			
	}


private void textfield() {
	
	fromfield = new JTextField();
	fromfield.setBounds(105, 40, 150, 25);
	fromfield.setForeground(Color.BLACK);
	fromfield.setBackground(Color.WHITE);
	fromfield.setHorizontalAlignment(JTextField.CENTER);
	add(fromfield);
	
	
	emailfield = new JTextField();
	emailfield.setBounds(105, 80, 150, 25);
	emailfield.setForeground(Color.BLACK);
	emailfield.setBackground(Color.WHITE);
	emailfield.setHorizontalAlignment(JTextField.LEFT);
	emailfield.setVisible(false);
	add(emailfield);
	
	
	tofield = new JTextField();
	tofield.setBounds(105, 80, 150, 25);
	tofield.setForeground(Color.BLACK);
	tofield.setBackground(Color.WHITE);
	tofield.setHorizontalAlignment(JTextField.CENTER);
	add(tofield);
	
	
	passwordfield = new JPasswordField();
	passwordfield.setBounds(105, 120, 150, 25);
	passwordfield.setForeground(Color.BLACK);
	passwordfield.setBackground(Color.WHITE);
	passwordfield.setHorizontalAlignment(JTextField.LEFT);
	passwordfield.setVisible(false);
	add(passwordfield);
	
	classfield = new JComboBox(classBTA);
	classfield.setBounds(105, 120, 150, 25);
	classfield.setForeground(Color.BLACK);
	classfield.setBackground(Color.white);
	add(classfield);
	
}


private void radiobutton() {
	group = new ButtonGroup();
	
	
	bus = new JRadioButton("Bus");
	bus.setBounds(65, 160, 180, 25);
	bus.setBackground(Color.BLUE);
	bus.setForeground(Color.YELLOW);
	add(bus);
	group.add(bus);
	
	train = new JRadioButton("Train");
	train.setBounds(65, 185, 180, 25);
	train.setBackground(Color.BLUE);
	train.setForeground(Color.YELLOW);
	add(train);
	group.add(train);
	
	air = new JRadioButton("Air");
	air.setBounds(65, 210, 180, 25);
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

	private void button() {
		
		submit = new JButton("Submit"); 
		submit.setBounds(120, 245, 100, 25);
		submit.setBackground(Color.GREEN);
		submit.setForeground(Color.red);
		submit.setHorizontalAlignment(JTextField.CENTER);
		add(submit);
		
		login = new JButton("Log in"); 
		login.setBounds(120, 200, 100, 25);
		login.setBackground(Color.GREEN);
		login.setForeground(Color.red);
		login.setHorizontalAlignment(JTextField.CENTER);
		login.setVisible(false);
		add(login);
		
		admin = new JButton("Admin"); 
		admin.setBounds(20, 340, 100, 25);
		admin.setBackground(Color.GREEN);
		admin.setForeground(Color.red);
		admin.setHorizontalAlignment(JTextField.CENTER);
		add(admin);
		
		
		back = new JButton("Back"); 
		back.setBounds(20, 340, 100, 25);
		back.setBackground(Color.GREEN);
		back.setForeground(Color.red);
		back.setHorizontalAlignment(JTextField.CENTER);
		add(back);
	}

	
	private void actionlistener() {
		
		admin.addActionListener(e->{
			formlabel.setVisible(false);
			tolabel.setVisible(false);
			submit.setVisible(false);
			fromfield.setVisible(false);
			classfield.setVisible(false);
			tofield.setVisible(false);
			bus.setVisible(false);
			train.setVisible(false);
			air.setVisible(false);
			admin.setVisible(false);
			
			emaillabel.setVisible(true);
			emailfield.setVisible(true);
			passwordlabel.setVisible(true);
			passwordfield.setVisible(true);
			login.setVisible(true);
			back.setVisible(true);
			
		});
		
		back.addActionListener(e->{
			formlabel.setVisible(true);
			tolabel.setVisible(true);
			submit.setVisible(true);
			fromfield.setVisible(true);
			classfield.setVisible(true);
			tofield.setVisible(true);
			bus.setVisible(true);
			train.setVisible(true);
			air.setVisible(true);
			admin.setVisible(true);
			
			emaillabel.setVisible(false);
			emailfield.setVisible(false);
			passwordlabel.setVisible(false);
			passwordfield.setVisible(false);
			login.setVisible(false);
			back.setVisible(false);
		});
		
		login.addActionListener(e->{
			String email = emailfield.getText();
			DataBase a= new DataBase();
			ResultSet user=a.checkadmin(email);
			try {
				String password = new String(passwordfield.getPassword());
				if(user.next()) {
					
					if(user.getString("password").equals(password)) {
						AdminPage b = new AdminPage();
						b.setLayout(null);
						b.setVisible(true);
						b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						b.setBounds(0, 0, 1035, 500);
						b.setResizable(false);
						b.setLocationRelativeTo(null);
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid password");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Admin not found");
				}
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

			
		});
		
		submit.addActionListener(e->{
			String from = fromfield.getText();
			String to = tofield.getText();
			String clas = classfield.getSelectedItem().toString();
			
			if(from.isEmpty()||to.isEmpty()||clas.isEmpty()||Catagory.isEmpty()) {
				
				JOptionPane.showMessageDialog(null, "Empty Input");
			}
			else {
				schedulePage a = new schedulePage( from, to, clas, Catagory);
				a.setLayout(null);
				a.setVisible(true);
				a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				a.setBounds(0, 0, 1000, 500);
				a.setResizable(false);
				a.setLocationRelativeTo(null);
			}
			
		});
		
	}


	public static void main(String[] args) {
		
		FirstPage a = new FirstPage();
		a.setLayout(null);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setBounds(0, 0, 300, 400);
		a.setResizable(false);
		a.setLocationRelativeTo(null);
		

	}

}
