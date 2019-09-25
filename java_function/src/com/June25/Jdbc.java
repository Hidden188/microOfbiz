package com.June25;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {

	public static void main (String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//1.加载数据库driver，指定数据库类型
		Class.forName("com.mysql.jdbc.Driver");
		//2.获取连接
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/student",
				"root","root");
		//3.创建一个statement
		Statement st=con.createStatement();
		//创建resultset，执行sql
		ResultSet rs=st.executeQuery("select * from car");
		while(rs.next()){
			String name=rs.getString("name");
			int price=rs.getInt("price");
			System.out.println("Name:"+name+"  price:"+price);
		}
		//关闭jdbc对象
		/*注意和开的顺序相反
		 * 
		 */
		if(rs!=null)rs.close();
		if(st!=null)st.close();
		if(con!=null)con.close();
		Statement std=con.createStatement();
	}

}
