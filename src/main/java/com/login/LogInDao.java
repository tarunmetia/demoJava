package com.login;
import java.sql.*;

import com.data.model.LogInVar;

public class LogInDao {
	public LogInVar getLogInVar (String uname, String pwd) {
		LogInVar l1 = new LogInVar();
//		l1.setUname("Tarun");
//		l1.setPwd("test1");
//		System.out.println(l1);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/demodb";
			Connection Con = DriverManager.getConnection(url,"root","admin");
			String sqlQuery="SELECT * FROM regusers WHERE uname=? AND pwd=?";
			PreparedStatement st = Con.prepareStatement(sqlQuery);
			st.setString(1, uname);
			st.setString(2, pwd);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				l1.setUname(rs.getString("fname"));
				return l1;				
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
