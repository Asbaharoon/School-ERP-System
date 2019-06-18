import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImage 
{

	public static void main(String[] args) 
	{
		
		try 
		{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/image","root","");  
		              
		PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
		ps.setString(1,"sonia");  
		  
		FileInputStream fin=new FileInputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\Hydrangeas.jpg");  
		ps.setBinaryStream(2,fin,fin.available());  
		int i=ps.executeUpdate();  
		System.out.println(i+" records affected");  
		          
		con.close();  
		}
	
	   catch (Exception e) {e.printStackTrace();}  
		
	
	}

}
