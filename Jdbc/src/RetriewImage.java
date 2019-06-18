import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriewImage {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/image","root","");  
			      
			PreparedStatement ps=con.prepareStatement("select * from imgtable");  
			ResultSet rs=ps.executeQuery();  
			if(rs.next()){//now on 1st row  
			              
			Blob b=rs.getBlob(2);//2 means 2nd column data  
			byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
			              
			FileOutputStream fout=new FileOutputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\Hydrangeas.jpg");  
			fout.write(barr);  
			              
			fout.close();  
			}//end of if  
			System.out.println("ok");  
			              
			con.close();  
			}catch (Exception e) {e.printStackTrace();  } 
		
		
		
	}

}
