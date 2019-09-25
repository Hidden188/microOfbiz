package com.June25;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/student","root","root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from student");
	while(rs.next()){
		String name=rs.getString("name");
		int id=rs.getInt("id");
		int age=rs.getInt("age");
		float height=rs.getFloat("height");
		float weight=rs.getFloat("weight");
		System.out.println("name"+name+" id"+id+" age"+age+" height"+height+" weight"+weight);
	}
	if(rs!=null)rs.close();
	if(st!=null)st.close();
	if(con!=null)con.close();
	Statement std=con.createStatement();
	}

}
