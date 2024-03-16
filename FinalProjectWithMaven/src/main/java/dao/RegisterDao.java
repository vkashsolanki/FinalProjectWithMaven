package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
import dbconn.ConnectionProvider;
import dto.Register;
import dto.RegisterBean;

public class RegisterDao 
{

	
	public String userRegister(Register bean)
	{
	
		
		try {
			Connection con=ConnectionProvider.getConnection();
			PreparedStatement preparedStatement=con.prepareStatement("select * from user1 where email=?");
			preparedStatement.setString(1, bean.getEmail());
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				return "exist";
			}
			else
			{
				PreparedStatement preparedStatement1=con.prepareStatement("insert into user1 values(?,?,?,?)");
				preparedStatement1.setString(1,bean.getName());
				preparedStatement1.setString(2,bean.getEmail());
				preparedStatement1.setString(3,bean.getMobile());
				preparedStatement1.setString(4,bean.getPassword());
				int i=preparedStatement1.executeUpdate();
				if(i>0)
				return "success";
				else
				return "fail";	
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		return "fail";
		
		
	}
	
}
