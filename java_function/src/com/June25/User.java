package com.June25;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
	String name;
	int age;
	float height;
	float weight;
	String password;
	String lname;

	public void selecting(User user) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/user", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from user");
		while (rs.next()) {
			user.name = rs.getString("name");
			user.age = rs.getInt("age");
			user.height = rs.getFloat("height");
			user.weight = rs.getFloat("weight");
			user.password = rs.getString("password");
			user.lname = rs.getString("lname");
		}
		if (rs != null)
			rs.close();
		if (st != null)
			st.close();
		if (con != null)
			con.close();
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		User user1=new User();
		user1.selecting(user1);
		System.out.println("user1   name:"+user1.name);
		
		User user2=new User();
		User user3=new User();
		User user4=new User();
		User user5=new User();
		
	}
}