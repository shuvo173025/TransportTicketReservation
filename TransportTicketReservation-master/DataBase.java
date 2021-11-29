import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;

public class DataBase {
	ResultSet rs;
	ResultSet s;
	
	public ResultSet checkadmin(String email)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			final Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/transfortticketreservation","root", "");
			 String query = "SELECT password FROM companyadmin WHERE email='"+email+"'";
	         java.sql.Statement stm = connection.createStatement();
	         rs=stm.executeQuery(query);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
	}
	
	
	public void insertAdvancebooking(String catagory,String date,String from,String to,String time,String clas,String name,
			String phoneno,String quantity,String seatname,String seatname1,String seatname2,String seatname3,String seatname4)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/transfortticketreservation","root", "");

            String query = "INSERT INTO advancebooking VALUES ('"+catagory+"','" + date +"','" + from + "','" + to+ "','"+time+"',"
            		+ "'"+clas+"','"+name+"','"+phoneno+"','"+quantity+"','"+seatname+"','"+seatname1+"','"+seatname2+"',"
            				+ "'"+seatname3+"','"+seatname4+"')";

            java.sql.Statement stm = connection.createStatement();

            stm.executeUpdate(query);
			
		}catch(ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public void insertSchedule(String date,String busname,String busno,String from,String to,String time,String capacity,String fare,
			String clas,String catagory,String Driver,String SuperViser,String A1,String A2,String A3,String A4,String B1,String B2,
			String B3,String B4,String C1,String C2,String C3,String C4,String D1,String D2,String D3,String D4,String E1,String E2,
			String E3,String E4,String F1,String F2,String F3,String F4,String G1,String G2,String G3,String G4,String H1,String H2,
			String H3,String H4,String I1,String I2,String I3,String I4,String I5)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/transfortticketreservation","root", "");

            String query = "INSERT INTO schedule VALUES ('" + date +"','" + busname + "','" + busno+ "','"+from+"','"+to+"',"
            		+ "'"+time+"','"+capacity+"','"+fare+"','"+clas+"','"+catagory+"','" + Driver +"','" + SuperViser +"',"
            		+ "'" + A1 +"','" + A2 + "','" + A3+ "',"+ "'"+A4+"','"+B1+"','"+B2+"','"+B3+"','"+B4+"','"+C1+"','"+C2+"',"
            		+ "'" + C3 +"','" + C4 + "',"+ "'" + D1+ "','"+D2+"','"+D3+"','"+D4+"','"+E1+"','"+E2+"','"+E3+"','"+E4+"',"
            		+ "'" + F1 +"',"+ "'" + F2 + "','" + F3+ "','"+F4+"','"+G1+"','"+G2+"','"+G3+"','"+G4+"','"+H1+"',"
            		+ "'"+H2+"','"+H3+"','"+H4+"','"+I1+"','"+I2+"','"+I3+"','"+I4+"','"+I5+"')";
            
            java.sql.Statement stm = connection.createStatement();

            stm.executeUpdate(query);
			
		}catch(ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	 	public ResultSet schedule(String from,String to,String clas,String catagory)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/transfortticketreservation","root", "");
				 String query = "SELECT date,bus_name,bus_no,time FROM schedule WHERE from='"+from+"'  to='"+to+"' class='"+clas+"' "
				 		        + " catagory='"+catagory+"'";
		         java.sql.Statement stm = connection.createStatement();
		         s=stm.executeQuery(query);
		         
		         
		         
		         
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			return s;
		}	
	public static void main(String args[])
	{
//		DataBase a=new DataBase();
//		a. checkadmin("shuvo@gmail.com");
//		System.out.println("hello");
	}
}
