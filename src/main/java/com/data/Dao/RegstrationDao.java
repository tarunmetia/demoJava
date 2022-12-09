package com.data.Dao;
import java.sql.*;

import com.data.model.RegistrationVarModel;


public class RegstrationDao {
	public int RegisterEmpl (RegistrationVarModel employee) {
		String sqlQuery= "INSERT INTO regusers" +
				"(fname, lname, email, uname, pwd) values" +
				" (?,?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/demodb";
			Connection Con = DriverManager.getConnection(url,"root","admin");
			PreparedStatement st = Con.prepareStatement(sqlQuery);
			st.setString(1, employee.getFname());
			st.setString(2, employee.getLname());
			st.setString(3, employee.getEmail());
			st.setString(4, employee.getUname());
			st.setString(5, employee.getPwd());
			int result = st.executeUpdate();
			return result;
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

}
