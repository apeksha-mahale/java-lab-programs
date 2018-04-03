import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import com.mysql.jdbc.Statement;
public class copytest extends JFrame {
	copytest(){
		super("My JFrame Example!!");
		JLabel jlrep =new JLabel("Representative Info:");
		JLabel jl11 = new JLabel("Enter Rep no:");
		JTextField jtf11 = new JTextField();
		JLabel jl12 = new JLabel("Enter Rep Name:");
		JTextField jtf12 = new JTextField();
		JLabel jl13 = new JLabel("Enter State:");
		JTextField jtf13 = new JTextField();
		JLabel jl14 = new JLabel("Enter Commission:");
		JTextField jtf14 = new JTextField();
		JLabel jl15 = new JLabel("Enter Rate:");
		JTextField jtf15 = new JTextField();
		JButton jb1 = new JButton("Submit");
		
		JLabel jlcus =new JLabel("Customer Info:");
		JLabel jl21 = new JLabel("Enter Cust no:");
		JTextField jtf21 = new JTextField();
		JLabel jl22 = new JLabel("Enter Cust Name:");
		JTextField jtf22 = new JTextField();
		JLabel jl23 = new JLabel("Enter State:");
		JTextField jtf23 = new JTextField();
		JLabel jl24 = new JLabel("Enter Credit Limit:");
		JTextField jtf24 = new JTextField();
		JLabel jl25 = new JLabel("Enter Rep No:");
		JTextField jtf25 = new JTextField();
		JButton jb2 = new JButton("Submit");
		
		JPanel panel = new JPanel();
		final JTextArea jta = new JTextArea();
		jta.setRows(10);
		jta.setColumns(5);
		JButton jb3 = new JButton("Click");
		
		panel.add(jl11);
		panel.add(jtf11);
		panel.add(jl12);
		panel.add(jtf12);
		panel.add(jl13);
		panel.add(jtf13);
		panel.add(jl14);
		panel.add(jtf14);
		panel.add(jl15);
		panel.add(jtf15);
		panel.add(jb1);
		
		panel.add(jl21);
		panel.add(jtf21);
		panel.add(jl22);
		panel.add(jtf22);
		panel.add(jl23);
		panel.add(jtf23);
		panel.add(jl24);
		panel.add(jtf24);
		panel.add(jl25);
		panel.add(jtf25);
		panel.add(jb2);
		
		panel.add(jta);
		panel.add(jb3);
		
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Statement stmt;
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
					if(conn!=null){
						System.out.println("Connection Successfull");
						String Repno=jtf11.getText();
						String Repname=jtf12.getText();
						String state=jtf13.getText();
						String comm=jtf14.getText();
						String rt=jtf15.getText();
						stmt=(Statement)conn.createStatement();
						System.out.println(Repno+Repname+state+comm+rt);
						String q1="insert into Representative values('"	+ Repno + "','" + Repname + "','" + state
								+ "','" + comm + "','" + rt + "');";
						stmt.executeUpdate(q1);
					}
					else
						System.out.println("Connection Refused");	
				}
				catch(SQLException exx){
					System.out.println(exx.getMessage());
				}
				catch(ClassNotFoundException ex){
					System.out.println(ex.getMessage());					
				}
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Statement stmt;
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
					if(conn!=null){
						System.out.println("Connection Successfull");
						String Repno=jtf21.getText();
						String Repname=jtf22.getText();
						String state=jtf23.getText();
						String cred=jtf24.getText();
						int cr=Integer.parseInt(cred);
						String rt=jtf25.getText();
						stmt=(Statement)conn.createStatement();
						System.out.println(Repno+Repname+state+cr+rt);
						String q1="insert into Customer values('"	+ Repno + "','" + Repname + "','" + state
								+ "','" + cr + "','" + rt + "');";
						stmt.executeUpdate(q1);
					}
					else
						System.out.println("Connection Refused");	
				}
				catch(SQLException exx){
					System.out.println(exx.getMessage());
				}
				catch(ClassNotFoundException ex){
					System.out.println(ex.getMessage());					
				}
			}
		});
		
		jb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Statement stmt;
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
					if(conn!=null){
						stmt=(Statement)conn.createStatement();
						//System.out.println(Repno +Repname + state+comm+rt);
						String q3="SELECT * FROM Representative WHERE RepNo IN (SELECT RepNo FROM Customer WHERE CreditLimit > 15000 )";
						ResultSet rs=stmt.executeQuery(q3);
						while(rs.next()){
							jta.append("Representative Info");
							jta.append("\n");
							jta.append("Number");
							jta.append(rs.getString("RepNo"));
							jta.append("\n");
							jta.append("Name");
							jta.append(rs.getString("Name"));
							jta.append("\n");
							jta.append("State");
							jta.append(rs.getString("State"));
							jta.append("\n");
							jta.append(rs.getString("Commission"));
							jta.append("\n");
							jta.append("Rate:");
							jta.append(rs.getString("Rate"));
							jta.append("\n");	
						}
					}
					else
						System.out.println("Connection Refused");	
				}
				catch(SQLException exx){
					System.out.println(exx.getMessage());
				}
				catch(ClassNotFoundException ex){
					System.out.println(ex.getMessage());					
				}
			}
		});
		setContentPane(panel);
	}
public static void main(String[] args){
	copytest ts =new copytest();
	ts.getContentPane().setLayout(new BoxLayout(ts.getContentPane(),BoxLayout.Y_AXIS));
	ts.setVisible(true);
	ts.setSize(400,100);
	ts.setDefaultCloseOperation(EXIT_ON_CLOSE);
	ts.pack();
}
}